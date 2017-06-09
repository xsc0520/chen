package com.cn.uuu.controller;



import java.lang.reflect.Field;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cn.uuu.pojo.User;
import com.cn.uuu.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userServiceImpl")
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value="/showuser.do", method = RequestMethod.POST)
	public String toIndex(HttpServletRequest request,Model model){
		User userLogin=new User();
		userLogin.setUsername(request.getParameter("username"));
		userLogin.setPassword(request.getParameter("password"));
		
		 User user=new User();

		if(this.userService.getLoginUser(userLogin)){
          user=this.userService.getUserByusername(userLogin.getUsername());
          System.out.println(user.toString()+"get user success");
          model.addAttribute("user", user);
          
		}else{
			
			model.addAttribute("user can not in use");
			System.out.println("can not get user");
		}
	      	return "indexuser";
	}
	
	
	
	@RequestMapping(value="/register.do",method= RequestMethod.POST)
	public String registerIndex(HttpServletRequest request,Model model){
		
		//ModelAndView mav=new ModelAndView();

		User userRegister=new User();
		String username2=request.getParameter("username");
		String password2=request.getParameter("password");
		userRegister.setUsername(username2);
		userRegister.setPassword(password2);
		System.out.println(username2+"密码是"+password2);
		
			
			User user2 = new User();  
			user2.setUsername(username2);  
			user2.setPassword(password2);  
			userRegister=user2;			
		
		
		int id=this.userService.inster(userRegister);

        User user=this.userService.getUserByusername(username2);
        
        System.out.println(user.toString()+"insert user success");
        
        model.addAttribute("user", user);
		
	    return "indexuser";
	}

	
public static void main(String[] args) throws Exception {
	String s = "abd";
	method(s);
	System.out.println(s);
}

private static void method(String s) throws Exception {
	Field field = String.class.getDeclaredField("value");
    field.setAccessible(true);
    field.set(s, "bcd".toCharArray());
	
}


	
	
}
