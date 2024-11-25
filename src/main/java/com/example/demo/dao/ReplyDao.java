package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.ReplyDto;

@Mapper
public interface ReplyDao {

	@Select("""
			SELECT *
					FROM reply
					WHERE relId = #{relId}
			""")
	List<ReplyDto> getReplyByRelId(int relId);

	@Insert("""
			INSERT INTO reply
					SET writerId = #{writerId}
						,relId = #{relId}
						,`body` = #{body}
						,regDate = NOW()
						,updateDate = NOW()
			""")
	void getWriteReply(int writerId,int relId, String body);

	@Select("""
			SELECT * ,m.name
					FROM `member` AS m
					INNER JOIN reply AS r
					ON r.writerId = m.Id
					WHERE r.writerId = #{writerId}
			""")
	String writerNameById(int writerId);

}
