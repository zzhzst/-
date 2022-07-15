<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>

<title>top</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
li {
	padding-left: 20px;
	font-size: 17px;
	font-family: inherit;
	padding-top: 10px;
}
</style>
</head>

<body>
<div id="divAll">
	<div style="font-size: 10pt;">
	<!-- 根据用户是否登录，显示不同的链接 -->
	<c:choose>
		<c:when test="${empty sessionScope.currUser}">
			<ul class="nav nav-pills bg">
				<li class="active"><a href="${path}/main/index" target="_parent">Welcome to 蓝精领</a></li>
				<li class="col-md-3"></li>
				<li style="width: 400px;"></li>
				<li><a href="${path}/main/userLogin" target="_parent">用户登录/注册</a></li>
				<li><a href="${path}/main/loginOrRegist" target="_parent">企业登录/注册</a></li>
			</ul>
		</c:when>
		<c:when test="${!empty sessionScope.currUser}">
			<div style="height: 40px; width: 100%; float: right;">
				<ul class="nav nav-pills bg">
					<li class="active"><a href="${path}/main/index"
						target="_parent">蓝精领</a></li>
					<li style="width: 600px;"></li>
					<li class="col-md-2" style="text-align:center;"><a href="javascript:void(0)">用户：${sessionScope.currUser.realname}</a></li>
					<li class="col-sm-1" style="width:140px;"><a href="${path}/user/showResume" target="body">个人简历</a></li>
					<li class="col-sm-1" style="text-align:center;"><a href="${path}/user/exit" target="_parent">退出</a></li>
				</ul>
			</div>
		</c:when>
	</c:choose>


	</div>
</div>
</body>
</html>
