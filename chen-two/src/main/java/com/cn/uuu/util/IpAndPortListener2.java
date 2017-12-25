package com.cn.uuu.util;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class IpAndPortListener2 implements ServletContextListener  {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent ss) {
		
		Enumeration<String> servletContext = ss.getServletContext().getAttributeNames();
		while(servletContext.hasMoreElements()){
			Object o=servletContext.nextElement();
			System.out.println(o);
		}
	}

}
