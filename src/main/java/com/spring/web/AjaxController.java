package com.spring.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.service.UserModel;
@Controller

public class AjaxController extends HttpServlet{
	@Resource(name="userService")
	private UserModel userService;
	@RequestMapping(value="/ajaxrequest")
	public @ResponseBody void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{  
  
        response.setContentType("text/html;charset=utf-8");  
        response.setHeader("Cache-Control","no-cache");  
        PrintWriter out=response.getWriter();  
          
		String name = request.getParameter("username");
		String pass = request.getParameter("userpass");
		String pass2 = request.getParameter("userpass2");

		String a = request.getParameter("a");
		String b = request.getParameter("b");

		System.out.println(name + " " + pass);
		System.out.println("a " + a);
		System.out.println("b " + b);
		request.setAttribute("name", name);
		System.out.println(name);
		//if (userService.rearchUser(name)==null){
		if(name != "aa"){
			out.write("此用户名合法"); 

		}else{
			 out.write("用户名已经存在，请重新输入!");  
             System.out.println("xxxxxxxxxxxxxxxxx");  
             request.setAttribute("error.message","用户名已经存在");  
		}
      
    }  
}
