<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<%@ include file="../../common/header.jsp"%>

<script>
	write_submit = function(form){
	
		form.title.value = form.title.value.trim();
		form.body.value = form.body.value.trim();		
		if(form.title.value.length == 0){
			alert("제목은 공란 불가");
			form.title.value.focus();
			return;
		}
		if(form.body.value.length == 0){
			alert("내용은 공란 불가");
			form.body.value.focus();
			return;
		}
		form.submit();
	}

</script>

<section>
	<div class="container">
		<div class="overflow-x-auto flex mx-auto w-96">
			<form action="/usr/article/doWrite" method="post" onsubmit="write_submit(this); return false">
			 <table class="table table-zebra">
			    <thead>
			      <tr>
			        <th>게시글 작성</th>
			      </tr>
			    </thead>
			    <tbody>
			      <tr>     
			        <td><input type="hidden" name="writer" value=""/></td>
			      </tr>
			      <tr>
			        <th>제목</th>
			        <td><input type="text" name="title" /></td>
			      </tr>
			      <tr>
			        <th>내용</th>
			        <td><textarea name="body" class="textarea textarea-bordered h-96 w-full" placeholder="내용을 입력해 주세요"></textarea></td>
			      </tr>
			       <tr>
			        <td><button class="btn">작성</button></td>
			      </tr>
			    </tbody>
			  </table>
			  </form>
		</div>	
	</div>
</section>

<%@ include file="../../common/footer.jsp"%>