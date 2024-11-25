<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<%@ include file="../../common/header.jsp"%>

<script>

	const replyWrite_submit = function(form){
		form.body.value = form.body.value.trim();
		if(form.body.value.length == 0){
			alert("댓글은 공백 불가");
			form.body.focus();
			return;
		}
		form.submit();
	}
</script>

<section>
	<div class="container">
		<table class="table">
			<thead>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
			</tr>
		</thead>
			<tbody>
				<tr>
					<td>${foundArticle.getId() }</td>
					<td>${foundArticle.getTitle() }</td>
					<td>${foundArticle.getWriter() }</td>
					<td>${foundArticle.getRegDate().substring(2,16) } </td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="container">
		<div>댓글</div>
		<c:forEach var="reply" items="${replies }">
		<table class="table max-w-md">
			<thead>
			<tr>
				<th>작성자</th>
				<th>내용</th>
				<th>작성일</th>
			</tr>
		</thead>
			<tbody>
				<tr>
					<td>${reply.getWriterId() }</td>
					<td>${reply.getBody() }</td>
					<td>${reply.getRegDate().substring(2,16) }</td>
				</tr>
			</tbody>
		</table>
		</c:forEach>
	</div>
	<div class="container">
		<div>댓글 작성</div>
		<form action="../reply/writereply" method="post" onsubmit="replyWrite_submit(this); return false;">
		<table class="table">
			<thead>
			<tr>
				<td>내용</td>
			</tr>
		</thead>
			<tbody>
				<tr><td><input type="hidden" name="writerId" value="${foundArticle.getId() }"/></td>
					<td><input type="hidden" name="relId" value="${foundArticle.getId() }"/></td>
					<td><textarea class="max-w-md" name="body" class="textarea textarea-bordered h-96 w-full" placeholder="댓글을 입력해 주세요"></textarea></td>
				</tr>
				<td><button class="btn">댓글 작성</button></td>
			</tbody>
		</table>
		</form>
	</div>
</section>

<%@ include file="../../common/footer.jsp"%>