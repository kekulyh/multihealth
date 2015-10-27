package com.spring.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.PharmacyDoctor;
import com.spring.domain.PharmacyDoctorComment;
import com.spring.domain.PharmacyUser;
import com.spring.domain.User;
import com.spring.service.PharmacyDoctorCommentService;
import com.spring.service.PharmacyDoctorService;
import com.spring.service.PharmacyUserService;
import com.spring.util.MedicationPaginationTool;

@Controller
public class MedicationDoctorSingleController {
	
	@Autowired
	private PharmacyDoctorService pharmacyDoctorService;
	
	@Autowired
	private PharmacyDoctorCommentService pharmacyDoctorCommentService;
	
	@Autowired
	private PharmacyUserService pharmacyUserService;
	
	//show doctor single page
	@RequestMapping(value="/medication_doctor_single", method=RequestMethod.GET)
	public String medicationPharmacyDoctorSingleGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get pharmacy doctor id
		PharmacyDoctor d = pharmacyDoctorService.getPharmacyDoctor(Integer.parseInt(request.getParameter("pharmacyDoctorId")));
		request.getSession().setAttribute("d", d);	
		
		/** Pagination */
		// Get current page number
		int currentPage = Integer.parseInt(request.getParameter("page"));
		// Set max amount of comment shown on each page
		int everyPageAmount = 2;
		// Get amount of comment 
		int doctorCommentCount = pharmacyDoctorCommentService.getPharmacyDoctorCommentCountByPharmacyDoctorId(d.getPharmacyDoctorId());
		// Calculate max page number
		int maxPage = (int) Math.ceil( (double)doctorCommentCount / everyPageAmount);
		
		// create paginationTool object
		MedicationPaginationTool paginationTool = new MedicationPaginationTool();
		paginationTool.setCurrentPage(currentPage);
		paginationTool.setMaxPage(maxPage);
		paginationTool.setEveryPageAmount(everyPageAmount);
		
		// return paginationList
		List<MedicationPaginationTool> paginationList = new ArrayList<MedicationPaginationTool>();
		
		paginationList.add(paginationTool);
		
		request.getSession().setAttribute("paginationList", paginationList);
		
		
		//get comment list on page
		List<PharmacyDoctorComment> c = pharmacyDoctorCommentService.getPharmacyDoctorCommentOnPageByPharmacyDoctorId(d.getPharmacyDoctorId(), currentPage, everyPageAmount);
		request.getSession().setAttribute("c", c);
		
		
		//get comments count by pharmacy doctor id
		int count = pharmacyDoctorCommentService.getPharmacyDoctorCommentCountByPharmacyDoctorId(d.getPharmacyDoctorId());
		request.getSession().setAttribute("count", count);
		
		//set comment count in doctor
		d.setPharmacyDoctorCommentCount(count);
		pharmacyDoctorService.updatePharmacyDoctor(d);
		
