package com.cn.uuu.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserRegisterInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request,  
            HttpServletResponse response, Object handler) throws Exception {
    	System.out.println("preHandle-Register");
    	String name = request.getParameter("username");
    	System.out.println("name:"+name);
		
		return true;  
    }  
  
    public void postHandle(HttpServletRequest request,  
            HttpServletResponse response, Object o, ModelAndView mav)  
            throws Exception {  
        System.out.println("postHandle-Register");  
    }  
  
    public void afterCompletion(HttpServletRequest request,  
            HttpServletResponse response, Object o, Exception excptn)  
            throws Exception {  
        System.out.println("afterCompletion-Register");  
    }  
}
