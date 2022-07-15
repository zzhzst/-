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
	margin: 0px 20px;
	padding-top: 20px;
}
#divTable{
	padding: 20px 50px;
}
th,td{text-align: center;}

</style>

<script type="text/javascript">
	function show(cid,jobName,jobAddress,releaseTime,jobSalary,companyName) {
		var url = "${pageContext.request.contextPath}/com/show?cid=" + cid
				+"&jobName="+jobName+"&jobAddress="+jobAddress+"&releaseTime="+releaseTime+"&jobSalary="+jobSalary
				+"&companyName="+companyName;
		//加载参数
		window.location.href = url;
	}
	function search(){
		$("#searchForm").submit();
	}
</script>

</head>

<body>
	<div id="divMain">
		<form action="${path}/job/findAllJob" class="text-center" id="searchForm" method="post">
			职位名称: <input type="text" name="jobName" placeholder="Java后端开发"/>
			工作地址: <input type="text" name="jobAddress" placeholder="上海"/>
			公司名称: <input type="text" name="companyName" placeholder="江苏经贸有限公司"/>
			<button type="button" class="btn btn-primary" onclick="search()">
				<span class="glyphicon glyphicon-search" aria-hidden="true"></span>搜索
			</button>
		</form>
		<div id="divTable">
			<c:forEach items="${jobInfoList}" var="jobInfo">
				<div class="panel panel-success">
					<div class="panel-heading">
						<h3 class="panel-title"><b>${jobInfo.jobName}</b></h3>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-md-4">
								<p>薪资:</p>
								<h3 style="color: plum"><b>${jobInfo.jobSalary}</b></h3>
							</div>
							<div class="col-md-4">
								<h4>工作地点：${jobInfo.jobAddress}</h4>
								<h5>发布时间：${jobInfo.releaseTime}</h5>
							</div>
							<div class="col-md-4">
								<a href="javascript:void(0)"
								   onclick="show('${jobInfo.company.cid}','${jobInfo.jobName}',
										   '${jobInfo.jobAddress}','${jobInfo.releaseTime}','${jobInfo.jobSalary}','${jobInfo.company.companyName}')" class="btn btn-info">
										${jobInfo.company.companyName}
								</a>
							</div>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>
