<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>addVoProgramInfo</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="Widget/datePicker_css/jquery-ui.css" rel="stylesheet">
<script type="text/javascript" src="Widget/datePicker_css/jquery-1.8.1.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/jquery-ui.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/dateinput-ch-ZN.js"></script>
<script>
	$(document).ready(function() {   
        $("#popupDatepicker").datepicker();
	}); 
</script>

</head>

<body>
	<s:form action="addVoProgramInfo.action" method="post">
		<!-- add_jsp -->
<s:textarea cols="130" rows="1" name="name" label="项目名称" />
<s:textarea cols="130" rows="5" name="serverInfo" label="服务器信息" />
<s:textarea cols="130" rows="5" name="backSpaceInfo" label="后台信息" />
<s:textarea cols="130" rows="5" name="thirdPartyInfo" label="第三方账户信息" />
<s:select name="implUser.id" list="%{#request.implUsers}" listKey="id" listValue="name" label="创建人"></s:select>
<s:textarea cols="130" rows="2" name="remark" label="备注" />
		<s:submit value="确认添加" />
	</s:form>
</body>
</html>
