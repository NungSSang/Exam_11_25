package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
	private int id;
	private String title;
	private String body;
	private String writer;
	private String regDate;
	private String updateDate;
}
