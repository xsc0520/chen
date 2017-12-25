package com.cn.uuu.util;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.MDC;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class IpAndPortListener implements ServletRequestListener  {




	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void requestInitialized(ServletRequestEvent requestEvent) {
		 if (!(requestEvent.getServletRequest() instanceof HttpServletRequest)) {
	            throw new IllegalArgumentException(
	                    "Request is not an HttpServletRequest: " + requestEvent.getServletRequest());
	        }
	        HttpServletRequest request = (HttpServletRequest) requestEvent.getServletRequest();
	        ServletRequestAttributes attributes = new ServletRequestAttributes(request);
	        request.setAttribute("ee", attributes);
	        LocaleContextHolder.setLocale(request.getLocale());
	        RequestContextHolder.setRequestAttributes(attributes);
		
		String localAddr = request.getLocalAddr();
		int localPort = request.getLocalPort();
		String localName = request.getLocalName();
		MDC.put("ip", localAddr);
		MDC.put("port", localPort);
		MDC.put("name", localName);
		
		
		
		
		
	}


}
