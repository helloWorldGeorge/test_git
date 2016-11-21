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

<title>My JSP 'showAllNum.jsp' starting page</title>

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
		<s:url id="gotoAddVerPlan" action="gotoAddVerPlan.action"></s:url>
		<s:a href="%{gotoAddVerPlan}">添加事务</s:a>
	</p>
	<p>
		<s:form action="queryVerPlan.action">
			<s:textarea name="queryString">搜索</s:textarea>
		</s:form>
	</p>
<!-- 列宽百分比4	6	16	32	10	10	6	6	10-->
	<table width="100%" border="2" cellpadding="0" cellspacing="0"
		bgcolor="b5d6e6">
		<tr>
			<td width="4%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">序号</span>
				</div>
			</td>
			<td width="6%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">事务识别编码</span>
				</div>
			</td>
			<td width="6%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">事务类型</span>
				</div>
			</td>
			<td width="16%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">事务摘要</span>
				</div>
			</td>
			<td width="26%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">变更记录</span>
				</div>
			</td>
			<td width="10%" background="images/tab/bg.gif" bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">计划完成日期</span>
				</div>
			</td>
			<td width="10%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">事务对应DTS</span>
				</div>
			</td>
			<td width="6%" background="images/tab/bg.gif" bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">事务总状态</span>
				</div>
			</td>
			<td width="6%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">事务责任人</span>
				</div>
			</td>
			<td width="10%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF" class="STYLE1"><div align="center">基本操作</div>
			</td>
		</tr>


		<s:iterator value="#request.voTrans" var="voTran"
			status="voTrans">
			<tr>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:property
								value="#voTrans.getIndex()+1" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voTran.tranid" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voTran.tranSummary" /> </span>
					</div>
				</td>

				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#voTran.remark" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:date name="#voTran.planfixDate"
								format="yyyy-MM-dd" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voTran.tranDTS" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:date
								name="#voTran.tranStatue" format="yyyy-MM-dd" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#voTran.voUser.userName" /> </span>
					</div>
				</td>

				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> 
							<s:url id="getTranDetails" action="getTranDetails.action">
								<s:param name="voTran.id" value="#voTran.id" />
							</s:url> 
							<s:a href="%{getTranDetails}">详细</s:a>
							<!-- ignore privilege s:if test="1 in %{#request.session.pris}"> 
							<s:url id="gotoEditVerPlan" action="gotoEditVerPlan.action">
								<s:param name="verPlan.verPlanID" value="#verPlan.verPlanID" />
							</s:url> 
								&nbsp;&nbsp;&nbsp;&nbsp;
								<s:a href="%{gotoEditVerPlan}" target="_blank">编辑</s:a>-->
						</span>
					</div></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
