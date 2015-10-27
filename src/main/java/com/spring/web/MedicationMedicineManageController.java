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
public class MedicationMedicineManageController {
	
	@Autowired
	private MedicineService medicineService;
	
	@RequestMapping(value="/medication_medicine_manage")
	public String medicineManage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get medicine list A-Z
		List<Medicine> medicineManageList = medicineService.medicineList();
		request.getSession().setAttribute("medicineManageList", medicineManageList);
		
		return "medication_medicine_manage";
	}
	
	@RequestMapping(value="/medication_medicine_delete",method=RequestMethod.GET)
	public String medicineManageDelete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		Medicine medicine = medicineService.getMedicine(Integer.parseInt(request.getParameter("medicineId")));
		
		if (medicine != null) {
			medicineService.deleteMedicine(medicine);
		}
		
		
		String deleteSuccess = "deleteSuccess";
		request.getSession().setAttribute("deleteSuccess", deleteSuccess);
		
		return "redirect:medication_medicine_manage";
	}
	
	
	
}
