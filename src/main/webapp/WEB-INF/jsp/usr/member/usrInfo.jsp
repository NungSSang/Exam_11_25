<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<%@ include file="../../common/header.jsp"%>

<section>
	<div class="container">
		<div class="overflow-x-auto flex mx-auto w-96">
				 <table class="table table-zebra">
				    <thead>
				      <tr>
				        <th>회원정보 페이지</th>
				      </tr>
				    </thead>
				    <tbody>
				      <tr>
				        <th>이메일</th>
				        <td>${member.getEMail() }</td>
				      </tr>
				      <tr>
				        <th>비밀번호</th>
				        <td>${member.getPassword() }</td>
				      </tr>
				      <tr>
				     	 <th>이름</th>
				       	 <td>${member.getName() }</td>
				      </tr>
				  </tbody>
			  </table>
		</div>	
	</div>
</section>

<%@ include file="../../common/footer.jsp"%>