package com.spring.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.domain.PharmacyDoctor;
import com.spring.service.PharmacyDoctorService;

@Controller
public class MedicationDoctorFindController {
	
	@Autowired
	private PharmacyDoctorService pharmacyDoctorService;
	
	//display searching page
	@RequestMapping(value="/medication_doctor_find")
	public ModelAndView medicationFindDoctor(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("medication_doctor_find");
	}
	
	//search with name, specialty or pharmacy
		@RequestMapping(value="/medication_doctor_find", method=RequestMethod.POST)
		public String medicationFindMedicineSearch(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// TODO Auto-generated method stub
			
			PharmacyDoctor pharmacyDoctor = new PharmacyDoctor();
			
			if (request.getParameter("optionsRadios").equals("1")) {
				//search with name
				pharmacyDoctor.setPharmacyDoctorName(request.getParameter("pharmacyDoctorSearch"));
				List<PharmacyDoctor> pharmacyDoctorSearchList = pharmacyDoctorService.searchPharmacyDoctorName(pharmacyDoctor);
				request.getSession().setAttribute("pharmacyDoctorSearchList", pharmacyDoctorSearchList);
			}else{
				
				if (request.getParameter("optionsRadios").equals("2")) {
					//search with specialty
					pharmacyDoctor.setPharmacyDoctorSpecialty(request.getParameter("pharmacyDoctorSearch"));
					List<PharmacyDoctor> pharmacyDoctorSearchList = pharmacyDoctorService.searchPharmacyDoctorSpecialty(pharmacyDoctor);
					request.getSession().setAttribute("pharmacyDoctorSearchList", pharmacyDoctorSearchList);
				}else{
					//search with pharmacy
					pharmacyDoctor.setPharmacyDoctorPharmacy(request.getParameter("pharmacyDoctorSearch"));
					List<PharmacyDoctor> pharmacyDoctorSearchList = pharmacyDoctorService.searchPharmacyDoctorPharmacy(pharmacyDoctor);
					request.getSession().setAttribute("pharmacyDoctorSearchList", pharmacyDoctorSearchList);
				}
				
			}
			
			return "medication_doctor_find_list";
		}
	
}
