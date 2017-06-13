package com.cn.uuu.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cn.uuu.pojo.User;

public class UserInterceptor extends HandlerInterceptorAdapter{
	
	
    public boolean preHandle(HttpServletRequest request,  
            HttpServletResponse response, Object handler) throws Exception {
    	System.out.println("preHandle");
    	String name = request.getParameter("username");
    	System.out.println("name:"+name);
		
		return true;  
    }  
  
    public void postHandle(HttpServletRequest request,  
            HttpServletResponse response, Object o, ModelAndView mav)  
            throws Exception {  
        System.out.println("postHandle");  
    }  
  
    public void afterCompletion(HttpServletRequest request,  
            HttpServletResponse response, Object o, Exception excptn)  
            throws Exception {  
        System.out.println("afterCompletion");  
    }  
  
    
  
}  