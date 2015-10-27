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

import com.spring.domain.Medicine;
import com.spring.domain.MedicineComment;
import com.spring.domain.PharmacyUser;
import com.spring.domain.User;
import com.spring.service.MedicineCommentService;
import com.spring.service.MedicineService;
import com.spring.service.PharmacyUserService;
import com.spring.util.MedicationPaginationTool;

@Controller
public class MedicationMedicineSingleController {
	
	@Autowired
	private MedicineService medicineService;
	
	@Autowired
	private MedicineCommentService medicineCommentService;
	
	@Autowired
	private PharmacyUserService pharmacyUserService;
	
	
	//show single medicine page
	@RequestMapping(value="/medication_medicine_single", method=RequestMethod.GET)
	public String medicineSingleGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get medicine id
		Medicine m = medicineService.getMedicine(Integer.parseInt(request.getParameter("medicineId")));
		request.getSession().setAttribute("m", m);	
		
		/** Pagination */
		// Get current page number
		int currentPage = Integer.parseInt(request.getParameter("page"));
		// Set max amount of comment shown on each page
		int everyPageAmount = 2;
		// Get amount of comment 
		int medicineCommentCount = medicineCommentService.getMedicineCommentCountByMedicineId(m.getMedicineId());
		// Calculate max page number
		int maxPage = (int) Math.ceil( (double)medicineCommentCount / everyPageAmount);
		
		// create paginationTool object
		MedicationPaginationTool paginationTool = new MedicationPaginationTool();
		paginationTool.setCurrentPage(currentPage);
		paginationTool.setMaxPage(maxPage);
		paginationTool.setEveryPageAmount(everyPageAmount);
		
		// return paginationList
		List<MedicationPaginationTool> paginationList = new ArrayList<MedicationPaginationTool>();
		
		paginationList.add(paginationTool);
		
		request.getSession().setAttribute("paginationList", paginationList);
		
		
		//get comment list
		List<MedicineComment> c = medicineCommentService.getMedicineCommentOnPageByMedicineId(m.getMedicineId(), currentPage, everyPageAmount);
		request.getSession().setAttribute("c", c);
		
		//get comments count by medicine id
		int count = medicineCommentService.getMedicineCommentCountByMedicineId(m.getMedicineId());
		request.getSession().setAttribute("count", count);
		
		//set comment count in medicine
		m.setMedicineCommentCount(count);
		medicineService.updateMedicine(m);
		
