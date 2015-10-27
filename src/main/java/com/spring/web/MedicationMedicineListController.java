package com.spring.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.spring.domain.Medicine;
import com.spring.service.MedicineService;

@Controller
public class MedicationMedicineListController {
	
	@Autowired
	private MedicineService medicineService;
	
	//search with name or symptom
	@RequestMapping(value="/medication_medicine_list")
	public String medicationFindMedicineSearch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//get medicine list A-Z
		List<Medicine> medicineList = medicineService.medicineList();
		request.getSession().setAttribute("medicineList", medicineList);
		
		//get medicine list order by comment count
		List<Medicine> medicineCommentCountList = medicineService.medicineCommentCountList();
		request.getSession().setAttribute("medicineCommentCountList", medicineCommentCountList);
		
		return "medication_medicine_list";
	}
	
	
	
	
}
