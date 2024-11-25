package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ArticleDao;
import com.example.demo.dto.ArticleDto;

@Service
public class ArticleService {
	ArticleDao articleDao;
	public ArticleService(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	public void doWrite(String title, String body, String writer) {
		articleDao.doWrite(title,body,writer);
	}
	public List<ArticleDto> getArticles() {
		return articleDao.getArticles();
	}
	public ArticleDto getArticleById(int id) {
		
		return articleDao.getArticleById(id);
	}

}
