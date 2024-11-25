package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ArticleDto;
import com.example.demo.dto.ReplyDto;
import com.example.demo.service.ArticleService;



@Controller
public class ArticleController {
	ArticleService articleService;
	ReplyController replyController;
	public ArticleController(ArticleService articleService, ReplyController replyController) {
		this.articleService = articleService;
		this.replyController = replyController;
	}
	@GetMapping("/usr/article/write")
	public String getMethodName() {
		return "usr/article/write";
	}
	@PostMapping("/usr/article/doWrite")
	@ResponseBody
	public String doWrite(String title, String body, String writer) {
		articleService.doWrite(title, body, writer);
		return "작성완료";
	}
	@GetMapping("/usr/article/list")
	public String articleList(Model model) {
		List<ArticleDto> articles = articleService.getArticles();
		model.addAttribute("articles",articles);
		return "usr/article/list";
	}
	@GetMapping("/usr/article/detail")
	public String detail(Model model, int id) {
		ArticleDto foundArticle = articleService.getArticleById(id);
		List<ReplyDto> replies = replyController.showReplies(foundArticle.getId());
		model.addAttribute("foundArticle",foundArticle);
		model.addAttribute("replies",replies);
		return "usr/article/detail";
	}

	
}
