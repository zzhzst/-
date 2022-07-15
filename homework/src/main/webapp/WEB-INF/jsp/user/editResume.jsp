<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="${path}/resources/css/edit.css" rel="stylesheet">
	<script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
	<script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>
<style type="text/css">
#divTable {
	width: 100%;
	margin: 0 auto;
	text-align: center;
	padding-bottom: 20px;
	background-color: white;
}
</style>
<script type="text/javascript">
	 function saveResume(){
		var email=document.getElementById("email").value;
		if(email.length==0){
			alert("邮箱不能为空");
			return false;
		}else{ 
			var pattern = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
			if(!pattern.test(document.getElementById("email").value))
			{
				alert('\n请输入正确的邮箱格式!');
				return false;
			}
		}
		$("#submitForm").submit();
	}
</script>
</head>
<body>
	
	<form action="${path}/user/saveResume" method="post" id="submitForm">
		<input type="hidden" name="uid" value="${user.uid}">
		<input type="hidden" name="loginName" value="${user.loginName }" />
		<input type="hidden" name="loginPwd" value="${user.loginPwd }" />
		<input type="hidden" name="realname" value="${user.realname }" />
	<div id="divTable">
		<div class="row">
			<h3 class="text-center">个人简历</h3>
		</div>
		<div class="row">
			<div class="col-md-4 text-center"><img src="${path}/images/2.jpeg" alt="" width="100px" height="100px"></div>
			<div class="col-md-4" ><h4 class="text-left" ><b>${user.realname }</b></h4></div>
			<div class="col-md-4"><img src="${path}/images/6.png" alt="" width="100px" height="100px"></div>
		</div>
		<div class="dtable">
			<table class="table">
				<tr>
					<td>职业状态</td>
					<td>
						<div class="input-group">
						<input type="text" class="form-control" name="jobStatus" value="${user.jobStatus}" placeholder="在职/待业" aria-describedby="sizing-addon1">
						</div>
					</td>
				</tr>
				<tr>
					<td>电话</td>
					<td>
						<div class="input-group">
							<input type="text" class="form-control" name="telephone" value="${user.telephone}" placeholder="电话号码" aria-describedby="sizing-addon1">
						</div>
					</td>
				</tr>
				<tr>
					<td>邮箱</td>
					<td>
						<div class="input-group">
							<input type="text" class="form-control" name="email" id="email" value="${user.email}" placeholder="@Email" aria-describedby="sizing-addon1">
						</div>
					</td>
				</tr>
				<tr>
					<td>性别</td>
					<td>
						<div class="input-group">
							<input type="text" class="tx" name="gender" value="${user.gender}">
						</div>
					</td>
				</tr>
				<tr>
					<td>地址</td>
					<td>
						<div class="input-group">
							<input type="text" class="form-control" name="address" value="${user.address}" placeholder="青海省西宁市二十里铺镇宁大路251号" aria-describedby="sizing-addon1">
						</div>
					</td>
				</tr>
				<tr>
					<td>期望薪资</td>
					<td>
						<div class="input-group">
							<p><input type="text" class="form-control" name="salary" value="${user.salary}" placeholder="3000-5000" aria-describedby="sizing-addon1">元/月</p>
						</div>
					</td>

				</tr>
				<tr>
					<td>毕业学校</td>
					<td>
						<div class="input-group">
							<input type="text" class="form-control" name="school" value="${user.school}" placeholder="青海大学" aria-describedby="sizing-addon1">
						</div>
					</td>
				</tr>
				<tr>
					<td>个人描述</td>
					<td><textarea  type="text" class="form-control" name="descripte" rows="5">${user.descripte}
					</textarea></td>
				</tr>
			</table>
		</div>
		<div class="row" style="margin-bottom: 20px">
			<div class="col-md-8"></div>
			<div class="col-md-4 text-center"><a class="btn btn-primary" href="javascript:void(0)" onclick="saveResume()" id="resume">保存简历</a></div>
		</div>
		</div>
		</form>
</body>
</html>