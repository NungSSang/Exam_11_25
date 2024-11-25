package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ReplyDao;
import com.example.demo.dto.ReplyDto;

@Service
public class ReplyService {

	ReplyDao replyDao;
	public ReplyService(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}
	public List<ReplyDto> getReplyByRelId(int relId) {
		return replyDao.getReplyByRelId(relId);
	}
	public void getWriteReply(int writerId, int relId, String body) {
		replyDao.getWriteReply(writerId,relId,body);
	}
	public String writerNameById(int writerId) {
		return replyDao.writerNameById(writerId);
		
	}

}
