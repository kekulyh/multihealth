package com.spring.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.domain.ConsultComms;
import com.spring.domain.Consultation;

import com.spring.domain.User;
import com.spring.service.ConsultCommsModel;
import com.spring.service.ConsultationModel;

@Controller

public class ConsultCommsController {
	@Resource(name="concommsService")
	private ConsultCommsModel concommsService;
	@Resource(name="consultService")
	private ConsultationModel consultService;
	
	@RequestMapping(value="addconcomm", method=RequestMethod.POST)
	public String addConComms(HttpServletRequest request){
		ConsultComms comms = new ConsultComms();
		//User user = (User) request.getSession().getAttribute("user");
		Consultation consult = (Consultation)request.getSession().getAttribute("con");
		int total_record = consult.getRecordnum();
		
		consult.setRecordnum(total_record+1);
		
		User user = (User)request.getSession().getAttribute("user");
		//System.out.println(user.getConcomms().size());
		//user.setConcomms(null);
		System.out.println(user.getName());
		Date now = new Date(); 
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  	    String time1 = dateFormat.format( now ); 
  	    consult.setListupdatetime(time1);
  	    consultService.update(consult);
		String concomms = request.getParameter("concomms");
		comms.setCommconcents(concomms);
		comms.setCommdate(time1);
		comms.setUser(user);
		comms.setConsult(consult);
		concommsService.add(comms);
		
		return "redirect:/viewcon1";
	}
	
	@RequestMapping(value="addconcomm1", method=RequestMethod.POST)
	public String addConComms1(@RequestParam(value="commid",required=false) Integer id,HttpServletRequest request){
		
		ConsultComms commsorg = concommsService.queryOne("ConsultComms", id);
		
		ConsultComms comms = new ConsultComms();
		//ConsultComms comm = (ConsultComms) request.getSession().getAttribute("comm");
		Consultation consult = (Consultation)request.getSession().getAttribute("con");
		int total_record = consult.getRecordnum();
		consult.setRecordnum(total_record+1);
		
		Date now = new Date(); 
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  	    String time1 = dateFormat.format( now ); 
		String concomms = request.getParameter("concommsrep");
		//String reptitle = request.getParameter("reptitle");
		User user = (User)request.getSession().getAttribute("user");
		comms.setCommconcents("<blockquote><footer>"+commsorg.getUser().getName()+" said at "+ commsorg.getCommdate()+
				" :"+"</footer>"+ commsorg.getCommconcents()+"</blockquote>"+concomms);
		//System.out.println(reptitle+"    "+concomms);
		comms.setCommdate(time1);
		consult.setListupdatetime(time1);
		consultService.update(consult);
		comms.setUser(user);
		comms.setConsult(consult);
		comms.setConsultcomms(commsorg);
		concommsService.add(comms);
		return "redirect:/viewcon1";
	}
	

}
