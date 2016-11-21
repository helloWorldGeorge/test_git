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

<title>My JSP 'addPhone.jsp' starting page</title>

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
       $('#popupDatepicker2').datepicker(); //绑定输入框
	}); 
</script>

</head>

<body>
	<s:form action="addVoVerPlan.action" method="post">
		<s:select name="voProduct.id" list="%{#request.voProducts}" listKey="id" listValue="name" label="产品"></s:select>
		<s:textfield name="verVendor" label="vendor(必须跟锁卡表一致的小写)" />
		<s:textfield name="verCountry" label="country(必须跟锁卡表一致的小写)" />
		<s:textfield name="verOR" label="OR链接" />
		<s:textfield name="verFinalDate" label="最终计划日期" id="popupDatepicker2" />
		<s:textfield name="compilePath" label="编译文件路径（同CI）"  />
		<s:textfield name="custPath" label="cust.xml路径(同CI)"  />
		<s:textfield name="customPath" label="custom路径(同CI)"  />
		<s:textfield name="sendCountry" label="发货国家"  />
		<s:textfield name="sendVendor" label="发货运营商"  />
		<s:select name="vpImpl_user.id" list="%{#request.voUsers}" listKey="id" listValue="cnName" label="版本责任人"></s:select>
		<s:submit value="确认添加" />
	</s:form>
</body>
</html>
