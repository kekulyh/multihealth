package com.spring.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.MedicationEvents;
import com.spring.service.MedicationEventsService;
import com.spring.util.MedicationPaginationTool;

@Controller
public class MedicationEventsController {
	
	@Autowired
	private MedicationEventsService medicationEventsService;
	
	@RequestMapping(value="/medication_events")
	public String medicationEventsDisplay(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return "redirect:medication_events_page?page=1";
	}
	
	@RequestMapping(value="/medication_events_page",method=RequestMethod.GET)
	public String medicationEventsDisplayGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		// Get current page number
		int currentPage = Integer.parseInt(request.getParameter("page"));
		// Set max amount of news shown on each page
		int everyPageAmount = 2;
		// Get amount of news 
		int medicationEventsCount = medicationEventsService.getMedicationEventsCount();
		// Calculate max page number
		int maxPage = (int) Math.ceil( (double)medicationEventsCount / everyPageAmount);
		
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
		List<MedicationEvents> medicationEventsList = medicationEventsService.medicationEventsListPage(currentPage, everyPageAmount); 
		
		request.getSession().setAttribute("medicationEventsList", medicationEventsList);
		
		
		return "medication_events";
	}
	
	
}
