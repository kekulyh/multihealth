package com.spring.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.Doctor;
import com.spring.domain.PharmacyDoctor;
import com.spring.domain.User;
import com.spring.service.PharmacyDoctorService;

@Controller
public class MedicationDoctorManageController {
	
	@Autowired
	private PharmacyDoctorService pharmacyDoctorService;
	
	@RequestMapping(value="/medication_doctor_manage")
	public String doctorManage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get pharmacy doctor id
		/** 用户需要验证，获取id */
		Doctor doctor = (Doctor)request.getSession().getAttribute("doctor");
		PharmacyDoctor d = pharmacyDoctorService.getPharmacyDoctorByName(doctor.getName());
		request.getSession().setAttribute("d", d);	
		
		return "medication_doctor_manage";
	}
	
	@RequestMapping(value="/medication_doctor_manage", method=RequestMethod.POST)
	public String doctorManagePost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get the medicine you want to edit
		PharmacyDoctor pharmacyDoctor = pharmacyDoctorService.getPharmacyDoctor(Integer.parseInt(request.getParameter("pharmacyDoctorId")));
		
		pharmacyDoctor.setPharmacyDoctorName(request.getParameter("pharmacyDoctorName"));
		pharmacyDoctor.setPharmacyDoctorAge(request.getParameter("pharmacyDoctorAge"));
		pharmacyDoctor.setPharmacyDoctorGender(request.getParameter("pharmacyDoctorGender"));
		pharmacyDoctor.setPharmacyDoctorSpecialty(request.getParameter("pharmacyDoctorSpecialty"));
		pharmacyDoctor.setPharmacyDoctorTel(request.getParameter("pharmacyDoctorTel"));
		pharmacyDoctor.setPharmacyDoctorPharmacy(request.getParameter("pharmacyDoctorPharmacy"));
		pharmacyDoctor.setPharmacyDoctorPharmacyAddress(request.getParameter("pharmacyDoctorPharmacyAddress"));
		pharmacyDoctor.setPharmacyDoctorDescription(request.getParameter("pharmacyDoctorDescription").replaceAll("\r\n","<br>"));
		
		pharmacyDoctorService.updatePharmacyDoctor(pharmacyDoctor);
		
		return "redirect:medication_doctor_manage";
	}
	
	
}
