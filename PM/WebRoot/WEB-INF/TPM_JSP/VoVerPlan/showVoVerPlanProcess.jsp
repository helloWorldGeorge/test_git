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

<title>showVoVerPlanProcess</title>

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
	<p>
	<s:a href="\ERP\index.jsp">回到主页</s:a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<s:a href="\ERP\gotoAddVoVerPlan.action">添加计划</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		<s:a href="\ERP\showAllVoVerPlans.action">显示所有人计划</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		<s:url id="showMines" action="showMyVoVerPlans.action">
		<s:param value="#request.session.loginUser.id" name="vpImpl_user.id"></s:param>
		</s:url>
		<s:a href="%{showMines}">只显示我的计划</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		
		<s:form action="queryVoVerPlan.action">
			<s:textfield name="queryString" theme="simple">搜索</s:textfield>
		</s:form>
	</p>
	
	<s:iterator begin="0" end="#request.voVerPlans.size()-1" var="i">
	<table class="table-layout:fixed" width="100%" border="2" cellpadding="0" cellspacing="0">
		<tr>
			<td width="8%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">产品</span>
				</div>
			</td>
			<td width="8%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">OR</span>
				</div>
			</td>
			<td width="8%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">国家</span>
				</div>
			</td>
			<td width="8%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">运营商</span>
				</div>
			</td>
			<td width="8%" background="images/tab/bg.gif" bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">最新版本计划时间</span>
				</div>
			</td>
			<td width="8%" background="images/tab/bg.gif" bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">最终版本计划日期</span>
				</div>
			</td>
			<td width="8%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">计划版本状态</span>
				</div>
			</td>
			<td width="6%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">未完成事务数</span>
				</div>
			</td>
			<td width="6%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">风险事务数</span>
				</div>
			</td>
			<td width="6%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">事务总数</span>
				</div>
			</td>			
			<td width="8%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">版本责任人</span>
				</div>
			</td>
		</tr>
			<tr>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.voVerPlans[#i].voProduct.name" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4">
						<s:a href="%{#request.voVerPlans[#i].verOR}" title="点我打开文件">OR链接</s:a>
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#request.voVerPlans[#i].verCountry" /> </span>
					</div>
				</td>

				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#request.voVerPlans[#i].verVendor" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:date name="#request.voVerPlans[#i].verDate"
								format="yyyy-MM-dd" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:date
								name="#request.voVerPlans[#i].verFinalDate" format="yyyy-MM-dd" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.voVerPlans[#i].verStatue" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.voVerPlans[#i].unFinishedTranCount" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.voVerPlans[#i].riskCounts" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.voVerPlans[#i].totalTranCounts" />
						</span>
					</div>
				</td>				
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#request.voVerPlans[#i].vpImpl_user.name" /> </span>
					</div>
				</td>
			</tr>
	</table>
	<p align="center">-----------对应的关键事件---------</p>
	<table class="table-layout:fixed" width="100%" border="2" cellpadding="0" cellspacing="0">
		<tr>
			<td>时间</td>
			<s:iterator value="#request.dates" var="date"	status="datess">
			<td><s:property value="#date"/>   </td>
			</s:iterator>
		</tr>
		<s:iterator value="#request.allKeyThings[#i]" var="voKeyThingss"	status="voKeyThingsss">
		<tr>
			<td>关键事件内容</td>
			<s:iterator value="#voKeyThingss" var="voKeyThing"	status="voKeyThings">
			<td>
				<s:property value="#voKeyThing.mapBasicKeyThing"/>
			</td>
			</s:iterator>
		</tr>
		</s:iterator>
	</table>
	
	<br/><br/><p>------------------下一个版本计划--------------------</p><br/>
	</s:iterator>
</body>
</html>
