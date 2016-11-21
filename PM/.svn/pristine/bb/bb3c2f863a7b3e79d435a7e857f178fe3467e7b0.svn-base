<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addPhone.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<script>
		function typeChange() {
			x = document.getElementById("demo"); // 找到元素
			x.innerHTML = "Hello JavaScript!"; // 改变内容
		}
	</script>
	<s:form action="addVerPlan.action" method="post">
		<s:select name="voTran.tranType" list="#{'需求'，'QC'，'公共事务'}"
			label="事务类型" onchange="typeChange()"></s:select>
		<s:textfield name="verPlan.verCountry" label="国家" id="text_country" value="#verPlan.verCountry"/>
		<!--  s:textfield name="verPlan.verDate" label="最新计划日期" />-->
		<!-- <s:textfield name="verPlan.verFinalDate" label="最终计划日期" /> -->
		<s:select name="verPlan.verType" list="{'Demo','TA'}" label="计划类型"></s:select>
		<s:select name="verPlan.verPlan_user.userID" list="#request.voUsers"
			listKey="userID" listValue="userName" label="版本责任人"></s:select>
		<s:submit value="添加" />
	</s:form>
</body>
</html>
