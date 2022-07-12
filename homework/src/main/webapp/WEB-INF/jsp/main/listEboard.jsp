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
<script type="text/javascript" src="${path}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/bootstrap.js"></script>
<style type="text/css">
 #tableAll {
	margin-top: 30px;
	margin-left: 40px;
	margin-right: 40px;
}
table td{
	width:500px;
	height:200px; 
}
</style>
</head>
<body>
	 <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                    	<span class="title-main" style="font-size:18px;font-weight:bold;">职位新闻</span>
                    </div>
					<div class="panel-body">
						<table class="table table-hover">
							<c:forEach items="${eboardList}" var="eboard">
								<tr class="warning">
									<td>${eboard.news}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
            	</div>
         	</div>
      </div>	
</body>

</html>