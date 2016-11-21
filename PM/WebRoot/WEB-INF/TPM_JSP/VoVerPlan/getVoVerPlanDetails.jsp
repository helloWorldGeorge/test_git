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
	<s:property label="主键" value="#voVerPlan.id" />
	<s:property label="产品" value="#voVerPlan.voProduct" />
	<s:property label="国家" value="#voVerPlan.verCountry" />
	<s:property label="运营商" value="#voVerPlan.verVendor" />
	<s:property label="OR链接" value="#voVerPlan.verOR" />
	<s:property label="最新计划日期" value="#voVerPlan.verDate" />
	<s:property label="最终计划日期" value="#voVerPlan.verFinalDate" />
	<s:property label="项目状态(1、Demo_1   2、Demo_2  3、TA	  4、Finished)" value="#voVerPlan.verStatue" />
	<s:property label="计划类型(1.TA;2.Demo)" value="#voVerPlan.verType" />
	<s:property label="未完成事务数量" value="#voVerPlan.unFinishedTranCount" />
	<s:property label="总事务数量" value="#voVerPlan.totalTranCounts" />
	<s:property value="#voVerPlan.vpImpl_user.name" />
</body>
</html>
