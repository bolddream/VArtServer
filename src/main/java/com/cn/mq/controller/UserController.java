package com.cn.mq.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.mq.pojo.User;
import com.cn.mq.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request,Model model){
		String userName = request.getParameter("name");
		int success = this.userService.addNewUser(userName);
		return "addUser";
	}
	
//	@RequestMapping(value="/findUser",method = RequestMethod.POST)
//	public String getUser(){	
//		return "findUser";
//	}
	
//	
//	@RequestMapping("/reg")
//	public String toReg(HttpServletRequest request,Model model){
//		int userId = Integer.parseInt(request.getParameter("id"));
//		User user = this.userService.getUserById(userId);
//		model.addAttribute("user", user);
//		return "reg";
//	}
}
