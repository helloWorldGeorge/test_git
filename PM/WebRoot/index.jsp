<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="Widget/datePicker_css/jquery-1.8.1.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/jquery-ui.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/dateinput-ch-ZN.js"></script>
<script>
	$(document).ready(function(){
    //$("#mytable tr:even").css("background","#999");
  // (奇数行设置成#999颜色)
    //$("#mytable tr:even").attr("bg","#999");
    //$("#mytable tr:odd").attr("bg","#fff");
   //(把背景色保存到属性中)
    $("#mytable tr").mouseover(function(){
        $(this).css("background","#000");
        }) ;  
    //(当鼠标移到表格上是，当前一行背景变色)
    $("#mytable tr").mouseout(function(){
        var bgc = $(this).attr("bg");
        $(this).css("background",bgc);
        });
    //(当鼠标在表格上移动时，离开的那一行背景恢复)
    });
</script>
	
  </head>
  
  <body>
  
  <br/><br/><br/>【项目信息管理】
  <s:a href="\PM\gotoAddVoUser.action">添加用户信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
  <s:a href="\PM\showAllVoUsers.action">显示所有用户信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
   <s:a href="\PM\showMyVoUsers.action">显示我的用户信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
    <s:a href="\PM\queryVoUser.action">查询所有用户信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
  
  <br/><br/><br/>【项目信息管理】
  <s:a href="\PM\gotoAddVoProgramInfo.action">添加项目信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
  <s:a href="\PM\showAllVoProgramInfos.action">显示所有项目信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
   <s:a href="\PM\showMyVoProgramInfos.action">显示我的项目信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
    <s:a href="\PM\queryVoProgramInfo.action">查询所有项目信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
  
  
    <br/><br/><br/>【自动生成工具测试管理】
  <s:a href="\PM\gotoAddVoZHANGTAO.action">添加测试管理信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
  <s:a href="\PM\showAllVoZHANGTAOs.action">显示所有测试管理信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
   <s:a href="\PM\showMyVoZHANGTAOs.action">显示我的测试管理信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
    <s:a href="\PM\queryVoZHANGTAO.action">查询所有测试管理信息</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
  </body>
</html>
