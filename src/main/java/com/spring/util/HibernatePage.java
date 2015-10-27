package com.spring.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HibernatePage {
	
	
	
	 public static List findOnePage(Session session,String strHQL, int offset, int pagesize){
	        List lst = null;
	        try {
	            Query query = session.createQuery(strHQL);
	            if (offset != 0 && pagesize != 0) {
	                query.setFirstResult((offset - 1) * pagesize);
	                query.setMaxResults(pagesize);
	            }
	            lst = query.list();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        return lst;
	    }
	   
	   public int totalRecord(Session session,String strHQL,int pagesize){
		   Query query = session.createQuery(strHQL);
		   String count = (query.iterate().next()).toString();
		   System.out.println("COUNT"+count);
		   int n = Integer.parseInt(count);
		   int total = (n + pagesize - 1)/pagesize;

		   return total;
	   }
	   
//	   public List cutPage(String pageHql,int firstResult,int MaxResults)
//	   {
//
//	   session = HibernateSessionFactory.currentSession();
//	   query = session.createQuery(pageHql);
//	   query.setFirstResult(firstResult);
//	   query.setMaxResults(MaxResults);
//	   return query.list();
//	   }

}
