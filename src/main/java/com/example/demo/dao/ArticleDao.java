package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.ArticleDto;

@Mapper
public interface ArticleDao {
	
	@Insert("""
			INSERT INTO article
					SET title = #{title}
						,`body` = #{body}
						,writer = #{writer}
						,regDate = NOW()
						,updateDate = NOW()
			""")
	void doWrite(String title, String body, String writer);

	@Select("""
			SELECT * FROM article
			""")
	List<ArticleDto> getArticles();

	@Select("""
			SELECT *
			 		FROM article
					WHERE id = #{id}
			""")

	ArticleDto getArticleById(int id);

}
