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
<style type="text/css">
#divAll {
	width:100%;
	height:100%;
	background-color:black;
	opacity: 0.9;
}
#divTitle{
	margin:0 auto;
	font-size: 20px;
	font-family: inherit;
	padding-top:30px;
	text-align:center;
	font-weight: bold;
	color: white;
}
#divAdmin{
	float: right;
	width:350px;
	height:100px;
	font-size:16px;
	font-weight: bold;
	color: white;
}
</style>
</head>

<body>
	<div id="divAll">
		<div id="divTitle">蓝精领后台管理系统</div>
		<div id="divAdmin">
			用户：${sessionScope.currCom.companyName}
			&nbsp;&nbsp;&nbsp;&nbsp;<a href="${path}/com/exit" target="_parent">退出</a>
		</div>
	</div>
</body>
</html>
