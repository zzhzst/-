<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>
    <link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">
    <title>蓝精领</title>
    <style type="text/css">

        iframe {
            width: 100%;
            height: 100%;
        }

        body {
            text-align: center;
            background-color: #ffffff;
        }
        .body{
            padding-top: 70px;
            height: 1500px;
        }
    </style>
</head>
<body>
<c:choose>
    <c:when test="${empty sessionScope.currUser}">
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">蓝精领</a>
                </div>

                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="${path}/main/index" target="_parent">网站首页 <span class="sr-only">(current)</span></a></li>
                        <li ><a href="${path}/job/findAllJob" target="body">职位搜索</a></li>
                        <li ><a href="${path}/eboard/showNews "target="body">职位新闻</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right" style="padding-right: 20px">
                        <li><a href="#" target="body"><img src="${path}/images/1.jpeg" height="40px" width="40px" alt="..." class="img-circle"></a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">登录<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="${path}/main/userLogin" target="_parent">用户登录/注册</a></li>
                                <li><a href="${path}/main/loginOrRegist" target="_parent">企业登录/注册</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    </c:when>
    <c:when test="${!empty sessionScope.currUser}">
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">

                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">蓝精领</a>
                </div>


                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="${path}/main/index" target="_parent">网站首页 <span class="sr-only">(current)</span></a></li>
                        <li><a href="${path}/job/findAllJob" target="body">职位搜索</a></li>
                        <li><a href="${path}/eboard/showNews "target="body">职位新闻</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right"  style="padding-right: 20px">
                        <li><a href="${path}/words/findAllWords" target="body">留言板</a></li>
                        <li><a href="${path}/apply/applyRecord?realname=${sessionScope.currUser.realname}" target="body">投递记录</a></li>
                        <li><a href="${path}/favorite/favoriteRecord?realname=${sessionScope.currUser.realname}" target="body">职位收藏夹</a></li>
                        <li><a href="${path}/user/showResume" target="body"><img src="${path}/images/1.jpeg" height="40px" width="40px" alt="..." class="img-circle"></a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${sessionScope.currUser.realname} <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="${path}/user/showResume" target="body">个人简历</a></li>
                                <li><a href="${path}/user/exit" target="_parent">退出</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    </c:when>
</c:choose>
    <div class="body" style="z-index: 10; position: relative;" >
        <iframe frameborder="0" src="${path}/main/body" name="body"></iframe>
    </div>
</body>
</html>