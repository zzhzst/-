<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>企业登录界面</title>
    <link rel="stylesheet" href="${path}/resources/css/企业登录.css">
    <link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>
    <script type="text/javascript">
		function CheckForm(){
			var companyLoginName=document.getElementById("companyLoginName").value;
			var companyPwd=document.getElementById("companyPwd").value;
			if(companyLoginName.length==0){
				alert("请输入登录名");
				return false;
			}else
			{
				var pattern = /^[0-9a-zA-Z]+$/;
				if(!pattern.test(document.getElementById("companyLoginName").value))
				{
					alert('\n用户名只可输入数字或者字母!');
					return false;
				}
			}
			if(companyPwd.length==0){
				alert("请输入密码");
				return false;
			}
			$.ajax({
				url:"${pageContext.request.contextPath}/com/accessComLogin",
				data:{
					companyLoginName:companyLoginName,
					companyPwd:companyPwd
				},//给服务器的参数
				type:"POST",
				dataType:"json",
				success:function(data){
					if("success"==data.str){
						alert("登录成功");
						var url="${pageContext.request.contextPath}/com/index";
						window.location.href=url; 
					}else{
						alert("登录失败,请输入正确的用户名和密码");
						var url="${pageContext.request.contextPath}/main/loginOrRegist";
						window.location.href=url; 
					}
				}
			});
		}
	</script>
	
	<script type="text/javascript">
		function check(){
			var companyLoginName=document.getElementById("companyReName").value;//公司登录名
			var companyPwd=document.getElementById("password").value;//密码
			var companyName=document.getElementById("companyName").value;//公司名称
			var companyType=document.getElementById("companyType").value;//公司类型
			if(companyLoginName.length==0){
				alert("企业登录名不能为空");
				return false;
			}else{
                var pattern = /^[0-9a-zA-Z]+$/;
                if(!pattern.test(document.getElementById("companyReName").value))
                {
                    alert('\n用户名只可输入数字或者字母!');
                    return false;
                }
			}
			if(companyPwd.length==0){
				alert("企业密码不能为空");
				return false;
			}
			if(companyName.length==0){
				alert("公司名不能为空！");
				return false;
			}
			$.ajax({
				url:"${pageContext.request.contextPath}/com/registCom",
				data:{
					 companyLoginName:companyLoginName,//公司登录名
					 companyPwd:companyPwd,//密码
					 companyName:companyName,//公司名称
					 companyType:companyType,//公司类型
				},
				type:"POST",
				dataType:"json",
				success:function(data){
					if("success"==data.str){
						alert("注册成功");
						var url="${pageContext.request.contextPath}/com/login";
						window.location.href=url; 
					}else if("公司登录名已经存在"==data.str){
						alert("注册失败,公司登录名已经存在");
						var url="${pageContext.request.contextPath}/com/regist";
						window.location.href=url; 
					}else if("公司名已经存在"==data.str){
						alert("注册失败,公司名已经存在");
						var url="${pageContext.request.contextPath}/com/regist";
						window.location.href=url; 
					}
				}
			});
		}
</script>
    
</head>
<body>
    <div class="container">
        <div class="from-box">
            
            <div class="register-box hidden">
                <h1>register</h1>
                <input type="text"  name="companyLoginName" id="companyReName" placeholder="用户名">
                <input type="password"  name="companyPwd" id="password" placeholder="密码">
                <input type="text"  name="companyName" id="companyName" placeholder="企业名">
                <input input type="text" name="companyType" id="companyType" placeholder="企业类型">
                <button id="saveBtn" onclick="check()">注册</button>
            </div>
            
            <div class="login-box">
                <h1>login</h1>
                <input type="text" id="companyLoginName" name="companyLoginName" placeholder="用户名">
                <input type="password" id="companyPwd" name="companyPwd" placeholder="密码">
                <button id="submitBtn" onclick="CheckForm()">登录</button>
            </div>
        </div>
        <div class="con-box left">
            <h2>欢迎来到<span>蓝精领</span></h2>  
            <p>快来寻找你期待的<span>职员</span>吧</p>          
            <img src="${path}/images/left.jpg" alt="">
            <p>已有账号</p>
            <button id="login">去登录</button>
        </div>
        <div class="con-box right">
            <h2>欢迎来到<span>蓝精领</span></h2>  
            <p>快来寻找你期待的<span>职员</span>吧</p>   
            <img src="${path}/images/right.jpg" alt="">
            <p>没有账号?</p>
            <button id="register">去注册</button>
        </div>
    </div>
    <script>
        //要操作到的元素
        let login = document.getElementById("login");
        let register = document.getElementById("register");
        let form_box = document.getElementsByClassName("from-box")[0];
        let register_box = document.getElementsByClassName("register-box")[0];
        let login_box = document.getElementsByClassName("login-box")[0];
        //点击去注册按钮点击事件
        register.addEventListener('click',()=>{
            form_box.style.transform='translateX(80%)';
            login_box.classList.add('hidden');
            register_box.classList.remove('hidden');
        })
        //点击去登录按钮点击事件
        login.addEventListener('click',()=>{
            form_box.style.transform='translateX(0%)';
            register_box.classList.add('hidden');
            login_box.classList.remove('hidden');
        })
    </script>
</body>
</html>