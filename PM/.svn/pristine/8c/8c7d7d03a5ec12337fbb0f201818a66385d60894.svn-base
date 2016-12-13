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

<title>showVoVVVVVs</title>

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
		<s:a href="\WWWWWWWW\index.jsp">回到主页</s:a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<s:a href="\WWWWWWWW\gotoAddVoVVVVV.action">添加</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		<s:a href="\WWWWWWWW\showAllVoVVVVVs.action">显示所有</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		<s:url id="showMines" action="showMyVoVVVVVs.action">
		<s:param value="#request.session.loginUser.id" name="vpImpl_user.id"></s:param>
		</s:url>
		<s:a href="%{showMines}">只显示我的</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		<s:form action="queryVoVVVVV.action">
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
			<td ><div align="center">
					<span class="STYLE1">配置</span>
				</div>
			</td>
		</tr>
		<s:iterator value="#request.voVVVVVs" var="voVVVVV"	status="voVVVVVs">
			<tr>
				<td>
					<div align="center">
						<span class="STYLE4"> <s:property
								value="#voVVVVVs.getIndex()+1" /> </span>
					</div>
				</td>
				<!--showjsp_2-->
				<td>
					<div align="center">
						<span class="STYLE4"> 
							<s:url id="getVoVVVVVDetails" action="getVoVVVVVDetails.action">
								<s:param name="id" value="#voVVVVV.id" />
							</s:url> 
							<s:a href="%{getVoVVVVVDetails}">查看详细</s:a>
							<!-- ignore privilege s:if test="1 in %{#request.session.pris}"> -->
							<s:url id="gotoEditVoVVVVV" action="gotoEditVoVVVVV.action">
								<s:param name="id" value="#voVVVVV.id" />
							</s:url> 
								&nbsp;&nbsp;&nbsp;&nbsp;
								<s:a href="%{gotoEditVoVVVVV}" target="_blank">编辑</s:a>
						</span>
					</div></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
