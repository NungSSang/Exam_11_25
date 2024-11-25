<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<%@ include file="../../common/header.jsp"%>

<section>
	<div>
		<div class="overflow-x-auto flex mx-auto w-96">
		 <table class="table table-lg max-w-4xl mx-auto">
		<thead>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
			</tr>
		</thead>
		<c:forEach var="article" items="${articles }">
			<tbody>
				<tr>
					<td>${article.getId() }</td>
					<td><a href="/usr/article/detail?id=${article.getId() }">${article.getTitle() }</a></td>
					<td>${article.getWriter() }</td>
					<td>${article.getRegDate().substring(2,16) }</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
		</div>	
	</div>
</section>

<%@ include file="../../common/footer.jsp"%>