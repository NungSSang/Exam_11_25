package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.MemberDto;
import com.example.demo.service.MemberService;



@Controller
public class MemberController {
	MemberService memberService;
	public int logined = -1;
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	@GetMapping("/usr/member/join")
	public String join() {
		return "usr/member/join";
	}
	
	@PostMapping("/usr/member/doJoin")
	@ResponseBody
	public String doJoin(String name, String eMail, String password) {
		MemberDto member = memberService.getMember(eMail);
		if(member != null) {
			return "이미 존재하는 아이디 입니다.";
		}else {
			memberService.joinMember(name,eMail,password);
			return "가입되었습니다.";
		}
	}
	@GetMapping("/usr/member/login")
	public String login() {
		return "usr/member/login";
	}
	@PostMapping("/usr/member/doLogin")
	@ResponseBody
	public String doLogin(String eMail, String password) {
		
		MemberDto member = memberService.loginMemberBYeMail(eMail,password);
		if(member == null) {
			return "존재하지 않는 아이디 입니다.";
		}else if(!member.getPassword().equals(password)) {
			return "비밀번호 오류";
		}
		logined = member.getId();
		return "로그인 되었습니다";
	}
	@GetMapping("/usr/member/modifyMember")
	public String modifyMember() {
		return "usr/member/doModifyMember";
	}
	@PostMapping("/usr/member/doModifyMember")
	public String doModifyMember(Model model, String eMail, String password) {
		int loginedId = -1;
		MemberDto member = memberService.loginMemberBYeMail(eMail, password);
		loginedId = member.getId();
		if(loginedId == -1) {
			return "usr/member/doModifyMember";
		}		
		memberService.doModifyMember(eMail, password);
		model.addAttribute("member",member);
		return "usr/home/home";
	}
	
	@GetMapping("/usr/member/usrInfo")
	public String usrInfo(Model model, int id) {
		MemberDto member = memberService.getMemberById(id);
		model.addAttribute("member",member);
		return "usr/member/usrInfo";
	}
}
