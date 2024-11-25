package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.MemberDto;

@Service
public class MemberService {
	MemberDao memberDao;
	private MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void joinMember(String name, String eMail, String password) {
		memberDao.joinMember(name,eMail,password);
	}

	public MemberDto loginMemberBYeMail(String eMail, String password) {
		return memberDao.loginMemberBYeMail(eMail,password);
	}

	public MemberDto getMember(String eMail) {
		return memberDao.getMember(eMail);
	}

	public void doModifyMember(String eMail, String password) {
		memberDao.doModifyMember(eMail, password);
	}

	public MemberDto getMemberById(int id) {
		return memberDao.getMemberById(id);
	}

}
