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

<title>addVoProTask</title>

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
	<s:form action="addVoProTask.action" method="post">
		<!-- add_jsp -->
<s:textarea cols="130" rows="2" name="id" label="主键" />
<s:select name="implVoProgram.id" list="%{#request.implVoPrograms}" listKey="id" listValue="name" label="项目名称"></s:select>
<s:textarea cols="130" rows="2" name="name" label="标题" />
<s:textarea cols="130" rows="2" name="taskStatue" label="状态" />
<s:textarea cols="130" rows="2" name="details" label="详细" />
<s:textfield name="subDate" label="提交日期" id="popupDatepicker" readonly="true"/>
<s:textfield name="planStartDate" label="计划开始日期" id="popupDatepicker" readonly="true"/>
<s:textfield name="actualStartDate" label="实际开始日期" id="popupDatepicker" readonly="true"/>
<s:textfield name="planEndDate" label="计划结束日期" id="popupDatepicker" readonly="true"/>
<s:textfield name="actualEndDate" label="实际结束日期" id="popupDatepicker" readonly="true"/>
<s:textarea cols="130" rows="2" name="taskStyle" label="类型" />
<s:textarea cols="130" rows="2" name="questionStyle" label="问题类型" />
<s:textarea cols="130" rows="2" name="questionModule" label="问题所属模块" />
<s:textarea cols="130" rows="2" name="taskDifficulty" label="事务难度" />
<s:textarea cols="130" rows="2" name="questionDeal" label="解决方案" />
<s:textarea cols="130" rows="2" name="evaluateHours" label="工时评估" />
<s:textarea cols="130" rows="2" name="picturePath" label="图片" />
<s:textarea cols="130" rows="2" name="attachmentPath" label="附件" />
<s:textarea cols="130" rows="2" name="isUpdatePoint" label="升级关注点" />
<s:select name="implVoUser.id" list="%{#request.implVoUsers}" listKey="id" listValue="name" label="创建人"></s:select>
<s:textarea cols="130" rows="2" name="remark" label="备注" />
		<s:submit value="确认添加" />
	</s:form>
</body>
</html>
