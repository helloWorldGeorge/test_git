<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    <p align="center"><font color="00ff00" size="20">成功</font></p>
    <br/><br/><br/><br/><br/><br/>
    <s:url id="showMines" action="showMyVoVerPlans.action">
		<s:param value="#request.session.loginUser.id" name="vpImpl_user.id"></s:param>
	</s:url>
	<p align="center"><s:a href="%{showMines}">回到我的主页</s:a>&nbsp;&nbsp;&nbsp;&nbsp;</p>
  </body>
</html>
