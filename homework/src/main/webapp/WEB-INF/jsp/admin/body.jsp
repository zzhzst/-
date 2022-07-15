<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>body</title>

<link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>
	<style>
		*{
			margin: 0;
			padding: 0;
		}

		html,body{
			width: 100%;
			height: 100%;
		}

		.main{
			width: 100%;
			height: 100%;
			background: url("") 100% 100% no-repeat;
		}

		.loginFrame1{
			width: 300px;
			height: 200px;
			background-color: deepskyblue;
			position: absolute;
			top: 250px;
			left: 200px;
			margin: auto;

			border-radius: 10px;
			padding: 20px 0;
			box-sizing: border-box;
			box-shadow:0 0 5px 5px rgba(0,0,0,0.4);
		}

		.loginFrame2{
			width: 300px;
			height: 200px;
			background-color: rgb(255,144,116);
			position: absolute;
			top: 250px;
			left: 650px;
			margin: auto;

			border-radius: 10px;
			padding: 20px 0;
			box-sizing: border-box;
			box-shadow:0 0 5px 5px rgba(0,0,0,0.4);
		}

		.loginFrame > div{
			width: 350px;
			height: 50px;
			margin: 20px auto;

			color: white;
		}

		.loginFrame1 > p{
			text-align: center;
			color: white;
			font-size: 25px;
		}

		.loginFrame2 > p{
			text-align: center;
			color: white;
			font-size: 25px;
		}

		.loginFrame3 > p{
			text-align: center;
			color: white;
			font-size: 25px;
		}

		.loginFrame > div span{
			display: inline-block;
			cursor: pointer;
			font-size: 20px;
		}



		svg{
			vertical-align: bottom;
		}
	</style>
	<script type="text/javascript">
		$(function(){
			$.ajax({
				type: "post",
				url: "${path}/user/countUserNumber",
				dataType: "json",
				success: function (data) {
				}
		});
			$.ajax({
				type: "post",
				url: "${path}/com/countComNumber",
				dataType: "json",
				success: function (data) {
				}
			});
			$.ajax({
				type: "post",
				url: "${path}/job/countJobNumber",
				dataType: "json",
				success: function (data) {
				}
			});
			$.ajax({
				type: "post",
				url: "${path}/apply/countApplyNumber",
				dataType: "json",
				success: function (data) {
				}
			});
		});


	</script>

</head>

<body>
<div class="main">
	<br><br>
	<p style="font-size: 25px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;亲爱的admin，欢迎登录！</p>

	<div class="loginFrame1">

		<p>用 户 统 计</p>
		&nbsp;&nbsp;<p style="font-size: 20px;" id="userNumber">累计人数： ${sessionScope.userNumber}人</p>
		&nbsp;<p style="font-size: 20px;">投递次数： ${sessionScope.applyNumber} 人</p>

	</div>

	<div class="loginFrame2">

		<p>企 业 统 计</p>
		&nbsp;&nbsp;<p style="font-size: 20px;">累计企业： ${sessionScope.comNumber} 个</p>
		&nbsp;<p style="font-size: 20px;">累计职位： ${sessionScope.jobNumber} 个</p>

	</div>
</div>
</body>
</html>