		return "medication_medicine_single";
		
	}
	
	
	//post comment
	@RequestMapping(value="/medication_medicine_single", method=RequestMethod.POST)
	public String medicineSinglePost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if (request.getParameter("medicineCommentId") != null ) {
			
			/* reply comment */
			
			//set reply content
			MedicineComment originComment = medicineCommentService.getMedicineComment( Integer.parseInt( request.getParameter("medicineCommentId") ) );
			String originCommentString = "<blockquote><footer>" + originComment.getMedicineCommentUser() + " said at " + originComment.getMedicineCommentDate() + " :" + "</footer>" + originComment.getMedicineCommentContent() + "</blockquote>"; 
			
			String reply = request.getParameter("comment-message");
			
			String replyOfComment = originCommentString + reply;
			
			//set comment content and date
			MedicineComment medicineComment = new MedicineComment();
			medicineComment.setMedicineCommentContent(replyOfComment);
			medicineComment.setMedicineCommentDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			
			//set news id
			Medicine medicine = medicineService.getMedicine(Integer.parseInt(request.getParameter("medicineId")));
			medicineComment.setMedicine(medicine);
			
			//set user id and name
			/** 获取用户id，需要用户验证 */
			User u = (User)request.getSession().getAttribute("user");
			PharmacyUser pharmacyUser = pharmacyUserService.getPharmacyUserByName(u.getName());
			
			medicineComment.setPharmacyUser(pharmacyUser);
			medicineComment.setMedicineCommentUser(pharmacyUser.getPharmacyUserName());
			
			//add comment to database
			medicineCommentService.addMedicineComment(medicineComment); 
			
			//get news id
			Medicine m = medicineService.getMedicine(medicine.getMedicineId());
			request.getSession().setAttribute("m", m);
			
			/** Pagination */
			// Get current page number
			int currentPage = Integer.parseInt(request.getParameter("page"));
			// Set max amount of comment shown on each page
			int everyPageAmount = 2;
			// Get amount of comment 
			int medicineCommentCount = medicineCommentService.getMedicineCommentCountByMedicineId(m.getMedicineId());
			// Calculate max page number
			int maxPage = (int) Math.ceil( (double)medicineCommentCount / everyPageAmount);
			
			// create paginationTool object
			MedicationPaginationTool paginationTool = new MedicationPaginationTool();
			paginationTool.setCurrentPage(currentPage);
			paginationTool.setMaxPage(maxPage);
			paginationTool.setEveryPageAmount(everyPageAmount);
			
			// return paginationList
			List<MedicationPaginationTool> paginationList = new ArrayList<MedicationPaginationTool>();
			
			paginationList.add(paginationTool);
			
			request.getSession().setAttribute("paginationList", paginationList);
			
			
			//get comment list
			List<MedicineComment> c = medicineCommentService.getMedicineCommentOnPageByMedicineId(m.getMedicineId(), currentPage, everyPageAmount);
			request.getSession().setAttribute("c", c);
			
			//get comments count by news id
			int count = medicineCommentService.getMedicineCommentCountByMedicineId(medicine.getMedicineId());
			request.getSession().setAttribute("count", count);
			
			//set comment count in medicine
			m.setMedicineCommentCount(count);
			medicineService.updateMedicine(m);
			
			return "medication_medicine_single";
			
		}else{
			
			/* post comment to the news */
			
			//set comment content and date
			MedicineComment medicineComment = new MedicineComment();
			medicineComment.setMedicineCommentContent(request.getParameter("comment-message"));
			medicineComment.setMedicineCommentDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			
			//set news id
			Medicine medicine = medicineService.getMedicine(Integer.parseInt(request.getParameter("medicineId")));
			medicineComment.setMedicine(medicine);
			
			//set user id and name
			User u = (User)request.getSession().getAttribute("user");
			PharmacyUser pharmacyUser = pharmacyUserService.getPharmacyUserByName(u.getName());
			medicineComment.setPharmacyUser(pharmacyUser);
			medicineComment.setMedicineCommentUser(pharmacyUser.getPharmacyUserName());
			
			//add comment to database
			medicineCommentService.addMedicineComment(medicineComment); 
			
			//get news id
			Medicine m = medicineService.getMedicine(medicine.getMedicineId());
			request.getSession().setAttribute("m", m);
			
			/** Pagination */
			// Get current page number
			int currentPage = Integer.parseInt(request.getParameter("page"));
			// Set max amount of comment shown on each page
			int everyPageAmount = 2;
			// Get amount of comment 
			int medicineCommentCount = medicineCommentService.getMedicineCommentCountByMedicineId(m.getMedicineId());
			// Calculate max page number
			int maxPage = (int) Math.ceil( (double)medicineCommentCount / everyPageAmount);
			
			// create paginationTool object
			MedicationPaginationTool paginationTool = new MedicationPaginationTool();
			paginationTool.setCurrentPage(currentPage);
			paginationTool.setMaxPage(maxPage);
			paginationTool.setEveryPageAmount(everyPageAmount);
			
			// return paginationList
			List<MedicationPaginationTool> paginationList = new ArrayList<MedicationPaginationTool>();
			
			paginationList.add(paginationTool);
			
			request.getSession().setAttribute("paginationList", paginationList);
			
			
			//get comment list
			List<MedicineComment> c = medicineCommentService.getMedicineCommentOnPageByMedicineId(m.getMedicineId(), currentPage, everyPageAmount);
			request.getSession().setAttribute("c", c);
			
			//get comments count by news id
			int count = medicineCommentService.getMedicineCommentCountByMedicineId(medicine.getMedicineId());
			request.getSession().setAttribute("count", count);
			
			//set comment count in medicine
			m.setMedicineCommentCount(count);
			medicineService.updateMedicine(m);
			
			return "medication_medicine_single";
			
		}
		
	}
	
	
}
