package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ReplyDto;
import com.example.demo.service.ReplyService;


@Controller
public class ReplyController {
	
	ReplyService replyService;
	public ReplyController(ReplyService replyService) {
		this.replyService = replyService;
	}
	
	public List<ReplyDto> showReplies(int relId) {
		return replyService.getReplyByRelId(relId); 
	}
	
	@PostMapping("/usr/reply/writereply")
	@ResponseBody
	public void writereply(int writerId, int relId, String body) {
		replyService.getWriteReply(writerId,relId, body);
	}
	public String writerNameById(int writerId) {
		return replyService.writerNameById(writerId);
	}
}
