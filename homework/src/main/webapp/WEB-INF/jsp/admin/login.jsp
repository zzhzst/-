<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />


<!doctype html>
<html>
	<head>
		<link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">
		<link href="${path}/resources/css/edit.css" rel="stylesheet">
		<script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
		<script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>
	<meta charset="utf-8">
	<title>管理员登录</title>
	    <link rel="stylesheet" href="${path}/resources/css/管理员登录.css">
	
	<script type="text/javascript">
		function CheckForm(){
			var adminName=document.getElementById("adminName").value;
			var adminPwd=document.getElementById("adminPwd").value;
			if(adminName.length==0){
				alert("请输入管理员名称");
				return false;
			}else
			{
				var pattern = /^[0-9a-zA-Z]+$/;
				if(!pattern.test(document.getElementById("adminName").value))
				{
					alert('\n用户名只可输入数字或者字母!');
					return false;
				}
			}
			if(adminPwd.length==0){
				alert("请输入管理员密码");
				return false;
			}
			$.ajax({
				url:"${pageContext.request.contextPath}/admin/accessLogin",
				data:{
					adminName:adminName,
					adminPwd:adminPwd
				},//给服务器的参数
				type:"POST",
				dataType:"json",
				success:function(data){
					if("success"==data.str){
						alert("登录成功");
						var url="${pageContext.request.contextPath}/admin/index";
						window.location.href=url; 
					}else{
						alert("登录失败,请输入正确的用户名和密码");
						var url="${pageContext.request.contextPath}/admin/login";
						window.location.href=url; 
					}
				}
			});
		}
	</script>
	
	</head>
	<body>
	    <div class="box">
	            <h2>管理员登录</h2>
	  <form>
	    <div class="inputBox">
	      <input type="text" id="adminName" name="adminName" required="">
	      <label>用户名</label>
	    </div>
	    <div class="inputBox">
			<input type="password" id="adminPwd" name="adminPwd" required="">
			<label>密码</label>
	    </div>
	    <center>
	    <input type="button" value="登录" onclick="CheckForm()">
		</center>
	  </form>
		</div>
	    </body>
</html>
