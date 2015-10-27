package com.spring.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.domain.Doctor;
import com.spring.domain.Medicine;
import com.spring.domain.PharmacyDoctor;
import com.spring.service.MedicineService;
import com.spring.service.PharmacyDoctorService;

@Controller
public class MedicationMedicineEditController {
	
	@Autowired
	private PharmacyDoctorService pharmacyDoctorService;
	
	@Autowired
	private MedicineService medicineService;
	
	@RequestMapping(value="/medication_medicine_edit")
	public String medicineEdit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub	
		Medicine m = medicineService.getMedicine(Integer.parseInt(request.getParameter("medicineId")));
		
		request.getSession().setAttribute("m", m);
		
		return "medication_medicine_edit";
	}
	
	@RequestMapping(value="/medication_medicine_edit", method=RequestMethod.POST)
	public String medicineEditPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get the medicine you want to edit
		Medicine medicine = medicineService.getMedicine(Integer.parseInt(request.getParameter("medicineId")));
		
		medicine.setMedicineName(request.getParameter("medicineName").replaceAll("\r\n","<br>"));
		medicine.setMedicineSymptom(request.getParameter("medicineSymptom").replaceAll("\r\n","<br>"));
		medicine.setMedicineUsage(request.getParameter("medicineUsage").replaceAll("\r\n","<br>"));
		medicine.setMedicineSideEffect(request.getParameter("medicineSideEffect").replaceAll("\r\n","<br>"));
		medicine.setMedicineOverdoseEffect(request.getParameter("medicineOverdoseEffect").replaceAll("\r\n","<br>"));
		medicine.setMedicinePrecaution(request.getParameter("medicinePrecaution").replaceAll("\r\n","<br>"));
		
		
		/** Image Upload to Server*/
		String myappPath = request.getSession().getServletContext().getRealPath("/");
		String imagePathDatabase = "";
		try {
			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
				List<MultipartFile> multipartFiles = multipartRequest.getFiles("medicineImage");
				for( int i=0 ;i<multipartFiles.size();i++ ){
					MultipartFile file = multipartFiles.get(i);
					long size = file.getSize();
					byte[] data = new byte[(int) size];
					InputStream input = file.getInputStream();
					input.read(data);
					String imagePathWithTime= "imageUpload" + File.separator + String.valueOf(System.currentTimeMillis()) + file.getOriginalFilename();
					File outFile = new File(myappPath + File.separator + imagePathWithTime);
					if (!outFile.exists()) {
						outFile.createNewFile();
						
						imagePathDatabase += "\t"+ imagePathWithTime;
						
						System.out.println("success upload: full path = " + outFile.getAbsolutePath());
					} else {
						System.out.println("fail upload: full path = " + outFile.getAbsolutePath());
					}
					FileOutputStream outStream = new FileOutputStream(outFile);
					outStream.write(data);
					outStream.close();
					input.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		medicine.setMedicineImage(imagePathDatabase);
		
		
		/** editor name 需要验证 */
		Doctor doctor = (Doctor)request.getSession().getAttribute("doctor");
		PharmacyDoctor d = pharmacyDoctorService.getPharmacyDoctorByName(doctor.getName());
		medicine.setMedicineEditor(d.getPharmacyDoctorName());
		medicine.setMedicineEditDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		medicineService.updateMedicine(medicine);
		
		return "redirect:medication_medicine_manage";
	}
	
	
}
