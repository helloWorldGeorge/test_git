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

<title>showVoProTasks</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
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
	<p>
		<s:a href="\PM\index.jsp">回到主页</s:a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<s:a href="\PM\gotoAddVoProTask.action">添加</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		<s:a href="\PM\showAllVoProTasks.action">显示所有</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		<s:url id="showMines" action="showMyVoProTasks.action">
		<s:param value="#request.session.loginUser.id" name="vpImpl_user.id"></s:param>
		</s:url>
		<s:a href="%{showMines}">只显示我的</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		<s:form action="queryVoProTask.action">
			<s:textfield name="queryString" theme="simple">搜索</s:textfield>
		</s:form>
	</p>

	<table class="remark_table" style="width: 100%">
		<tr>
			<td width="10px"><div align="center">
					<span class="STYLE1">序号</span>
				</div>
			</td>
			<!--showjsp_1-->
<th><div align="center"><span class="STYLE4">主键</span></div></th>
<th><div align="center"><span class="STYLE4">项目名称</span></div></th>
<th><div align="center"><span class="STYLE4">标题</span></div></th>
<th><div align="center"><span class="STYLE4">状态</span></div></th>
<th><div align="center"><span class="STYLE4">详细</span></div></th>
<th><div align="center"><span class="STYLE4">提交日期</span></div></th>
<th><div align="center"><span class="STYLE4">计划开始日期</span></div></th>
<th><div align="center"><span class="STYLE4">实际开始日期</span></div></th>
<th><div align="center"><span class="STYLE4">计划结束日期</span></div></th>
<th><div align="center"><span class="STYLE4">实际结束日期</span></div></th>
<th><div align="center"><span class="STYLE4">类型</span></div></th>
<th><div align="center"><span class="STYLE4">问题类型</span></div></th>
<th><div align="center"><span class="STYLE4">问题所属模块</span></div></th>
<th><div align="center"><span class="STYLE4">事务难度</span></div></th>
<th><div align="center"><span class="STYLE4">解决方案</span></div></th>
<th><div align="center"><span class="STYLE4">工时评估</span></div></th>
<th><div align="center"><span class="STYLE4">图片</span></div></th>
<th><div align="center"><span class="STYLE4">附件</span></div></th>
<th><div align="center"><span class="STYLE4">升级关注点</span></div></th>
<th><div align="center"><span class="STYLE4">创建人</span></div></th>
<th><div align="center"><span class="STYLE4">备注</span></div></th>
			<td ><div align="center">
					<span class="STYLE1">配置</span>
				</div>
			</td>
		</tr>
		<s:iterator value="#request.voProTasks" var="voProTask"	status="voProTasks">
			<tr>
				<td>
					<div align="center">
						<span class="STYLE4"> <s:property
								value="#voProTasks.getIndex()+1" /> </span>
					</div>
				</td>
				<!--showjsp_2-->
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.id" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.implVoProgram.name" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.name" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.taskStatue" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.details" /></span></div></td>
<td><div align="center"><span class="STYLE4"> <s:date name="#voProTask.subDate" format="yyyy-MM-dd" /></span></div></td>
<td><div align="center"><span class="STYLE4"> <s:date name="#voProTask.planStartDate" format="yyyy-MM-dd" /></span></div></td>
<td><div align="center"><span class="STYLE4"> <s:date name="#voProTask.actualStartDate" format="yyyy-MM-dd" /></span></div></td>
<td><div align="center"><span class="STYLE4"> <s:date name="#voProTask.planEndDate" format="yyyy-MM-dd" /></span></div></td>
<td><div align="center"><span class="STYLE4"> <s:date name="#voProTask.actualEndDate" format="yyyy-MM-dd" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.taskStyle" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.questionStyle" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.questionModule" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.taskDifficulty" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.questionDeal" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.evaluateHours" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.picturePath" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.attachmentPath" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.isUpdatePoint" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.implVoUser.name" /></span></div></td>
<td><div align="center"><span class="STYLE4"><s:property value="#voProTask.remark" /></span></div></td>
				<td>
					<div align="center">
						<span class="STYLE4"> 
							<s:url id="getVoProTaskContents" action="getVoProTaskContents.action">
								<s:param name="id" value="#voProTask.id" />
							</s:url> 
							<s:a href="%{getVoProTaskContents}">查看详细</s:a>
							<!-- ignore privilege s:if test="1 in %{#request.session.pris}"> -->
							<s:url id="gotoEditVoProTask" action="gotoEditVoProTask.action">
								<s:param name="id" value="#voProTask.id" />
							</s:url> 
								&nbsp;&nbsp;&nbsp;&nbsp;
								<s:a href="%{gotoEditVoProTask}" target="_blank">编辑</s:a>
						</span>
					</div></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
