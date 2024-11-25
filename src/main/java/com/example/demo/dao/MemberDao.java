package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.dto.MemberDto;

@Mapper
public interface MemberDao {
	@Insert("""	
			INSERT INTO `member`
						SET `name` = #{name}
						,eMail = #{eMail}
						,`password` = #{password}
						,regDate = NOW()
						,updateDate = NOW();
			""")
	public  void joinMember(String name, String eMail, String password);

	@Select("""
			SELECT *
			 		FROM `member`
					WHERE eMail = #{eMail} AND password = #{password}
			""")
	public MemberDto loginMemberBYeMail(String eMail, String password);

	@Select("""
			SELECT *
				FROM `member`
				WHERE eMail = #{eMail}
			""")
	public MemberDto getMember(String eMail);

	@Update("""
			UPDATE `member`
					SET `password` = {password}
					WHERE eMail = #{eMail} 
			""")
	public void doModifyMember(String eMail, String password);

	@Select("""
			SELECT *
				FROM `member`
				WHERE id = #{id}
			""")
	public MemberDto getMemberById(int id);
	
}
