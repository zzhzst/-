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
    <style type="text/css">
        body{
            margin: 0px 100px;
        }
    </style>
    <script type="text/javascript">
        function CheckForm() {
            var content = document.getElementById("content").value;
            $.ajax({
                url: "${pageContext.request.contextPath}/words/insertWords",
                data: {
                    content: content,
                },//给服务器的参数
                type: "POST",
                dataType: "json",
                success: function (data) {
                    if ("success" == data.str) {
                        alert("留言成功");
                        window.location.href = "${pageContext.request.contextPath}/words/findAllWords";
                    } else {
                        alert("留言失败");
                        var url = "${pageContext.request.contextPath}/main/index";
                        window.location.href = url;
                    }
                }
            });
        }
    </script>
</head>
<body>
    <div class="page-header">
        <h1>留言板 <small>交流互动 加深了解</small></h1>
    </div>
    <div>
        <img src="${path}/images/7.jpg" alt="" width="100%" height="300px" class="img-rounded">
    </div>
    <div>
        <h4 class="text-left" style="color: #d58512">添加留言</h4>
        <textarea rows="3" cols="8" class="form-control" id="content"></textarea>
        <p class="text-right"><button type="button" class="btn-info" style="margin: 20px 50px"  onclick=CheckForm()>留言</button></p>
    </div>
    <c:forEach items="${wordsList}" var="words">
        <div class="panel panel-default">
            <div class="panel-body">
                <h4 class="text-left">${words.realname}</h4>
                <p>${words.content}</p>
            </div>
        </div>
    </c:forEach>
</body>
</html>
