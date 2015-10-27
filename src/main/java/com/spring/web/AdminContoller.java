package com.spring.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.Admin;
import com.spring.service.AdminModel;
import com.spring.service.impl.AdminModelImpl;

@Controller
//@RequestMapping(value="/admin/**")

public class AdminContoller {
	@Resource(name="adminService")
	//@Autowired
	private AdminModel adminService = new AdminModelImpl();
	
	@RequestMapping(value="/login")
	public String loginAdmin(Model uiModel){
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginAdmin(HttpServletRequest request){
		Admin admin = new Admin();
		admin.setName(request.getParameter("name"));
		System.out.println("Ma"+request.getParameter("name"));
		admin.setPassword(request.getParameter("password"));
		Admin a1 = this.adminService.login(admin);
		if(a1!=null){
			return "hello";
		}else
			return "redirect:/error.htm";
		
		
	}
	
	@RequestMapping(value="index")
	public String Index(){
		return "index";
	}
	
	@RequestMapping(value="index1")
	public String Index1(){
		return "index1";
	}
	
	@RequestMapping(value="index2")
	public String Index2(){
		return "index2";
	}
	
}
