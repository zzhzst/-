<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>body</title>
    <link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>
    <style type="text/css">
        #divMain {
            width: 100%;
            height: 100%;
        }
        th,td{text-align: center;}
    </style>
    <script type="text/javascript">function deleteJobById(jobId) {

    }


    </script>

</head>

<body>
<div id="divMain">
    <div id="divTable">
        <table class="table table-hover table-hover">
            <tr class="info">
                <td colspan="10"><h3>留言管理</h3></td>
            </tr>
            <tr class="danger">
                <th>用户真实姓名</th>
                <th>留言内容</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${wordsList}" var="words">
                <tr class="table table-hover">
                    <td>${words.realname}</td>
                    <td>${words.content}</td>
                    <td><a href="${pageContext.request.contextPath }/words/deleteWordsById?wid=${words.wid}"
                           class="btn btn-default" onclick="return confirm('确定删除吗？');">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
