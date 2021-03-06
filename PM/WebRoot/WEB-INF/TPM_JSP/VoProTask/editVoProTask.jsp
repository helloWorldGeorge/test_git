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

<title>editVoProTask</title>

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
<style type="text/css">
.OLD_TXT {color: #999999}
table.remark_table {
	border: 1px solid lightsteelblue;
	padding: 0;
	border-collapse: collapse;
	word-break: break-all;
}

table.remark_table td,th {
	border: 1px solid lightsteelblue;
	font-size: 12px;
	padding: 3px 3px 3px 8px;
}
</style>
</head>

<body>
<s:form action="editVoProTask.action" theme="simple" method="post">
<table class="remark_table" style="width: 100%">
<tr>
	<th>属性</th>
	<th>当前最新信息</th>
	<th>需要修改为</th>
	
</tr>
<!-- edit_jsp -->
<tr><td>主键</td><td><span class="OLD_TXT">此参数不可直接编辑</span></td><td><s:hidden name="id" value="%{#request.voProTask.id}"/></td></tr>
<tr><td>项目名称</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.implVoProgram" /></span></td><td><s:select name="implVoProgram.id" list="#request.implVoPrograms" listKey="id" listValue="name" label="项目名称" value="%{#request.voProTask.implVoProgram.id}"></s:select></td></tr>
<tr><td>标题</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.name" /></span></td><td><s:textarea cols="130" rows="2" name="name" label="标题" value="%{#request.voProTask.name}"/></td></tr>
<tr><td>状态</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.taskStatue" /></span></td><td><s:textarea cols="130" rows="2" name="taskStatue" label="状态" value="%{#request.voProTask.taskStatue}"/></td></tr>
<tr><td>详细</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.details" /></span></td><td><s:textarea cols="130" rows="2" name="details" label="详细" value="%{#request.voProTask.details}"/></td></tr>
<tr><td>提交日期</td><td><span class="OLD_TXT"><s:date name="#request.voProTask.subDate" format="yyyy-MM-dd" /></span></td><td><s:textfield name="subDate" label="提交日期" id="popupDatepicker" readonly="true"><s:param name="value" ><s:date name="%{#request.voProTask.subDate}" format="yyyy-MM-dd" /></s:param></s:textfield></td></tr>
<tr><td>计划开始日期</td><td><span class="OLD_TXT"><s:date name="#request.voProTask.planStartDate" format="yyyy-MM-dd" /></span></td><td><s:textfield name="planStartDate" label="计划开始日期" id="popupDatepicker" readonly="true"><s:param name="value" ><s:date name="%{#request.voProTask.planStartDate}" format="yyyy-MM-dd" /></s:param></s:textfield></td></tr>
<tr><td>实际开始日期</td><td><span class="OLD_TXT"><s:date name="#request.voProTask.actualStartDate" format="yyyy-MM-dd" /></span></td><td><s:textfield name="actualStartDate" label="实际开始日期" id="popupDatepicker" readonly="true"><s:param name="value" ><s:date name="%{#request.voProTask.actualStartDate}" format="yyyy-MM-dd" /></s:param></s:textfield></td></tr>
<tr><td>计划结束日期</td><td><span class="OLD_TXT"><s:date name="#request.voProTask.planEndDate" format="yyyy-MM-dd" /></span></td><td><s:textfield name="planEndDate" label="计划结束日期" id="popupDatepicker" readonly="true"><s:param name="value" ><s:date name="%{#request.voProTask.planEndDate}" format="yyyy-MM-dd" /></s:param></s:textfield></td></tr>
<tr><td>实际结束日期</td><td><span class="OLD_TXT"><s:date name="#request.voProTask.actualEndDate" format="yyyy-MM-dd" /></span></td><td><s:textfield name="actualEndDate" label="实际结束日期" id="popupDatepicker" readonly="true"><s:param name="value" ><s:date name="%{#request.voProTask.actualEndDate}" format="yyyy-MM-dd" /></s:param></s:textfield></td></tr>
<tr><td>类型</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.taskStyle" /></span></td><td><s:textarea cols="130" rows="2" name="taskStyle" label="类型" value="%{#request.voProTask.taskStyle}"/></td></tr>
<tr><td>问题类型</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.questionStyle" /></span></td><td><s:textarea cols="130" rows="2" name="questionStyle" label="问题类型" value="%{#request.voProTask.questionStyle}"/></td></tr>
<tr><td>问题所属模块</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.questionModule" /></span></td><td><s:textarea cols="130" rows="2" name="questionModule" label="问题所属模块" value="%{#request.voProTask.questionModule}"/></td></tr>
<tr><td>事务难度</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.taskDifficulty" /></span></td><td><s:textarea cols="130" rows="2" name="taskDifficulty" label="事务难度" value="%{#request.voProTask.taskDifficulty}"/></td></tr>
<tr><td>解决方案</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.questionDeal" /></span></td><td><s:textarea cols="130" rows="2" name="questionDeal" label="解决方案" value="%{#request.voProTask.questionDeal}"/></td></tr>
<tr><td>工时评估</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.evaluateHours" /></span></td><td><s:textarea cols="130" rows="2" name="evaluateHours" label="工时评估" value="%{#request.voProTask.evaluateHours}"/></td></tr>
<tr><td>图片</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.picturePath" /></span></td><td><s:textarea cols="130" rows="2" name="picturePath" label="图片" value="%{#request.voProTask.picturePath}"/></td></tr>
<tr><td>附件</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.attachmentPath" /></span></td><td><s:textarea cols="130" rows="2" name="attachmentPath" label="附件" value="%{#request.voProTask.attachmentPath}"/></td></tr>
<tr><td>升级关注点</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.isUpdatePoint" /></span></td><td><s:textarea cols="130" rows="2" name="isUpdatePoint" label="升级关注点" value="%{#request.voProTask.isUpdatePoint}"/></td></tr>
<tr><td>创建人</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.implVoUser" /></span></td><td><s:select name="implVoUser.id" list="#request.implVoUsers" listKey="id" listValue="name" label="创建人" value="%{#request.voProTask.implVoUser.id}"></s:select></td></tr>
<tr><td>备注</td><td><span class="OLD_TXT"><s:property value="#request.voProTask.remark" /></span></td><td><s:textarea cols="130" rows="2" name="remark" label="备注" value="%{#request.voProTask.remark}"/></td></tr>
	
</table>
<s:submit value="确认修改" />
</s:form>
</body>
</html>
