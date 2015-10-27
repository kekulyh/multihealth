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
import com.spring.domain.MedicationEvents;
import com.spring.domain.PharmacyDoctor;
import com.spring.service.MedicationEventsService;
import com.spring.service.PharmacyDoctorService;

@Controller
public class MedicationEventsEditController {
	
	@Autowired
	private PharmacyDoctorService pharmacyDoctorService;
	
	@Autowired
	private MedicationEventsService medicationEventsService;
	
	@RequestMapping(value="/medication_events_edit")
	public String eventEdit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub	
		MedicationEvents e = medicationEventsService.getMedicationEvents(Integer.parseInt(request.getParameter("medicationEventsId")));
		
		request.getSession().setAttribute("e", e);
		
		return "medication_events_edit";
	}
	
	@RequestMapping(value="/medication_events_edit", method=RequestMethod.POST)
	public String eventEditPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get the medicine you want to edit
		MedicationEvents medicationEvents = medicationEventsService.getMedicationEvents(Integer.parseInt(request.getParameter("medicationEventsId")));
		
		medicationEvents.setMedicationEventsTitle(request.getParameter("medicationEventsTitle").replaceAll("\r\n","<br>"));
		medicationEvents.setMedicationEventsContent(request.getParameter("medicationEventsContent").replaceAll("\r\n","<br>"));
		medicationEvents.setMedicationEventsAddress(request.getParameter("medicationEventsAddress").replaceAll("\r\n","<br>"));
		medicationEvents.setMedicationEventsDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		/** Image Upload to Server*/
		String myappPath = request.getSession().getServletContext().getRealPath("/");
		String imagePathDatabase = "";
		try {
			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
				List<MultipartFile> multipartFiles = multipartRequest.getFiles("medicationEventsImage");
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
		
		medicationEvents.setMedicationEventsImage(imagePathDatabase);
		
		
		
		/** editor name 需要验证 */
		Doctor doctor = (Doctor)request.getSession().getAttribute("doctor");
		PharmacyDoctor d = pharmacyDoctorService.getPharmacyDoctorByName(doctor.getName());
		medicationEvents.setMedicationEventsEditor(d.getPharmacyDoctorName());
		medicationEvents.setMedicationEventsEditDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		medicationEventsService.updateMedicationEvents(medicationEvents);;
		
		return "redirect:medication_events_manage";
	}
	
}
