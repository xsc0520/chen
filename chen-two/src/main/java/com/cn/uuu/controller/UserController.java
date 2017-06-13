package com.cn.uuu.controller;



import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cn.uuu.pojo.People;
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

	@RequestMapping("/testRedirect")
	public String testRedirect(){
	System.out.println("testRedirect");
	return "redirect:/index.jsp";
	//return "forward:/index.jsp";
	}
	
	@RequestMapping("/testforward")
	public String testforward(){
	System.out.println("testforwardt");
//	return "redirect:/index.jsp";
	return "forward:/index.jsp";
	}
	
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(People user){
	System.out.println("user="+user);
	return "success";
	}
	
	@ModelAttribute
	public void getUser(@RequestParam(value="id",required=false) Integer id,Map<String,Object> map){
		if(id!=null){
		//模拟从数据库中获取到的user对象
			People user = new People(1,"xi","123@qq.com",18);
			System.out.println("从数据库中查询的对象：user="+user );
			map.put("user", user);
		}
	}
	
	@RequestMapping("testMap")
	public String testMap(Map<String,Object> map){ //【重点】
	System.out.println(map.getClass().getName());
	//org.springframework.validation.support.BindingAwareModelMap
	map.put("names", Arrays.asList("Tom","Jerry","Kite"));
	return "testModelAndView";
	}
	
	
	@RequestMapping("/testModelAndView")
		public ModelAndView testModelAndView(){
		System.out.println("testModelAndView");
		String viewName = "testModelAndView";
		ModelAndView mv = new ModelAndView(viewName );
		mv.addObject("time",new Date().toString()); //实质上存放到request域中 
		return mv;
	}
	
	
	//testPOJO
	@RequestMapping(value="/testPOJO")
	public String getPolog(People people){
		System.out.println("People：：：" + people);
		return "redirect:/springmvc/helloworld";
	}
	
	@RequestMapping(value="/redirect2")
	public String redirect2(@RequestParam("name") String username
						   ,@RequestParam("pass") String pass
						   ,@RequestParam("time") String time){
		System.out.println(username);
		System.out.println("pass:"+pass);
		System.out.println("time:"+time);
		return "redirect:/springmvc/helloworld";
	}
	@RequestMapping(value="/redirect2/{name}/{pass}")
	public String redirect2(@PathVariable("name") String name01,@PathVariable("pass") String pass){
		System.out.println("name01"+name01);
		System.out.println("pass:"+pass);
		return "redirect:/springmvc/helloworld";
	}
	
	@RequestMapping(value="/helloworld")
	public String helloworld(){
		return "success";
	}
	@RequestMapping(value="/showuser", method = RequestMethod.POST)
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
	
	
	
	@RequestMapping(value="/register",method= RequestMethod.POST)
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
}
