package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
	MemberController memberController;
	public homeController(MemberController memberController) {
		this.memberController = memberController;
	}
	@GetMapping("/usr/home/home")
	public String home() {
		int loginedMember = memberController.logined;
		return "usr/home/home";
	}
}
