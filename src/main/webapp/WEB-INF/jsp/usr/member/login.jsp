<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<%@ include file="../../common/header.jsp"%>

<script>
	login_submit = function(form){
		console.log("안들어옴?");
		form.eMail.value = form.eMail.value.trim();
		form.password.value = form.password.value.trim();
		if(form.eMail.value.length == 0){
			form.eMail.value.focus();
			return;
		}
		if(form.password.value.length == 0){
			form.password.value.focus();
			return;
		}
		form.submit();
	}

</script>

<section>
		<div class="container">
		<div class="overflow-x-auto flex mx-auto w-96">
			<form action="/usr/member/doLogin" method="post" onsubmit="login_submit(this); return false;">
				 <table class="table table-zebra">
				    <thead>
				      <tr>
				        <th>로그인 페이지</th>
				      </tr>
				    </thead>
				    <tbody>
				      <tr>
				        <th>이메일</th>
				        <td><input type="text" name="eMail" /></td>
				      </tr>
				      <tr>
				        <th>비밀번호</th>
				        <td><input type="text" name="password" /></td>
				      </tr>
				      <tr>
				        <td colspan="2"><button class="btn">로그인</button></td>
				      </tr>
				  </tbody>
			  </table>
		  </form>
		</div>	
	</div>
</section>


<%@ include file="../../common/footer.jsp"%>