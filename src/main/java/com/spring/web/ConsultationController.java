package com.spring.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.domain.ConsultComms;
import com.spring.domain.Consultation;
import com.spring.domain.DocConsultComm;
import com.spring.domain.News;
import com.spring.domain.NewsComms;
import com.spring.domain.User;
import com.spring.service.ConsultCommsModel;
import com.spring.service.ConsultationModel;
import com.spring.service.DocConsultCommModel;
import com.spring.util.HibernatePage;

@Controller
@Transactional
public class ConsultationController {
	@Resource(name="consultService")
	private ConsultationModel consultService;
	@Resource(name="concommsService")
	private ConsultCommsModel concommsService;
	@Resource(name="docconcommsService")
	private DocConsultCommModel docconcommsService;
	
	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	private HibernatePage hPage;
	
	
	
	public HibernatePage gethPage() {
		return hPage;
	}

	public void sethPage(HibernatePage hPage) {
		this.hPage = hPage;
	}

	@RequestMapping(value="/consultverify")
	public String consultJump(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		if(user != null){
			return "redirect:/consultlist";
		}
		return "index";
	}
	
	//Add Consult
	@RequestMapping(value="/addconsult")
	public String addConsultation(HttpServletRequest request){
		String checkBox = request.getParameter("anony");
		System.out.println("checkbox"+checkBox);
		
		User user = (User) request.getSession().getAttribute("user");
		Consultation con = new Consultation();
		Date now = new Date(); 
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  	    String time1 = dateFormat.format( now ); 
		con.setTitle(request.getParameter("title"));
		con.setContents(request.getParameter("contents"));
		con.setUser(user);
		con.setCdate(time1);
		if(checkBox != "1"){
			con.setAnonymous(user.getName());
		}else{
			con.setAnonymous("Anonymous");
		}
		
		con.setRecordnum(0);
		consultService.add(con);
		return "redirect:/consultlist";
		
	}
	
	@RequestMapping(value="/consultlist")
	public String listConsultation(HttpServletRequest request){
		List<Consultation> clist = consultService.queryAll("from Consultation order by id desc");
		//Consultation con = new Consultation();
//		if(clist != null){
//		for(int i = 0; i<clist.size(); i++){
//			if (clist.get(i).getAnonymous().equals("1") || clist.get(i).getAnonymous().equals("Anonymous") ){
//				clist.get(i).setAnonymous("Anonymous");
//				consultService.update(clist.get(i));
//			}else if(clist.get(i).getAnonymous().equals(null)){
//				clist.get(i).setAnonymous(clist.get(i).getUser().getName());
//				consultService.update(clist.get(i));
//			}
//		}
//		}
		request.getSession().setAttribute("clist", clist);	
		return "conlist";
	}
	@RequestMapping(value="viewcon")
	public String viewConsultation(@RequestParam(value="cid",required=false) Integer id, HttpServletRequest request){
		Consultation con = consultService.queryOne("Consultation", id);
		request.getSession().setAttribute("con", con);
		return "redirect:/viewcondetail";
	}

	@RequestMapping(value="viewdoccon")
	public String viewDocConsultation(@RequestParam(value="cid",required=false) Integer id, HttpServletRequest request){
		Consultation con = consultService.queryOne("Consultation", id);
		request.getSession().setAttribute("con", con);
		return "redirect:/viewdoccondetail";
	}
	
