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
                <td colspan="10"><h3>已发布职位列表</h3></td>
            </tr>
            <tr class="danger">
                <th>职位名称</th>
                <th>工作地点</th>
                <th>薪资</th>
                <th>发布时间</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${jobList}" var="job">
                <tr class="table table-hover">
                    <td>${job.jobName}</td>
                    <td>${job.jobAddress}</td>
                    <td>${job.jobSalary}</td>
                    <td><${job.releaseTime}/></td>
                    <td><a href="${pageContext.request.contextPath }/job/deleteJobById?jobId=${job.jobId}"
                           class="btn btn-default" onclick="return confirm('确定删除吗？');">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
