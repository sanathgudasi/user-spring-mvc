package com.ripplestreet.usermvc.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ripplestreet.usermvc.dao.UserDao;
import com.ripplestreet.usermvc.dto.User;
import com.ripplestreet.usermvc.service.UserService;
@Controller
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String homePage() {
		return "welcome";
	}
	@RequestMapping("/form")
	public ModelAndView form(ModelAndView mv) {
		mv.setViewName("form");
		mv.addObject("user", new User());
		return mv;
	}
	
	@PostMapping("/reg")
	public ModelAndView register(@ModelAttribute("user") User user, ModelAndView mv) {
		User u = userService.save(user);
		mv.setViewName("welcome");
		mv.addObject("user", u);
		return mv;
		
	}
	
	@GetMapping("/view")
	public Model view(Model model) {
		List<User> list = userService.view();
		model.addAttribute("list", list);
		return model;
	}
	}