		return "medication_doctor_single";
		
	}
	
	
	//post comment
	@RequestMapping(value="/medication_doctor_single", method=RequestMethod.POST)
	public String medicationPharmacyDoctorSinglePost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if (request.getParameter("pharmacyDoctorCommentId") != null ) {
			
			/* reply comment */
			
			//set reply content
			PharmacyDoctorComment originComment = pharmacyDoctorCommentService.getPharmacyDoctorComment( Integer.parseInt( request.getParameter("pharmacyDoctorCommentId") ) );
			String originCommentString = "<blockquote><footer>" + originComment.getPharmacyDoctorCommentUser() + " said at " + originComment.getPharmacyDoctorCommentDate() + " :" + "</footer>" + originComment.getPharmacyDoctorCommentContent() + "</blockquote>"; 
			
			String reply = request.getParameter("comment-message");
			
			String replyOfComment = originCommentString + reply;
			
			//set comment content and date
			PharmacyDoctorComment pharmacyDoctorComment = new PharmacyDoctorComment();
			pharmacyDoctorComment.setPharmacyDoctorCommentContent(replyOfComment);
			pharmacyDoctorComment.setPharmacyDoctorCommentDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			
			//set doctor id
			PharmacyDoctor pharmacyDoctor = pharmacyDoctorService.getPharmacyDoctor(Integer.parseInt(request.getParameter("pharmacyDoctorId")));
			pharmacyDoctorComment.setPharmacyDoctor(pharmacyDoctor);
			
			//set user id and name
			/** 获取用户id，需要用户验证 */
			User u = (User)request.getSession().getAttribute("user");
			PharmacyUser pharmacyUser = pharmacyUserService.getPharmacyUserByName(u.getName());
			pharmacyDoctorComment.setPharmacyUser(pharmacyUser);
			pharmacyDoctorComment.setPharmacyDoctorCommentUser(pharmacyUser.getPharmacyUserName());
			
			//add comment to database
			pharmacyDoctorCommentService.addPharmacyDoctorComment(pharmacyDoctorComment); 
			
			//get doctor id
			PharmacyDoctor d = pharmacyDoctorService.getPharmacyDoctor(pharmacyDoctor.getPharmacyDoctorId());
			request.getSession().setAttribute("d", d);
			
			/** Pagination */
			// Get current page number
			int currentPage = Integer.parseInt(request.getParameter("page"));
			// Set max amount of comment shown on each page
			int everyPageAmount = 2;
			// Get amount of comment 
			int doctorCommentCount = pharmacyDoctorCommentService.getPharmacyDoctorCommentCountByPharmacyDoctorId(d.getPharmacyDoctorId());
			// Calculate max page number
			int maxPage = (int) Math.ceil( (double)doctorCommentCount / everyPageAmount);
			
			// create paginationTool object
			MedicationPaginationTool paginationTool = new MedicationPaginationTool();
			paginationTool.setCurrentPage(currentPage);
			paginationTool.setMaxPage(maxPage);
			paginationTool.setEveryPageAmount(everyPageAmount);
			
			// return paginationList
			List<MedicationPaginationTool> paginationList = new ArrayList<MedicationPaginationTool>();
			
			paginationList.add(paginationTool);
			
			request.getSession().setAttribute("paginationList", paginationList);
			
			
			//get comment list on page
			List<PharmacyDoctorComment> c = pharmacyDoctorCommentService.getPharmacyDoctorCommentOnPageByPharmacyDoctorId(d.getPharmacyDoctorId(), currentPage, everyPageAmount);
			request.getSession().setAttribute("c", c);
			
			//get comments count by doctor id
			int count = pharmacyDoctorCommentService.getPharmacyDoctorCommentCountByPharmacyDoctorId(pharmacyDoctor.getPharmacyDoctorId());
			request.getSession().setAttribute("count", count);
			
			return "medication_doctor_single";
			
		}else{
			
			/* post comment to the news */
			
			//set comment content and date
			PharmacyDoctorComment pharmacyDoctorComment = new PharmacyDoctorComment();
			pharmacyDoctorComment.setPharmacyDoctorCommentDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			pharmacyDoctorComment.setPharmacyDoctorCommentContent(request.getParameter("comment-message"));
			
			//set doctor id
			PharmacyDoctor pharmacyDoctor = pharmacyDoctorService.getPharmacyDoctor(Integer.parseInt(request.getParameter("pharmacyDoctorId")));
			pharmacyDoctorComment.setPharmacyDoctor(pharmacyDoctor);
			
			//set user id and name
			User u = (User)request.getSession().getAttribute("user");
			PharmacyUser pharmacyUser = pharmacyUserService.getPharmacyUserByName(u.getName());
			pharmacyDoctorComment.setPharmacyUser(pharmacyUser);
			pharmacyDoctorComment.setPharmacyDoctorCommentUser(pharmacyUser.getPharmacyUserName());
			
			//add comment to database
			pharmacyDoctorCommentService.addPharmacyDoctorComment(pharmacyDoctorComment); 
			
			//get doctor id
			PharmacyDoctor d = pharmacyDoctorService.getPharmacyDoctor(pharmacyDoctor.getPharmacyDoctorId());
			request.getSession().setAttribute("d", d);
			
			/** Pagination */
			// Get current page number
			int currentPage = Integer.parseInt(request.getParameter("page"));
			// Set max amount of comment shown on each page
			int everyPageAmount = 2;
			// Get amount of comment 
			int doctorCommentCount = pharmacyDoctorCommentService.getPharmacyDoctorCommentCountByPharmacyDoctorId(d.getPharmacyDoctorId());
			// Calculate max page number
			int maxPage = (int) Math.ceil( (double)doctorCommentCount / everyPageAmount);
			
			// create paginationTool object
			MedicationPaginationTool paginationTool = new MedicationPaginationTool();
			paginationTool.setCurrentPage(currentPage);
			paginationTool.setMaxPage(maxPage);
			paginationTool.setEveryPageAmount(everyPageAmount);
			
			// return paginationList
			List<MedicationPaginationTool> paginationList = new ArrayList<MedicationPaginationTool>();
			
			paginationList.add(paginationTool);
			
			request.getSession().setAttribute("paginationList", paginationList);
			
			
			//get comment list on page
			List<PharmacyDoctorComment> c = pharmacyDoctorCommentService.getPharmacyDoctorCommentOnPageByPharmacyDoctorId(d.getPharmacyDoctorId(), currentPage, everyPageAmount);
			request.getSession().setAttribute("c", c);
			
			//get comments count by doctor id
			int count = pharmacyDoctorCommentService.getPharmacyDoctorCommentCountByPharmacyDoctorId(pharmacyDoctor.getPharmacyDoctorId());
			request.getSession().setAttribute("count", count);
			
			return "medication_doctor_single";
			
		}
		
	}
	
	
}
