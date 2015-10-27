package com.spring.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.domain.User;

@Controller
public class MedicationController {
	
	@RequestMapping(value="/medication")
	public String MainPageMedication(HttpServletRequest request){
		User u = (User)request.getSession().getAttribute("user");
		if(u != null){
			return "medication1";
		}
		return "medication2";
		
	}
	
	@RequestMapping(value="/medication1")
	public ModelAndView medication1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("medication1");
	}
	
	@RequestMapping(value="/medication2")
	public ModelAndView medication2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("medication2");
	}
	
}
