package com.spring.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.spring.domain.Appointment;
import com.spring.domain.DocConsultComm;
import com.spring.domain.Doctor;
import com.spring.domain.PharmacyDoctor;
import com.spring.domain.Timetable;
import com.spring.domain.User;
import com.spring.service.AppointmentModel;
import com.spring.service.DocConsultCommModel;
import com.spring.service.DoctorModel;
import com.spring.service.PharmacyDoctorService;
import com.spring.service.TimetableModel;

@Controller
//@RequestMapping(value="/doctor/**")

public class DoctorController {
	@Resource(name="doctorService")
	private DoctorModel doctorService;
	
	@Resource(name="timetableService")
	private TimetableModel timetableService;
	
	@Resource(name="appointmentService")
	private AppointmentModel appointmentService;
	
	@Resource(name="docconcommsService")
	private DocConsultCommModel docconcommsService;
	
	@Autowired
	private PharmacyDoctorService pharmacyDoctorService;

	private String path;
	
	private String myfileContentType;
	private String myfileFileName;
	private String savepath;
	private String realpath;
	private String fileName;
	
	
	

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMyfileContentType() {
		return myfileContentType;
	}

	public void setMyfileContentType(String myfileContentType) {
		this.myfileContentType = myfileContentType;
	}

	public String getMyfileFileName() {
		return myfileFileName;
	}

	public void setMyfileFileName(String myfileFileName) {
		this.myfileFileName = myfileFileName;
	}

	public String getSavepath() {
		return savepath;
	}

	public void setSavepath(String savepath) {
		this.savepath = savepath;
	}

	public String getRealpath() {
		return realpath;
	}

	public void setRealpath(String realpath) {
		this.realpath = realpath;
	}

