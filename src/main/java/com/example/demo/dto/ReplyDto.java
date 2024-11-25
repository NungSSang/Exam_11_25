package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDto {
	private int id;
	private int writerId;
	private int relId;
	private String body;
	private String regDate;
	private String updateDate;
	
	private String name;
}
