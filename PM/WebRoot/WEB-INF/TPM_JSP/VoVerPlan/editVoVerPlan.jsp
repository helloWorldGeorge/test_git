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
<link href="Widget/datePicker_css/jquery-ui.css" rel="stylesheet">
<script type="text/javascript" src="Widget/datePicker_css/jquery-1.8.1.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/jquery-ui.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/dateinput-ch-ZN.js"></script>
<script>
	$(document).ready(function() {   
       $('#popupDatepicker1').datepicker(); //绑定输入框
       $('#popupDatepicker2').datepicker(); //绑定输入框
	}); 
</script>
</head>

<body>
	<s:form action="editVoVerPlan.action" method="post">
		<s:hidden name="id" label="主键" value="%{#request.voVerPlan.id}" />
		项目信息:<s:property value="%{#request.voVerPlan.name}" />
		<s:select name="voProduct.id" list="%{#request.voProducts}" listKey="id" listValue="name" value="%{#request.voVerPlan.voProduct.id}" label="产品"></s:select>
		<s:textfield name="verVendor" label="vendor(必须跟锁卡表一致的小写)"  value="%{#request.voVerPlan.verVendor}"/>
		<s:textfield name="verCountry" label="country(必须跟锁卡表一致的小写)" value="%{#request.voVerPlan.verCountry}" />
		<s:textfield name="verOR" label="OR链接" value="%{#request.voVerPlan.verOR}"/>		
		<s:textfield name="verFinalDate" label="最终计划日期" id="popupDatepicker2" readonly="true"><s:param name="value" ><s:date name="%{#request.voVerPlan.verFinalDate}" format="yyyy-MM-dd" /></s:param></s:textfield>
		<s:textfield name="compilePath" label="编译文件路径（同CI）"  value="%{#request.voVerPlan.compilePath}"/>
		<s:textfield name="custPath" label="cust.xml路径(同CI)"  value="%{#request.voVerPlan.custPath}" />
		<s:textfield name="customPath" label="custom路径(同CI)"  value="%{#request.voVerPlan.customPath}"/>
		<s:textfield name="sendCountry" label="发货国家" value="%{#request.voVerPlan.sendCountry}" />
		<s:textfield name="sendVendor" label="发货运营商"  value="%{#request.voVerPlan.sendVendor}"/>
		<s:select name="vpImpl_user.id" list="%{#request.voUsers}" listKey="id" listValue="cnName" label="版本责任人" value="%{#request.voVerPlan.vpImpl_user.id}"></s:select>
		<s:submit value="确认修改" />
	</s:form>
</body>
</html>
