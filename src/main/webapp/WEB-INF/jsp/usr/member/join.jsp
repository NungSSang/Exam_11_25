<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<%@ include file="../../common/header.jsp"%>


<script>
	join_submit = function(form){
		form.name.value = form.name.value.trim();
		form.eMail.value = form.eMail.value.trim();
		form.password.value = form.password.value.trim();
		form.passwordCheck.value = form.passwordCheck.value.trim();
		
		if(form.name.value.length == 0){
			form.name.value.focus();
			return;
		}
		if(form.eMail.value.length == 0){
			form.eMail.value.focus();
			return;
		}
		if(form.password.value.length == 0){
			form.password.value.focus();
			return;
		}
		if(form.passwordCheck.value.length == 0){
			form.passwordCheck.value.focus();
			return;
		}
		if(form.password.value != form.passwordCheck.value){
			alert("비밀번호가 다릅니다.");
			form.passwordCheck.value.focus();
			return;
		}
		form.submit();
	}
</script>

<section>
	<div class="container">
		<div class="overflow-x-auto flex mx-auto w-96">
			<form action="/usr/member/doJoin" method="post" onsubmit="join_submit(this); return false;">
			 <table class="table table-zebra">
			    <thead>
			      <tr>
			        <th>회원가입</th>
			      </tr>
			    </thead>
			    <tbody>
			      <tr>
			        <th>이름</th>
			        <td><input type="text" name="name"/></td>
			      </tr>
			      <tr>
			        <th>이메일</th>
			        <td><input type="text" name="eMail" /></td>
			      </tr>
			      <tr>
			        <th>비밀번호</th>
			        <td><input type="text" name="password" /></td>
			      </tr>
			      <tr>
			        <th>비밀번호 확인</th>
			        <td><input type="text" name="passwordCheck"/></td>
			      </tr>
			      <tr>
			        <td colspan="2"><button class="btn">회원가입</button></td>
			      </tr>
			    </tbody>
			  </table>
			  </form>
		</div>	
	</div>
</section>

<%@ include file="../../common/footer.jsp"%>