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
    
    <title>My JSP 'showAllNum.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<style type="text/css">
.test1 {
	font-size: 16px;
	font-style: italic;
}
</style>
  </head>
  
  <body>
  <s:set name="column_list" value="{'','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}"></s:set>
  <p>版本信息</p>
	<table width="100%" border="2" cellpadding="0" cellspacing="0"
		bgcolor="b5d6e6">
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
			<td width="6%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">国家</span>
				</div>
			</td>
			<td width="13%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">运营商</span>
				</div>
			</td>
			<td width="10%" background="images/tab/bg.gif" bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">最新版本计划时间</span>
				</div>
			</td>
			<td width="15%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">计划版本类型</span>
				</div>
			</td>
			<td width="10%" background="images/tab/bg.gif" bgcolor="#FFFFFF">
				<div align="center">
					<span class="STYLE1">最终版本计划日期</span>
				</div>
			</td>
			<td width="13%" background="images/tab/bg.gif" bgcolor="#FFFFFF"><div
					align="center">
					<span class="STYLE1">版本责任人</span>
				</div>
			</td>
		</tr>
			<tr>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voVerPlan.voProduct" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#voVerPlan.verOR" />
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
						<span class="STYLE4"><s:property value="#voVerPlan.verType" />
						</span>
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
						<span class="STYLE4"><s:property
								value="#voVerPlan.vpImpl_user.name" /> </span>
					</div>
				</td>
			</tr>
	</table>
  <p>请选择批量添加事务的选项</p>
  <s:form action="batchAddTran.action" method="post">
  <s:hidden value="#request.voVerPlan.id" name="voVerPlan.id"></s:hidden>
 	<table align="center" width="50%" border="2" cellpadding="0" cellspacing="0">
 		<tr>
 			<td width="50%"><input type="checkbox" name="userChoose" value="1" /><span class="test1">事务识别编码</span></td>
 			<td width="50%"><s:select theme="simple" name="voBatchAddTran.co_tranid" list="#column_list" headerValue="B"></s:select></td>
 		</tr>
 		<tr>
 			<td width="50%"><input type="checkbox" name="userChoose" value="2" /><span class="test1">事务摘要</span></td>
 			<td width="50%"><s:select theme="simple" name="voBatchAddTran.co_tranSummary" list="#column_list" headerValue="C"></s:select></td>
 		</tr>
 		<tr>
 			<td width="50%"><input type="checkbox" name="userChoose" value="3" /><span class="test1">事务详细内容</span></td>
 			<td width="50%"><s:select theme="simple" name="voBatchAddTran.co_tranDetails" list="#column_list" headerValue="D"></s:select></td>
 		</tr>
 		 <tr>
 			<td width="50%"><input type="checkbox" name="userChoose" value="4" /><span class="test1">事务DTS</span></td>
 			<td width="50%"><s:select theme="simple" name="voBatchAddTran.co_tranDTS" list="#column_list" headerValue="D"></s:select></td>
 		</tr>
 	</table>
 	<s:submit></s:submit>
 	</s:form>
  </body>
</html>
