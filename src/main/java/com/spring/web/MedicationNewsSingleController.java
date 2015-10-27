package com.spring.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.MedicationNews;
import com.spring.domain.MedicationNewsComment;
import com.spring.domain.PharmacyUser;
import com.spring.domain.User;
import com.spring.service.MedicationNewsCommentService;
import com.spring.service.MedicationNewsService;
import com.spring.service.PharmacyUserService;

@Controller
public class MedicationNewsSingleController {
	
	@Autowired
	private MedicationNewsService medicationNewsService;
	
	@Autowired
	private MedicationNewsCommentService medicationNewsCommentService;
	
	@Autowired
	private PharmacyUserService pharmacyUserService;
	
	
	//show single news page
	@RequestMapping(value="/medication_news_single", method=RequestMethod.GET)
	public String medicationNewsSingleGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get news id
		MedicationNews n = medicationNewsService.getMedicationNews(Integer.parseInt(request.getParameter("medicationNewsId")));
		request.getSession().setAttribute("n", n);
		
		//get comment list
		List<MedicationNewsComment> c = medicationNewsCommentService.getNewsCommentByNewsId(n.getMedicationNewsId());
		request.getSession().setAttribute("c", c);
		
		//get comments count by news id
		int count = medicationNewsCommentService.getNewsCommentCountByNewsId(n.getMedicationNewsId());
		request.getSession().setAttribute("count", count);
		
		//set comment count in news
		n.setMedicationNewsCommentCount(count);
		medicationNewsService.updateMedicationNews(n);
		
		return "medication_news_single";
	}
	
	
	//post comment
	@RequestMapping(value="/medication_news_single", method=RequestMethod.POST)
	public String medicationNewsSinglePost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if (request.getParameter("medicationNewsCommentId") != null ) {
			
			/* reply comment */
			
			//set reply content
			MedicationNewsComment originComment = medicationNewsCommentService.getNewsComment( Integer.parseInt( request.getParameter("medicationNewsCommentId") ) );
			String originCommentString = "<blockquote><footer>" + originComment.getMedicationNewsCommentUser() + " said at " + originComment.getMedicationNewsCommentDate() + " :" + "</footer>" + originComment.getMedicationNewsCommentContent() + "</blockquote>"; 
			
			String reply = request.getParameter("comment-message");
			
			String replyOfComment = originCommentString + reply;
			
			//set comment content and date
			MedicationNewsComment medicationNewsComment = new MedicationNewsComment();
			medicationNewsComment.setMedicationNewsCommentContent(replyOfComment);
			medicationNewsComment.setMedicationNewsCommentDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			
			//set news id
			MedicationNews medicationNews = medicationNewsService.getMedicationNews(Integer.parseInt(request.getParameter("medicationNewsId")));
			medicationNewsComment.setMedicationNews(medicationNews);
			
			//set user id and name
			/** 获取用户id，需要用户验证 */
			User u = (User)request.getSession().getAttribute("user");
			PharmacyUser pharmacyUser = pharmacyUserService.getPharmacyUserByName(u.getName());
			medicationNewsComment.setPharmacyUser(pharmacyUser);
			medicationNewsComment.setMedicationNewsCommentUser(pharmacyUser.getPharmacyUserName());
			
			//add comment to database
			medicationNewsCommentService.addNewsComment(medicationNewsComment); 
			
			//get news id
			MedicationNews n = medicationNewsService.getMedicationNews(medicationNews.getMedicationNewsId());
			request.getSession().setAttribute("n", n);
			
			//get comment list
			List<MedicationNewsComment> c = medicationNewsCommentService.getNewsCommentByNewsId(medicationNews.getMedicationNewsId());
			request.getSession().setAttribute("c", c);
			
			//get comments count by news id
			int count = medicationNewsCommentService.getNewsCommentCountByNewsId(medicationNews.getMedicationNewsId());
			request.getSession().setAttribute("count", count);
			
			//set comment count in news
			n.setMedicationNewsCommentCount(count);
			medicationNewsService.updateMedicationNews(n);
			
			return "medication_news_single";
			
		}else{
			
			/* post comment to the news */
			
			//set comment content and date
			MedicationNewsComment medicationNewsComment = new MedicationNewsComment();
			medicationNewsComment.setMedicationNewsCommentContent(request.getParameter("comment-message"));
			medicationNewsComment.setMedicationNewsCommentDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			
			//set news id
			MedicationNews medicationNews = medicationNewsService.getMedicationNews(Integer.parseInt(request.getParameter("medicationNewsId")));
			medicationNewsComment.setMedicationNews(medicationNews);
			
			//set user id and name
			User u = (User)request.getSession().getAttribute("user");
			PharmacyUser pharmacyUser = pharmacyUserService.getPharmacyUserByName(u.getName());
			medicationNewsComment.setPharmacyUser(pharmacyUser);
			medicationNewsComment.setMedicationNewsCommentUser(pharmacyUser.getPharmacyUserName());
			
			//add comment to database
			medicationNewsCommentService.addNewsComment(medicationNewsComment); 
			
			//get news id
			MedicationNews n = medicationNewsService.getMedicationNews(medicationNews.getMedicationNewsId());
			request.getSession().setAttribute("n", n);
			
			//get comment list
			List<MedicationNewsComment> c = medicationNewsCommentService.getNewsCommentByNewsId(medicationNews.getMedicationNewsId());
			request.getSession().setAttribute("c", c);
			
			//get comments count by news id
			int count = medicationNewsCommentService.getNewsCommentCountByNewsId(medicationNews.getMedicationNewsId());
			request.getSession().setAttribute("count", count);
			
			//set comment count in news
			n.setMedicationNewsCommentCount(count);
			medicationNewsService.updateMedicationNews(n);
			
			return "medication_news_single";
			
		}
		
		
		
		
	}
	
}
