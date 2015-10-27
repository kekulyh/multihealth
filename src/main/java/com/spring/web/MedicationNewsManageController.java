package com.spring.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.MedicationNews;
import com.spring.service.MedicationNewsService;

@Controller
public class MedicationNewsManageController {
	
	@Autowired
	private MedicationNewsService medicationNewsService;
	
	@RequestMapping(value="/medication_news_manage")
	public String medicationNewsManage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get medicine list A-Z
		List<MedicationNews> medicationNewsManageList = medicationNewsService.medicationNewsList();
		request.getSession().setAttribute("medicationNewsManageList", medicationNewsManageList);
		
		return "medication_news_manage";
	}
	
	@RequestMapping(value="/medication_news_delete",method=RequestMethod.GET)
	public String medicationNewsManageDelete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		MedicationNews medicationNews = medicationNewsService.getMedicationNews(Integer.parseInt(request.getParameter("medicationNewsId")));
		
		if (medicationNews != null) {
			medicationNewsService.deleteMedicationNews(medicationNews);
		}
		
		
		String deleteSuccess = "deleteSuccess";
		request.getSession().setAttribute("deleteSuccess", deleteSuccess);
		
		return "redirect:medication_news_manage";
	}
	
}
