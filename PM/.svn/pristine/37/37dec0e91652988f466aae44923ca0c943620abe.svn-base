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
		<s:select name="jspBackStrings[0]" list="#request.voProducts" listKey="id" listValue="name" label="产品" value="%{#request.voVerPlan.voProduct.id}"></s:select>
		<s:textfield name="jspBackStrings[1]" label="国家" value="%{#request.voVerPlan.verCountry}" />
		<s:textfield name="jspBackStrings[2]" label="运营商" value="%{#request.voVerPlan.verVendor}" />
		<s:textfield name="jspBackStrings[3]" label="OR地址" value="%{#request.voVerPlan.verOR}" />
		<s:textfield name="jspBackStrings[4]" label="最新计划日期" id="popupDatepicker1" readonly="true">
        	<s:param name="value" ><s:date name="%{#request.voVerPlan.verDate}" format="yyyy-MM-dd" /></s:param> 
   		</s:textfield>
		<s:textfield name="jspBackStrings[5]" label="最终计划日期" id="popupDatepicker2" readonly="true"><s:param name="value" ><s:date name="%{#request.voVerPlan.verFinalDate}" format="yyyy-MM-dd" /></s:param></s:textfield>
		<s:set name="statuesLists"  value="{'待Demo','待TA','待MR_Demo','待MR_TA'}"></s:set>
		<s:select name="jspBackStrings[6]" list="#statuesLists" value="%{#request.voVerPlan.verStatue}" label="项目状态"></s:select>
		<s:select name="jspBackStrings[7]" list="#request.voUsers" listKey="id" listValue="name" label="版本责任人" value="%{#request.voVerPlan.vpImpl_user.id}"></s:select>
		<s:submit value="确认修改" />
	</s:form>
</body>
</html>
