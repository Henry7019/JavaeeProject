<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
	<head>
		<title>添加商品</title>	
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
		<h2>商品注册</h2>
		<aside class='form'>
		<form accept-charset="UTF-8" action="${pageContext.request.contextPath}/goods.do?method=add" method="post">
					<div class='component'>
						<label for="GoodsName">名称:</label> <input class="text_field_280"
							id="GoodsName" name="GoodsName" type="text" placeholder="Enter Name" style="height:30px" />
					</div>
					<div class='component'>
						<label for="GoodsCategory">类别:</label>
						<select size="1" class="text_field_280" id="GoodsCategory" name="GoodsCategory" style="font-size:15px" size="3">
						<c:forEach items="${requestScope.list }" var="gcate">
							<option value="${gcate.id}" >${gcate.name}</option>
						</c:forEach>
						</select>
					</div>
					<div class='component'>
						<label for="GoodsDescribe">说明:</label> <textarea class="text_field_280"
							id="GoodsDescribe" name="GoodsDescribe" placeholder="Enter Describe" style="resize:none" rows="8" ></textarea>
					</div>
					<input class="btn btn-success" name="commit" type="submit"
						value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input class="btn btn-success" name="settle" type="reset"
						value="重置" />
				</form>
				</aside>
	</div>
	<script type="text/javascript">
		var addAns = "${requestScope.addAns}";
		if (addAns=="success"){
			alert("添加成功");
		}else if(addAns=="error"){
			alert("添加失败");
		}
		
		function checkSubmit(){
			var GoodsName = document.getElementById("GoodsName").value;
			var GoodsDescribe = document.getElementById("GoodsDescribe").value;
			if(GoodsName==null || GoodsName.trim()=="" || GoodsDescribe==null || GoodsDescribe.trim()==""){
				alert("名称或描述不许为空");
				return false;
			}
		}
	</script>
</body>
</html>