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
    <link rel="stylesheet" href="${path}/resources/css/li.css" />
    <script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>
    <script type="text/javascript">
        function check(){
            var realname=document.getElementById("realname").value;
            var email=document.getElementById("email").value;
            if(realname.length==0){
                alert("真实姓名不能为空");
                return false;
            }else{
                var pattern = /^([a-zA-Z\d_-])+@([a-zA-Z\d_-])+((\.[a-zA-Z\d_-]{2,3}){1,2})$/;
                if(!pattern.test(document.getElementById("email").value))
                {
                    alert('\n请输入正确的邮箱格式!');
                    return false;
                }
            }
        }
        function editResume(uid){
            var url="${path}/user/editResume?uid="+uid;
            window.location.href = url;
        }
    </script>
</head>
<body>
<div class="q">
    <!--第一部分-->
    <div class="a">
        <div class="a1">
            <img src="${path}/images/1.jpeg" height="100px" width="100px" />
        </div>
        <br />
        <br />
        <br />
        <!--个人信息-->
        <b><font color="#f5deb3" size="4">&nbsp;&nbsp;&nbsp;&nbsp;个人信息：</font></b>
        <div class="a2"></div>
        <br />
        <div class="a3">
            <h4><b>性别：</b></h4>
                <h5>${user.gender}</h5>
                <h4><b>地址：</b></h4>
                    <h5>${user.address }</h5>
                    <h4><b>电话：</b></h4>
                        <h5>${user.telephone}</h5>
                        <h4><b>邮箱：</b></h4>
                            <h5>${user.email}</h5>
            <br />
            <h5 align="right"><b><a href="javascript:void(0)" onclick="editResume('${user.uid}')" id="resume">
                <img src="${path}/images/5.png" height="15px" width="15px">编辑</a></b></h5>
        </div>
        <br />
        <br />

        <!--职业状态-->
        <b><font color="#f5deb3" size="4">&nbsp;&nbsp;&nbsp;&nbsp;职业状态：</font></b>
        <div class="a2"></div>
        <div class="a3">
            <h4><b>工作状态：</b></h4>
                <h4>${user.jobStatus}</h4>
                    <h4><b>期望薪资：</b></h4>
                        <h4>${user.salary}元/月</h4>
        </div>
    </div>


    <!--第二部分-->
    <div class="b">
        <div class="b1"><font size="6">${user.realname}</font></div>
        <div class="b2"></div>
        <div class="b3"><font size="4" color="floralwhite">教育背景</font></div>
        <div class="b4">
            <font size="4">${user.school}</font><br /><br />
        </div>

        <div class="b3"><font size="4" color="floralwhite">个人描述</font></div>
        <div class="b4">
            <font size="4">${user.descripte }</font><br /><br />
        </div>
    </div>


</div>
</body>
</html>