	@RequestMapping(value="viewdoccondetail",method=RequestMethod.GET)
	public String viewDocConMore(@RequestParam(value="cpage",required=false)  Integer cpage, HttpServletRequest request){
		if(cpage==null){
			cpage=1;
		}
		Session session = sessionFactory.getCurrentSession();
		Consultation con = (Consultation)request.getSession().getAttribute("con");
		//Criteria criteria = session.createCriteria(NewsComms.class);
		//List<ConsultComms>conlist = concommsService.queryConComms(con.getId());
		List<DocConsultComm>docconlist = docconcommsService.queryDocConComms(con.getId());
		//int total = conlist.size();
		int pageSize = 2;
		int firstResultIndex=pageSize*(cpage-1);
		System.out.println("FIRST"+firstResultIndex);
		List <ConsultComms>list = concommsService.h_Page("select a from com.spring.domain.ConsultComms a where a.consult.id="+con.getId()+" order by id desc", firstResultIndex, pageSize);
		//System.out.println(list.get(0).getCommcontents());
		List<String> listimg = new ArrayList<String>();
		String path1 = request.getContextPath();
		for(int i = 0;i<list.size();i++){
			String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+list.get(i).getUser().getAttachment();
			System.out.println("BASEpath"+basePath);
			listimg.add(basePath);
		}
		
		request.getSession().setAttribute("listimg", listimg);
		request.getSession().setAttribute("list", list);
		request.getSession().setAttribute("cpage", cpage);
		request.getSession().setAttribute("docconlist", docconlist);
		return "condetaildoc";
	}
	
	@RequestMapping(value="viewcondetail",method=RequestMethod.GET)
	public String viewConMore(@RequestParam(value="cpage",required=false)  Integer cpage, HttpServletRequest request){
		if(cpage==null){
			cpage=1;
		}
		Session session = sessionFactory.getCurrentSession();
		Consultation con = (Consultation)request.getSession().getAttribute("con");
		List<DocConsultComm>docconlist = docconcommsService.queryDocConComms(con.getId());
		//Criteria criteria = session.createCriteria(NewsComms.class);
		//List<ConsultComms>conlist = concommsService.queryConComms(con.getId());
		//int total = conlist.size();
		int pageSize = 2;
		int firstResultIndex=pageSize*(cpage-1);
		System.out.println("FIRST"+firstResultIndex);
		List <ConsultComms>list = concommsService.h_Page("select a from com.spring.domain.ConsultComms a where a.consult.id="+con.getId()+" order by id desc", firstResultIndex, pageSize);
		//System.out.println(list.get(0).getCommcontents());
		List<String> listimg = new ArrayList<String>();
		String path1 = request.getContextPath();
		for(int i = 0;i<list.size();i++){
			String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+list.get(i).getUser().getAttachment();
			System.out.println("BASEpath"+basePath);
			listimg.add(basePath);
		}
		request.getSession().setAttribute("count", list.size());
		request.getSession().setAttribute("listimg", listimg);
		request.getSession().setAttribute("list", list);
		request.getSession().setAttribute("cpage", cpage);
		request.getSession().setAttribute("docconlist", docconlist);
		return "conspecific";
	}
	
	
	@RequestMapping(value = "viewcon1")
	public String viewCon(HttpServletRequest request) {
		Consultation con = (Consultation) request.getSession().getAttribute("con");
		request.getSession().setAttribute("con", con);
		return "redirect:/viewcondetail";
	}
	
	@RequestMapping(value="solveconsult")
	public String solveConsultation(HttpServletRequest request){
		List<Consultation> clist = consultService.queryAll("from Consultation order by id");
		//List<ConsultComms>commlist = concommsService.qu
		Consultation con = new Consultation();
		
		for(int i = 0; i<clist.size(); i++){
			if (clist.get(i).getAnonymous().equals("1") || clist.get(i).getAnonymous().equals("Anonymous") ){
				clist.get(i).setAnonymous("Anonymous");
				consultService.update(clist.get(i));
			}else{
				clist.get(i).setAnonymous(clist.get(i).getUser().getName());
				consultService.update(clist.get(i));
			}
		}
		request.getSession().setAttribute("clist", clist);	
		return "docconlist";
	}
	
	@RequestMapping(value="consultsearch")
	public String searchConsultation(HttpServletRequest request){
		String str = request.getParameter("findconsult");
		List<Consultation> consultlist = consultService.searchConsultByTitle(str);
		request.getSession().setAttribute("consultlist", consultlist);
		User user = (User) request.getSession().getAttribute("user");
		if(user != null){
			return "searchcon";
		}
		return "searchcondoc";
	}

}
