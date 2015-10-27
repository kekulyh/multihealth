package com.spring.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.MedicationEvents;
import com.spring.service.MedicationEventsService;

@Controller
public class MedicationEventsManageController {
	
	@Autowired
	private MedicationEventsService medicationEventsService;
	
	@RequestMapping(value="/medication_events_manage")
	public String medicationEventManage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get medicine list A-Z
		List<MedicationEvents> medicationEventsManageList = medicationEventsService.medicationEventsList();
		request.getSession().setAttribute("medicationEventsManageList", medicationEventsManageList);
		
		return "medication_events_manage";
	}
	
	@RequestMapping(value="/medication_events_delete",method=RequestMethod.GET)
	public String medicationEventManageDelete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		MedicationEvents medicationEvents = medicationEventsService.getMedicationEvents(Integer.parseInt(request.getParameter("medicationEventsId")));
		
		if (medicationEvents != null) {
			medicationEventsService.deleteMedicationEvents(medicationEvents);
		}
		
		
		String deleteSuccess = "deleteSuccess";
		request.getSession().setAttribute("deleteSuccess", deleteSuccess);
		
		return "redirect:medication_events_manage";
	}
	
}
