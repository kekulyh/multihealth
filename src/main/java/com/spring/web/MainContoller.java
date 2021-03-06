package com.spring.web;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class MainContoller implements Controller{
	protected final Log logger = LogFactory.getLog(getClass());

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
        
     // Map<String,Object>myModel = new HashMap<String,Object>();
        return new ModelAndView("index", "now", now);
	}

}
