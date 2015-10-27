package com.spring.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.PharmacyDoctor;
import com.spring.service.PharmacyDoctorService;

@Controller
public class MedicationDoctorListController {
	
	@Autowired
	private PharmacyDoctorService pharmacyDoctorService;
	
	//search with name or symptom
		@RequestMapping(value="/medication_doctor_list")
		public String medicationFindMedicineSearch(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// TODO Auto-generated method stub
			List<PharmacyDoctor> pharmacyDoctorList = pharmacyDoctorService.PharmacyDoctorList();
			
			request.getSession().setAttribute("pharmacyDoctorList", pharmacyDoctorList);	
			
			return "medication_doctor_list";
		}
	
	
	
}
