<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>轮播图</title>
	<link rel="stylesheet" href="${path}/resources/css/style.css">
	<script src="${path}/resources/js/main.js"></script>
</head>

<body>

<div class="app">
	<div class="scroll">
		<!-- 图片展示 -->
		<img src="${path}/images/s1.png" alt="scrollImage" class="img current">
		<img src="${path}/images/s2.png" alt="scrollImage" class="img">
		<img src="${path}/images/s3.png" alt="scrollImage" class="img">
		<img src="${path}/images/s4.png" alt="scrollImage" class="img">
		<img src="${path}/images/s5.png" alt="scrollImage" class="img">

		<!-- 左右箭头的展示 -->
		<div class="lf"></div>
		<div class="lr"></div>

		<!-- 小圆点展示 -->
		<div class="dots">
			<span class="square"></span>
			<span></span>
			<span></span>
			<span></span>
			<span></span>
		</div>
	</div>
</div>

</body>

