package com.spring.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.Medicine;
import com.spring.service.MedicineService;

@Controller
public class MedicationMedicineFindController {
	
	@Autowired
	private MedicineService medicineService;

	//display searching page
	@RequestMapping(value="/medication_medicine_find")
	public String medicationFindMedicine(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get medicine list order by comment count
		List<Medicine> medicineCommentCountList = medicineService.medicineCommentCountList();
		request.getSession().setAttribute("medicineCommentCountList", medicineCommentCountList);
		
		return "medication_medicine_find";
	}
	
	//search with name or symptom
	@RequestMapping(value="/medication_medicine_find", method=RequestMethod.POST)
	public String medicationFindMedicineSearch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		Medicine medicine = new Medicine();
		
		if (request.getParameter("optionsRadios").equals("1")) {
			//search with name
			medicine.setMedicineName(request.getParameter("medicineSearch"));
			List<Medicine> medicineSearchList = medicineService.searchMedicineName(medicine);
			request.getSession().setAttribute("medicineSearchList", medicineSearchList);	
		}else{
			//search with symptom
			medicine.setMedicineSymptom(request.getParameter("medicineSearch"));
			List<Medicine> medicineSearchList = medicineService.searchMedicineSymptom(medicine);
			request.getSession().setAttribute("medicineSearchList", medicineSearchList);	
		}
		
		//get medicine list order by comment count
		List<Medicine> medicineCommentCountList = medicineService.medicineCommentCountList();
		request.getSession().setAttribute("medicineCommentCountList", medicineCommentCountList);
		
		return "medication_medicine_find_list";
	}
	
	
	
	
	
}
