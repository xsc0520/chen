package com.cn.uuu.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.cn.uuu.pojo.User;

@Controller  //声明Bean对象，为一个控制器组件
@RequestMapping("/springmvc")
public class HelloWorldController {
	
	
	@RequestMapping("/helloworld")
	public String helloworld2(){
		return "successhelloworld";
	}
	@RequestMapping("/testServletAPI")
	public void testServletAPI(HttpServletRequest request,HttpServletResponse response, Writer out) throws IOException {
	System.out.println("testServletAPI, " + request + ", " + response);
	out.write("hello springmvc");
	//return "success";
	}
	@RequestMapping("/test")
	@ResponseBody
	public ModelAndView helloworld4(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView mav = new ModelAndView("jsonView");
		Cookie dd = WebUtils.getCookie(request, "pro_encryptStr");
		System.out.println("cookie:"+dd.getValue());
		String s = "dddd";
		mav.addObject("person", s);
		mav.addObject("person2", "ss");
		mav.addObject("person3", "bb");
		return mav;
	}
}