	@RequestMapping(value="/upload")
	public String addDoctor(Model uiModel){
		return "upload";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String addDoctor(@RequestParam("myfile") MultipartFile myfile,HttpServletRequest request) throws IllegalStateException, IOException{
		
		
		
		//realpath = request.getSession().getServletContext().getRealPath("/pic");
//		System.out.println("REALPATH"+realpath);
//
		
		realpath = "/Users/LYH/Documents/workspace-sts-3.7.0.RELEASE/Testtest/src/main/webapp/pic";
		
//		realpath = "A:/Springworkspace-sts-3.7.0.RELEASE/Testtest/src/main/webapp/pic";
		
		File file = new File(realpath);
	
		if(!file.exists()){
			file.mkdir();
		}

		
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Doctor d = new Doctor();
		Date now = new Date(); 
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  	    String time1 = dateFormat.format( now ); 
		d.setName(multipartRequest.getParameter("name"));
		d.setPassword(multipartRequest.getParameter("password"));
		d.setDescription(multipartRequest.getParameter("description"));
		d.setBrief(multipartRequest.getParameter("brief"));
		d.setDegree(multipartRequest.getParameter("degree"));
		d.setTel(multipartRequest.getParameter("tel"));
		//d.setBrief(multipartRequest.getParameter("brief"));
		d.setRegisterData(time1);
//
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		
		// ���ж�request���Ƿ����multipart���͵����ݣ�
		if(multipartResolver.isMultipart(request)){
			   //�ٽ�request�е�����ת����multipart���͵�����
			   MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			   Iterator iter = multiRequest.getFileNames();
			   while(iter.hasNext()){
			    MultipartFile file1 = multiRequest.getFile((String)iter.next());
			    if(file1 != null){
			    fileName = file1.getOriginalFilename();
			     path = realpath+"/"+file1.getOriginalFilename();
			    // System.out.println("path"+path);
			     File localFile = new File(path);
			     //д�ļ�������
			     file1.transferTo(localFile);
			    }
			   }
			  }
		String path1 = request.getContextPath();
		d.setAttachment(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+"/pic"+"/"+fileName);
		doctorService.add(d);
		Doctor doc_p = doctorService.searchByName(multipartRequest.getParameter("name"));
		
		PharmacyDoctor pd = new PharmacyDoctor();
		
		if(doc_p != null){
			pd.setDoctor(doc_p);
			pd.setPharmacyDoctorName(multipartRequest.getParameter("name"));
			pharmacyDoctorService.addPharmacyDoctor(pd);
		}
		
		return "index";
	}
	

	
	@RequestMapping(value="/jumptimetable")
	public String jumpAddTimetable(HttpServletRequest request){
		return "timetable";
	}
	
	@RequestMapping(value="/registerdoc")
	public String registerDoc(HttpServletRequest request){
		return "regdoc";
	}
	
	@RequestMapping(value="/addtimetable",method=RequestMethod.POST)
	public String addTimetable(HttpServletRequest request){
		Doctor d = (Doctor)request.getSession().getAttribute("doctor");
		Timetable tt = new Timetable();
		tt.setAddress(request.getParameter("address"));
		tt.setAvailableDate(request.getParameter("adate"));
		tt.setDoctor(d);
		tt.setTstate("Available");
		tt.setTimePeriod(request.getParameter("timeperiod"));
		timetableService.add(tt);
		
		Timetable tt1 = new Timetable();
		tt1.setAddress(request.getParameter("address1"));
		tt1.setAvailableDate(request.getParameter("adate1"));
		tt1.setDoctor(d);
		tt1.setTstate("Available");
		tt1.setTimePeriod(request.getParameter("timeperiod1"));
		timetableService.add(tt1);
		
		Timetable tt2 = new Timetable();
		tt2.setAddress(request.getParameter("address2"));
		tt2.setAvailableDate(request.getParameter("adate2"));
		tt2.setDoctor(d);
		tt2.setTstate("Available");
		tt2.setTimePeriod(request.getParameter("timeperiod2"));
		timetableService.add(tt2);
		
		return "index2";
	}
	
	
	@RequestMapping(value="/listdoctor", method=RequestMethod.GET)
	public String listDoctoe(HttpServletRequest request){
		List<Doctor>doctors = doctorService.queryAll("from Doctor");
		request.getSession().setAttribute("doctors", doctors);
	
		return "appointment";
	}
	
	@RequestMapping(value="/listdoctor1", method=RequestMethod.GET)
	public String listDoctoe1(HttpServletRequest request){
		List<Doctor>doctors = doctorService.queryAll("from Doctor");
		request.getSession().setAttribute("doctors", doctors);
	System.out.println("MSG"+request.getSession().getAttribute("msg"));
		request.setAttribute("msg", request.getSession().getAttribute("msg"));
		return "appointment";
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String viewDoctor(@RequestParam(value="did",required=false)  int id, HttpServletRequest request){
		Doctor d = doctorService.queryOne("Doctor", id);
		String path1 = request.getContextPath();
		System.out.println("PPPPPP"+path1);
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+d.getAttachment();
		System.out.println("BASE"+basePath);
		request.getSession().setAttribute("base", basePath);
		System.out.println("PATH"+d.getAttachment());
		request.getSession().setAttribute("doctor", d);
		return "viewdoctor";
	}
	
	@RequestMapping(value="/reserve", method=RequestMethod.GET)
	public String reserveDoctor(@RequestParam(value="did", required=false) int id,HttpServletRequest request){
		Doctor d = doctorService.queryOne("Doctor", id);
		request.getSession().setAttribute("doctor", d);
		List<Timetable> list = timetableService.queryTimetable(id);
		request.getSession().setAttribute("timetables", list);
//		String msg = (String)request.getAttribute("msg");
//		request.setAttribute("msg", request.getSession().getAttribute("msg"));
		return "timetables";
	}
	@RequestMapping(value="/reservedate", method=RequestMethod.GET)
	public String reserveDate(@RequestParam(value="tid", required=false) int id, HttpServletRequest request){
		Timetable t = timetableService.queryOne("Timetable", id);
		System.out.println(t.getAddress());
		String state = t.getTstate();
		if (state.equals("Available") ) {
			
			t.setTstate("Unavailable");
			timetableService.update(t);
			Doctor d = (Doctor) request.getSession().getAttribute("doctor");
			System.out.println(d.getName());
			User u = (User) request.getSession().getAttribute("user");
			System.out.println(u.getName());
			Appointment a = new Appointment();
			a.setAvailableDate(t.getAvailableDate());
			a.setTimePeriod(t.getTimePeriod());
			a.setAddress(t.getAddress());
			a.setUser(u);
			a.setDoctor(d);

			appointmentService.add(a);
			
			request.getSession().setAttribute("msg", "Book success!");
			return "redirect:/listdoctor1";
			
		}
		request.getSession().setAttribute("msg", "This timeperiod is unavailable, please choose another one!");
		return "redirect:/listdoctor1";
	}
	
	@RequestMapping(value="/uptimetable",method=RequestMethod.POST)
	public String upTimetable(){
		return "timetable";
	}
	
	@RequestMapping(value="userapp",method=RequestMethod.GET)
	public String listAppointment(HttpServletRequest request){
		Doctor d = (Doctor)request.getSession().getAttribute("doctor");
		List<Appointment> list = appointmentService.listAppointment(d.getId());
		request.getSession().setAttribute("alist", list);
		return "applist";
	}
	
	@RequestMapping(value="/returnindex2",method=RequestMethod.POST)
	public String returnIndex2(){
		return "index2";
	}
	
	@RequestMapping(value="/docinfor")
	public String docInformationList(HttpServletRequest request){
		Doctor d = (Doctor)request.getSession().getAttribute("doctor");
		List<DocConsultComm> docconlist = docconcommsService.docConComms(d.getId());
		request.getSession().setAttribute("docconlist", docconlist);
		return "docpersonallist";
		
	}
	
	@RequestMapping(value="changedocinfor")
	public String changeDocInformation(HttpServletRequest request){
		return "changedocinformation";
	}
	
}
