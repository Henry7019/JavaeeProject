<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>添加新闻</title>	
		<link href="${pageContext.request.contextPath}/css/main-9ef9c0e87dc02c8281af9d91272fd02e.css?body=1"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/layout-e1c09780018325a8d26698a6e8aa7597.css?body=1"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/bootstrap-a8e65df0a1d46934b11bbe665c5e00d6.css?body=1"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/fontawesome-cea23e4121b590dd7fbd5a715f8ea879.css?body=1"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/css/bootstrap_and_overrides-ba002271e6152982a71a1893fa440d42.css?body=1"
	rel="stylesheet" type="text/css">
	</head>
<body>
	<div class='fix_wrapper' style="margin-top:50px;margin-right:100px"> 
		<h2>新闻查看</h2>
		<aside class='form'>
		<form accept-charset="UTF-8" action="#" method="post">
					<div class='component'>
						<label for="NewsTitle">标题:</label> <input class="text_field_280"
							id="NewsTitle" name="NewsTitle" readonly="readonly" value="${requestScope.news.title}" type="text" placeholder="Enter Title" style="height:30px" />
					</div>
					<div class='component'>
						<label for="NewsAuthor">作者:</label> <input class="text_field_280"
							id="NewsAuthor" name="NewsAuthor" readonly="readonly" value="${requestScope.news.author}" type="text" placeholder="Enter Name" style="height:30px"/>
					</div>
					<div class='component'>
						<label for="NewsContent">内容:</label> <textarea class="text_field_280"
							id="NewsContent" name="NewsContent" readonly="readonly" placeholder="Enter Content"  style="resize:none" rows="8" >${requestScope.news.content}</textarea>
					</div>
				</form>
				</aside>
	</div>
</body>
</html>