package com.spring.web;

import java.text.SimpleDateFormat;

import org.hibernate.Criteria;
import org.hibernate.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.domain.News;
import com.spring.domain.NewsComms;
import com.spring.domain.User;
import com.spring.service.NewsCommsModel;
import com.spring.service.NewsModel;
import com.spring.util.HibernatePage;

@Controller
@Transactional
public class NewsController{
	@Resource(name="newsService")
	private NewsModel newsService;
	
	@Resource(name="newscommsService")
	private NewsCommsModel newscommsService; 
	
	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	private HibernatePage hPage;
	
	
	
	public HibernatePage gethPage() {
		return hPage;
	}

	public void sethPage(HibernatePage hPage) {
		this.hPage = hPage;
	}

	@RequestMapping(value="/newslist")
	public String listNews(HttpServletRequest request){
		String path1 = request.getContextPath();
		
		List<News>newslist = newsService.queryAll("from News");
		List<News>nlist1 =  new ArrayList<News>();
		List<News>nlist2 =  new ArrayList<News>();
		for(int i = 0;i<newslist.size(); i++){
			if (newslist.get(i).getId() % 2 == 0) {
				nlist1.add(newslist.get(i));
				String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+newslist.get(i).getNewsimg();
				System.out.println("CC"+request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1);
				request.getSession().setAttribute("base", basePath);
				request.getSession().setAttribute("nlist1", nlist1);
			} else {
				nlist2.add(newslist.get(i));
				String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+newslist.get(i).getNewsimg();
				request.getSession().setAttribute("base2", basePath);
				request.getSession().setAttribute("nlist2", nlist2);
			}
		}
		User user = (User)request.getSession().getAttribute("user");
		if (user != null){
			return "news";
		}
		return "newsdoc";
	}
	
	@RequestMapping(value="/viewnews",method=RequestMethod.GET)
	public String viewNews(@RequestParam(value="nid",required=false)  int id, HttpServletRequest request){
		News news = newsService.queryOne("News", id);
		request.getSession().setAttribute("news", news);
		return "redirect:/viewnewsmore";
	}
	
	@RequestMapping(value="/viewnewsmore",method=RequestMethod.GET)
	public String viewNewsMore(@RequestParam(value="cpage",required=false)  Integer cpage, HttpServletRequest request){
		if(cpage == null){
			cpage=1;
		}
		Session session = sessionFactory.getCurrentSession();
		News news = (News)request.getSession().getAttribute("news");
		//Criteria criteria = session.createCriteria(NewsComms.class);
		List<NewsComms>newlist = newscommsService.queryNewsComms(news.getId());
		int total = newlist.size();
		int pageSize = 2;
		int firstResultIndex=pageSize*(cpage-1);
		System.out.println("FIRST"+firstResultIndex);
		List <NewsComms>list = newscommsService.h_Page("select a from com.spring.domain.NewsComms a where a.news.id="+news.getId()+" order by id desc", firstResultIndex, pageSize);
		//System.out.println(list.get(0).getCommcontents());
//		for(int i=0;i<list.size();i++){
//			System.out.println("LIST"+list.get(i).getCommcontents()+list.get(i).getUser().getName());
//		}

		request.getSession().setAttribute("nlist", list);
		request.getSession().setAttribute("cpage", cpage);
		request.getSession().setAttribute("total", total);
		User user = (User)request.getSession().getAttribute("user");
		if(user != null){
			return "newsdetail2";
		}
		return "newsdetaildoc";
	}
	
	@RequestMapping(value="/addnewscomm",method=RequestMethod.POST)
	public String addNewsComm(HttpServletRequest request){
		News news = (News) request.getSession().getAttribute("news");
		NewsComms newscomms = new NewsComms();
		User user = (User)request.getSession().getAttribute("user");
		if (user != null){
			Date now = new Date(); 
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  	    String time1 = dateFormat.format( now ); 
			newscomms.setCommcontents(request.getParameter("newscomms"));
			newscomms.setNcdate(time1);
			newscomms.setNews(news);
			newscomms.setUser(user);
			newscommsService.add(newscomms);
			return "redirect:/viewnews1";
		}
		else 
			return "index";
	}
	
	@RequestMapping(value="/addnewcomm1",method=RequestMethod.POST)
	public String addNewsReply(@RequestParam(value="commid",required=false) Integer id,HttpServletRequest request){
		News news = (News) request.getSession().getAttribute("news");
		NewsComms commsorg = newscommsService.queryOne("NewsComms", id);
		NewsComms newscomms = new NewsComms();
		User user = (User)request.getSession().getAttribute("user");
		if (user != null){
			Date now = new Date(); 
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  	    String time1 = dateFormat.format( now ); 
	  	    newscomms.setNcdate(time1);
	  	    String newsrep = request.getParameter("newscommsrep");
	  	    
			newscomms.setCommcontents("<blockquote><footer>"+commsorg.getUser().getName()+" said at "+ commsorg.getNcdate()+
					" :"+"</footer>"+ commsorg.getCommcontents()+"</blockquote>"+newsrep);
			
			newscomms.setNews(news);
			newscomms.setUser(user);
			newscommsService.add(newscomms);
			return "redirect:/viewnews1";
		}
		else 
			request.setAttribute("msg","Please Logon!");
			return "index";
	}
	
	@RequestMapping(value="/viewnews1")
	public String viewNews1(HttpServletRequest request){
		News news = (News) request.getSession().getAttribute("news");
		return "redirect:/viewnewsmore";
	}
}
