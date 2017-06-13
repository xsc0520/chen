package com.cn.uuu.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
