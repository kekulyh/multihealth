package com.spring.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.MedicationNews;
import com.spring.service.MedicationNewsService;
import com.spring.util.MedicationPaginationTool;

@Controller
public class MedicationNewsController {
	
	@Autowired
	private MedicationNewsService medicationNewsService;
	
	@RequestMapping(value="/medication_news")
	public String medicationNewsDisplay(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return "redirect:medication_news_page?page=1";
	}
	
	@RequestMapping(value="/medication_news_page", method=RequestMethod.GET)
	public String medicationNewsDisplayPagination(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		// Get current page number
		int currentPage = Integer.parseInt(request.getParameter("page"));
		// Set max amount of news shown on each page
		int everyPageAmount = 2;
		// Get amount of news 
		int medicationNewsCount = medicationNewsService.getMedicationNewsCount();
		// Calculate max page number
		int maxPage = (int) Math.ceil( (double)medicationNewsCount / everyPageAmount);
		
		// create paginationTool object
		MedicationPaginationTool paginationTool = new MedicationPaginationTool();
		paginationTool.setCurrentPage(currentPage);
		paginationTool.setMaxPage(maxPage);
		paginationTool.setEveryPageAmount(everyPageAmount);
		
		// return paginationList
		List<MedicationPaginationTool> paginationList = new ArrayList<MedicationPaginationTool>();
		
		paginationList.add(paginationTool);
		
		request.getSession().setAttribute("paginationList", paginationList);
		
		// return list on the page
		List<MedicationNews> medicationNewsList = medicationNewsService.medicationNewsListPage(currentPage, everyPageAmount); 
		
		request.getSession().setAttribute("medicationNewsList", medicationNewsList);
		
		
		return "medication_news";
	}
	
	
	
	
}
