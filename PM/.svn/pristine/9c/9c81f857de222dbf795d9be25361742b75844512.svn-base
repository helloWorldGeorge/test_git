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
<script type="text/javascript" src="Widget/datePicker_css/jquery-1.8.1.js"></script>
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
		<s:a href="\ERP\index.jsp" theme="simple">回到主页</s:a>
		</p>		
		<s:form action="searchEveryThing.action" theme="simple">
			<s:select name="voProduct.id" list="%{#request.voProducts}" listKey="id" listValue="name" headerKey="80" headerValue="--请选择--" >产品</s:select>
			<s:textfield name="verVendor">vendor(必须跟锁卡表一致的小写)</s:textfield>
			<s:textfield name="verCountry" >country(必须跟锁卡表一致的小写)</s:textfield>
			<s:textfield name="searchString" value="%{#request.searchString}">搜索</s:textfield>
			<s:submit label="开始搜索"></s:submit>
		</s:form>
	<p align="center">---------------------【版本信息】-------------------------</p>
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
								value="#voVerPlan.vpImpl_user.name" /> </span>
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
							
						</span>
					</div></td>
			</tr>
		</s:iterator>
	</table>	
	<br/><br/> 
	<p align="center">---------------------【关键 事件信息】-------------------------</p>
	<table class="table-layout:fixed" width="100%" border="2" cellpadding="0" cellspacing="0"
		bgcolor="b5d6e6">
		<tr>
			<td width="10px" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">序号</span>
				</div>
			</td>
			<!--showjsp_1-->
<td width="100px" height="22"><div align="center"><span class="STYLE1">对应的基础事件名称</span></div></td>
<td width="100px" height="22"><div align="center"><span class="STYLE1">是否完成</span></div></td>
<td width="100px" height="22"><div align="center"><span class="STYLE1">创建时间</span></div></td>
<td width="100px" height="22"><div align="center"><span class="STYLE1">备注</span></div></td>
		</tr>
		<s:iterator value="#request.voKeyThings" var="voKeyThing"	status="voKeyThings">
			<tr>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:property
								value="#voKeyThings.getIndex()+1" /> </span>
					</div>
				</td>
				<!--showjsp_2-->
<td height="20"><div align="center"><span class="STYLE4"><s:property value="#voKeyThing.mapBasicKeyThing" /></span></div></td>
<td height="20"><div align="center"><span class="STYLE4"><s:property value="#voKeyThing.isOver" /></span></div></td>
<td height="20"><div align="center"><span class="STYLE4"> <s:date name="#voKeyThing.createDate" format="yyyy-MM-dd" /></span></div></td>
<td height="20"><div align="left"><span class="STYLE4"><pre><s:property value="#voKeyThing.remark" /></pre>	</span></div></td>
			</tr>
		</s:iterator>
	</table>
	
	
	<br/><br/> 
	<p align="center">---------------------【事务信息】-------------------------</p>
	<table class="remark_table" style="width: 100%">
		<tr>
			<th ><div align="center">
					<span class="STYLE1">序号</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">责任组</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">DTS或者AR</span>
				</div>
			</th>
			<th width="20%" bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">简要描述</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">当前处理人</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">期望完成日期</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">提交日期</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">解决计划状态</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">问题单状态</span>
				</div>
			</th>
		</tr>
		<s:iterator value="#request.dtsfromSUNs" var="dtsfromSUN" status="dtsfromSUNs">
			<tr>
				<td >
					<div align="center">
						<span class="STYLE4"> <s:property
								value="#dtsfromSUNs.getIndex()+1" /> </span>
					</div>
				</td>
				<td ><div align="center">
						<span class="STYLE4"><s:property value="#dtsfromSUN.team_name" />
						</span>
					</div>
				</td>
				<td ><div align="left">
						<span class="STYLE4"><s:property value="#dtsfromSUN._dts_order" />
						</span>
					</div>
				</td>
				<td ><div style="align:left;width:600px;overflow:hidden">
						<s:property value="#dtsfromSUN._description" />						
					</div>
				</td>
				<td ><div align="center">
						<span class="STYLE4"><s:property value="#dtsfromSUN.user_name" />
						</span>
					</div>
				</td>
				<td ><div align="center">
						<span class="STYLE4">
							<s:date name="#dtsfromSUN.dts_create_time" format="yyyy-MM-dd" />
						</span>
					</div>
				</td>
				<td ><div align="center">
						<span class="STYLE4">
						<s:date name="#dtsfromSUN.dts_fix_deadline" format="yyyy-MM-dd" />
						</span>
					</div>
				</td>
				<td ><div align="center">
						<span class="STYLE4"><s:property value="#dtsfromSUN.dts_status" />
						</span>
					</div>
				</td>
				<td ><div align="center">
						<span class="STYLE4"><s:property value="#dtsfromSUN.dts_data1" />
						</span>
					</div>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
