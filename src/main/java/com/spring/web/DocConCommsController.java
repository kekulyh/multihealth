package com.spring.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.Consultation;
import com.spring.domain.DocConsultComm;
import com.spring.domain.Doctor;
import com.spring.service.ConsultationModel;
import com.spring.service.DocConsultCommModel;

@Controller
public class DocConCommsController {
	@Resource(name="docconcommsService")
	private DocConsultCommModel docconcommsService;
	@Resource(name="consultService")
	private ConsultationModel consultService;
	
	@RequestMapping(value="adddoccomm", method=RequestMethod.POST)
	public String addDocComms(HttpServletRequest request){
		DocConsultComm docconcomm = new DocConsultComm();
		Consultation consult = (Consultation) request.getSession().getAttribute("con");
		Doctor d = (Doctor) request.getSession().getAttribute("doctor");
		consult.setDoctorid("Solved");
		docconcomm.setConsult(consult);
		docconcomm.setDoccomms(request.getParameter("docconcomms"));
		docconcomm.setDoctor(d);
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String time1 = dateFormat.format(now);
		docconcomm.setDoccondate(time1);
		consultService.update(consult);
		docconcommsService.add(docconcomm);

		int total_record = consult.getRecordnum();

		consult.setRecordnum(total_record + 1);
		consult.setListupdatetime(time1);
		 consultService.update(consult);
  	    return "redirect:/viewdoccondetail";
	}

}
