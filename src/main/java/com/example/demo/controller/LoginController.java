package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.bean.Usuario;
import com.example.demo.model.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping (value = {"/login","/"})
	public ModelAndView login () {
		ModelAndView mv = new ModelAndView ("login");
		mv.addObject(new Usuario());
		return mv;
		}
	
	@PostMapping("/fazerLogin")
	public String fazerLogin (Usuario usuario) {
		if(loginService.logar(usuario)) {
			return "redirect:veiculos";
		}
		return "login";
	}
	
}
