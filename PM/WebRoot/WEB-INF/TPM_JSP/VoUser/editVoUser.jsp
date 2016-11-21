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
	<s:form action="editVoUser.action" method="post">
		<s:hidden name="id" label="主键" value="%{#request.voUser.id}" />
		<s:textfield name="loginName" label="用户登入名" value="%{#request.voUser.loginName}" />
		<s:textfield name="name" label="用户英文名" value="%{#request.voUser.cnName}" />
		<s:textfield name="cnName" label="用户中文名" value="%{#request.voUser.cnName}" />
		<s:textfield name="password" label="用户密码"	value="%{#request.voUser.password}" />
		<s:submit value="确认修改" />
	</s:form>
</body>
</html>
