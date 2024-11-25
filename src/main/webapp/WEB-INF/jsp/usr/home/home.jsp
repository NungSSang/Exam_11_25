<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 테일윈드CSS -->
<script src="https://cdn.tailwindcss.com"></script>
<!-- 데이지 UI -->
<link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.14/dist/full.min.css" rel="stylesheet" type="text/css" />
<!-- JQuery -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<!-- 폰트어썸 -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" />
<!-- common css -->
<!-- <link rel="stylesheet" href="/resource/common.css" /> -->

<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<section>
	<div class="container">
		<a class="btn" href="/usr/member/join">회원가입</a>
		<a class="btn" href="/usr/member/login">로그인</a>
		<a class="btn" href="../member/usrInfo?&id=${loginedMember }">유저정보</a>
		<a class="btn" href="../article/write">게시글 작성</a>
		<a class="btn" href="../article/list">리스트</a>
	</div>	
</section>

</head>
<body>