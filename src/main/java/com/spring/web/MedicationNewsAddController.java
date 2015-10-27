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
import com.spring.domain.MedicationNews;
import com.spring.domain.PharmacyDoctor;
import com.spring.service.MedicationNewsService;
import com.spring.service.PharmacyDoctorService;

@Controller
public class MedicationNewsAddController {
	
	@Autowired
	private PharmacyDoctorService pharmacyDoctorService;
	
	@Autowired
	private MedicationNewsService medicationNewsService;
	
	@RequestMapping(value="/medication_news_add")
	public String newsAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub		
		return "medication_news_add";
	}
	
	@RequestMapping(value="/medication_news_add", method=RequestMethod.POST)
	public String newsAddPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		MedicationNews medicationNews = new MedicationNews();
		
		medicationNews.setMedicationNewsTitle(request.getParameter("medicationNewsTitle").replaceAll("\r\n","<br>"));
		medicationNews.setMedicationNewsAuthor(request.getParameter("medicationNewsAuthor").replaceAll("\r\n","<br>"));
		medicationNews.setMedicationNewsContent(request.getParameter("medicationNewsContent").replaceAll("\r\n","<br>"));
		medicationNews.setMedicationNewsDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		/** Image Upload to Server*/
		String myappPath = request.getSession().getServletContext().getRealPath("/");
		String imagePathDatabase = "";
		try {
			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
				List<MultipartFile> multipartFiles = multipartRequest.getFiles("medicationNewsImage");
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
		
		medicationNews.setMedicationNewsImage(imagePathDatabase);
		
		
		
		/** editor name 需要验证 */
		Doctor doctor = (Doctor)request.getSession().getAttribute("doctor");
		PharmacyDoctor d = pharmacyDoctorService.getPharmacyDoctorByName(doctor.getName());
		medicationNews.setMedicationNewsEditor(d.getPharmacyDoctorName());
		medicationNews.setMedicationNewsEditDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		//get medicine list of the medicine name
		MedicationNews medicationNewsExist = medicationNewsService.getMedicationNewsByTitle(medicationNews);
		
		if (medicationNewsExist != null) {
			//medicine is exist
			
			String alertAdd = "medicationNewsExist";
			MedicationNews e = medicationNewsExist;
			//return this medicine
			request.setAttribute("e", e);
			//return alert message 
			request.setAttribute("alertAdd", alertAdd);
			
			return "medication_news_add";
			
		}else{
			//medicine does not exist
			
			medicationNewsService.addMedicationNews(medicationNews);
			
			return "redirect:medication_news_manage";
		}
		
		
	}
	
	
}
