package com.spring.web;

import java.io.File;



import java.io.IOException;

import java.util.Iterator;
import java.util.List;





import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.spring.domain.Appointment;
import com.spring.domain.ConsultComms;
import com.spring.domain.Consultation;
import com.spring.domain.Doctor;
import com.spring.domain.NewsComms;
import com.spring.domain.PharmacyUser;
import com.spring.domain.User;
import com.spring.service.AppointmentModel;
import com.spring.service.ConsultCommsModel;
import com.spring.service.ConsultationModel;
import com.spring.service.DoctorModel;
import com.spring.service.NewsCommsModel;
import com.spring.service.NewsModel;
import com.spring.service.PharmacyUserService;
import com.spring.service.UserModel;

@Controller

//@RequestMapping(value="/user/**")

public class UserController {
	@Resource(name="userService")
	private UserModel userService;
	@Resource(name="doctorService")
	private DoctorModel doctorService;
	@Resource(name="consultService")
	private ConsultationModel consultService;
	@Resource(name="concommsService")
	private ConsultCommsModel concommsService;
	@Resource(name="newsService")
	private NewsModel newsService;
	@Resource(name="newscommsService")
	private NewsCommsModel newscommsService; 
	@Resource(name="appointmentService")
	private AppointmentModel appointmentService;
	@Autowired
	private PharmacyUserService pharmacyUserService;
	
	
	//private User user;
	private String path;
	private String realpath;
	private int uid;
	private String fileName;
	
	
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}


	public String getRealpath() {
		return realpath;
	}

	public void setRealpath(String realpath) {
		this.realpath = realpath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

//	@RequestMapping(value="/upload2")
//	public String addUser(Model uiModel){
//		return "upload2";
//	}
	@RequestMapping(value="/register")
	public String jumpReg(){
		return "register";
	}
	
	@RequestMapping(value="/upload2",method=RequestMethod.POST)
	 public String upLoad2(@RequestParam("myfile") MultipartFile myfile,HttpServletRequest request) throws IllegalStateException, IOException{
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		
		User u1 = userService.rearchUser(multipartRequest.getParameter("name"));
		System.out.println("NNN:"+multipartRequest.getParameter("name"));
		if(u1 == null){
			
			realpath = "/Users/LYH/Documents/workspace-sts-3.7.0.RELEASE/Testtest/src/main/webapp/pic";
			
//			realpath = "A:/Springworkspace-sts-3.7.0.RELEASE/Testtest/src/main/webapp/pic";
			
			File file = new File(realpath);
		
			if(!file.exists()){
				file.mkdir();
			}
			PharmacyUser pu = new PharmacyUser();
			User u = new User();
			u.setName(multipartRequest.getParameter("name"));
			System.out.println("Name:"+multipartRequest.getParameter("name"));
			u.setPassword(multipartRequest.getParameter("password"));
			u.setTel(multipartRequest.getParameter("tel"));
			u.setEmail(multipartRequest.getParameter("email"));
			u.setDescription(multipartRequest.getParameter("description"));
			
			
			
		  //����������request��������
			
		  CommonsMultipartResolver multipartResolver = 
		    new CommonsMultipartResolver(request.getSession().getServletContext()); 
		  //���ж�request���Ƿ����multipart���͵����ݣ�
		  if(multipartResolver.isMultipart(request)){
		   //�ٽ�request�е�����ת����multipart���͵�����
		   MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
		   Iterator iter = multiRequest.getFileNames();
		   if(iter.hasNext()){
		    MultipartFile file1 = multiRequest.getFile((String)iter.next());
		    if(file1 != null){
		     fileName = file1.getOriginalFilename();
		     path = realpath+"/"+file1.getOriginalFilename();
		    // System.out.println("path"+path);
		     File localFile = new File(path);
		     //д�ļ�������
		     file1.transferTo(localFile);
		    }
		   }
		   }
		  String path1 = request.getContextPath();
		  u.setAttachment(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+"/pic"+"/"+fileName);
		  
		  userService.add(u);
		  
		  User user_p = userService.rearchUser(multipartRequest.getParameter("name"));
		  if(user_p != null){
			  pu.setUser(user_p);
			pu.setPharmacyUserName(multipartRequest.getParameter("name"));
			  pharmacyUserService.addPharmacyUser(pu);
		  }
		  
		  
		 
			 return "index";
			
		}else{
			System.out.println("USerNUll");
			//�û����Ѵ��ڣ�����usernameExist
			
			String alertRegister = "usernameExist";
			request.getSession().setAttribute("alertRegister", alertRegister);
			return "register";
		}
		
		
	     
        
	  
	 }
	
	
	
	@RequestMapping(value="/userlogin",method=RequestMethod.POST)
	public String loginUser(HttpServletRequest request,HttpServletResponse response){
		String role = request.getParameter("loginrole");
		if(role.equals("User")){
		User user = new User();
		user.setName(request.getParameter("name"));
		//System.out.println("Ma"+request.getParameter("name"));
	    user.setPassword(request.getParameter("password"));
		User a1 = this.userService.login(user);
		if(a1!=null){
			request.getSession().setAttribute("user", a1);
			return "index0";
		}else
			return "index";
		
		}else {
			Doctor d = new Doctor();
			d.setName(request.getParameter("name"));
			d.setPassword(request.getParameter("password"));
			Doctor d1 = doctorService.login(d);
			if(d1 != null){
				request.getSession().setAttribute("doctor", d1);
				return "index0";
			}else
				return "index";
			
		}
	}
	
	
	@RequestMapping(value="/mental")
	public String MainPage(HttpServletRequest request){
		User u = (User)request.getSession().getAttribute("user");
		if(u != null){
			return "index1";
		}
		return "index2";
		
	}
	
	@RequestMapping(value="verify",method=RequestMethod.GET)
	public String verifyUser(HttpServletRequest request){
		//MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
		User u = (User)request.getSession().getAttribute("user");
		System.out.println("UID"+uid);
		if(u != null){
			return "redirect:/listdoctor";
		}else{
			
			return "index";
		}
		
	}
	
	@RequestMapping(value="gotoapp",method=RequestMethod.GET)
	public String gotoAppointment(){
		return "redirect:/listdoctor";
	}
	
	@RequestMapping(value="music")
	public String softMusic(){
		return "music";
	}
	
	@RequestMapping(value="personallistcon")
	public String personalConlist(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute("user");
		List<Consultation> conlist = consultService.personalConList(user.getId());
		List<ConsultComms> concommlist = concommsService.personalConComms(user.getId());
		List<NewsComms> newscomms = newscommsService.personalNewsComms(user.getId());
		//System.out.println(newscomms.get(0).getNews().getTitle());
		if(conlist != null&&conlist.size()>0){
			request.getSession().setAttribute("conlist", conlist);
		}else if(conlist == null){
			request.getSession().setAttribute("conlist", null);
		}
		if(concommlist != null&&concommlist.size()>0 ){
			request.getSession().setAttribute("concommlist", concommlist);
		}else if(concommlist == null){
			request.getSession().setAttribute("concommlist", null);
		}
		if(newscomms != null && newscomms.size()>0){
			request.getSession().setAttribute("newscomms", newscomms);
		}else if(newscomms == null){
			request.getSession().setAttribute("newscomms", null);
		}
//		if(conlist.size()>0 && conlist != null || concommlist.size()>0 && concommlist != null || newscomms.size()>0 && newscomms != null){
//		request.getSession().setAttribute("conlist", conlist);
//		request.getSession().setAttribute("concommlist", concommlist);
//		request.getSession().setAttribute("newscomms", newscomms);
//		}
		return "personallist";
		
	}
	
	@RequestMapping(value="consultproblem")
	public String consultProblem(){
		return "consultation";
	}
	
	@RequestMapping(value="userapplist")
	public String listAllUserAppointments(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute("user");
		List<Appointment>applist = appointmentService.userListAppointment(user.getId());
		request.getSession().setAttribute("applist", applist);
		return "userspersonalapplist";
	}
	
	@RequestMapping(value="/userlogout")
	public String userLogout(HttpServletRequest request){
		HttpSession session1 = request.getSession();
		  
		session1.invalidate();
		return "index";
	}
	
	
}
