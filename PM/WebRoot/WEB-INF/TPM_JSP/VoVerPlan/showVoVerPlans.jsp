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

<title>showAllVoVerPlans</title>

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
	<s:a href="\ERP\index.jsp">回到主页</s:a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<s:url id="showVoVerPlanProcess" action="showVoVerPlanProcess.action">
			<s:param name="id" value="#voVerPlan.id" />
		</s:url> 
			&nbsp;&nbsp;&nbsp;&nbsp;
		<s:a href="%{showVoVerPlanProcess}" target="_blank">显示项目进度</s:a>
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

	<table class="table-layout:fixed" width="100%" border="2" cellpadding="0" cellspacing="0"
		bgcolor="b5d6e6">
		<tr>
			<td width="4%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">序号</span>
				</div>
			</td>
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
			<td height="14" background="images/tab/bg.gif"
				bgcolor="#FFFFFF" class="STYLE1"><div align="center">基本操作</div>
			</td>
		</tr>


		<s:iterator value="#request.voVerPlans" var="voVerPlan"
			status="voVerPlans">
			<tr>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:property
								value="#voVerPlans.getIndex()+1" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voVerPlan.voProduct.name" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4">
						<s:a href="%{#voVerPlan.verOR}" title="点我打开文件">OR链接</s:a>
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#voVerPlan.verCountry" /> </span>
					</div>
				</td>

				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#voVerPlan.verVendor" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:date name="#voVerPlan.verDate"
								format="yyyy-MM-dd" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:date
								name="#voVerPlan.verFinalDate" format="yyyy-MM-dd" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voVerPlan.verStatue" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voVerPlan.unFinishedTranCount" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voVerPlan.riskCounts" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voVerPlan.totalTranCounts" />
						</span>
					</div>
				</td>				
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#voVerPlan.vpImpl_user.cnName" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> 
							<s:url id="manageVoVerPlan" action="manageVoVerPlan.action">
								<s:param name="id" value="#voVerPlan.id" />
							</s:url> 
							<s:a href="%{manageVoVerPlan}">进入管理</s:a>
							<!-- ignore privilege s:if test="1 in %{#request.session.pris}"> -->
							<s:url id="gotoEditVoVerPlan" action="gotoEditVoVerPlan.action">
								<s:param name="id" value="#voVerPlan.id" />
							</s:url> 
								&nbsp;&nbsp;&nbsp;&nbsp;
							<s:a href="%{gotoEditVoVerPlan}" target="_blank">编辑</s:a>
							<s:url id="refleshFromSUN" action="refleshFromSUN.action">
								<s:param name="id" value="#voVerPlan.id" />
							</s:url> 
								&nbsp;&nbsp;&nbsp;&nbsp;
							<s:a href="%{refleshFromSUN}">刷新</s:a>
							
							
							
						</span>
					</div></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
