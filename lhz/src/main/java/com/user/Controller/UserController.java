package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.user.Service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	@RequestMapping("index1")
	public String index1(){
		return "index";
	}

}
