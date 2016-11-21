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

<title>manageVoVerPlan</title>

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
<table class="table-layout:fixed" width="100%" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><s:a href="\ERP\index.jsp" theme="simple">回到主页</s:a></td>
		<td>
			<s:url id="showMines" action="showMyVoVerPlans.action">
			<s:param value="#request.session.loginUser.id" name="vpImpl_user.id"></s:param>
			</s:url>
			<s:a href="%{showMines}" theme="simple">我的版本计划</s:a>
		</td>
		<td>
			<s:url id="manageAllVoVerPlan" action="manageVoVerPlan.action">
			<s:param value="#request.session.voVerPlan.id" name="voVerPlan.id"></s:param>
			<s:param name="isShowAllTran">hello</s:param>
			</s:url>
			<s:a href="%{manageAllVoVerPlan}" theme="simple">显示全部问题单</s:a>
		</td>
		<td>
			<s:url id="downTheDTS" action="manageVoVerPlan.action">
			<s:param value="#request.session.voVerPlan.id" name="voVerPlan.id"></s:param>
			</s:url>
			<s:a href="%{downTheDTS}" theme="simple">只显示未完成</s:a>
		</td>
		<td>
			<s:url id="gotoAddVoTran" action="gotoAddVoTran.action">
			<s:param value="#request.session.voVerPlan.id" name="voVerPlan.id"></s:param>
			</s:url>
			<s:a href="%{gotoAddVoTran}" theme="simple">添加事务</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
			
			<s:url id="gotoBatchAddTran" action="gotoBatchAddTran.action">
			<s:param value="#request.session.voVerPlan.id" name="voVerPlan.id"></s:param>
			</s:url>
			<s:a href="%{gotoBatchAddTran}" theme="simple">批量添加事务</s:a>
		</td>
		<td>
			<s:url id="gotoAddVoKeyThing" action="gotoAddVoKeyThing.action">
			<s:param value="#request.session.voVerPlan.id" name="voVerPlan.id"></s:param>
			</s:url>
			<s:a href="%{gotoAddVoKeyThing}" theme="simple">添加关键事件</s:a>&nbsp;&nbsp;&nbsp;&nbsp;
		</td>
		<td>
			<s:textarea name="someRemark" theme="simple" value="">备注信息</s:textarea>
		</td>
	</tr>
</table>
	<p></p>		
		<s:form action="queryVoTran.action" theme="simple">
			<s:textfield name="queryString">搜索</s:textfield>
		</s:form>
	<p align="center">---------------------【版本信息】-------------------------</p>
	<table class="table-layout:fixed" width="100%" border="2" cellpadding="0" cellspacing="0"
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
			<td height="20"bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.session.voVerPlan.voProduct.name" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:a href="%{#voVerPlan.verOR}" title="点我打开文件">OR链接</s:a>
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#request.session.voVerPlan.verCountry" /> </span>
					</div>
				</td>

				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#request.session.voVerPlan.verVendor" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:date name="#request.session.voVerPlan.verDate"
								format="yyyy-MM-dd" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:date
								name="#request.session.voVerPlan.verFinalDate" format="yyyy-MM-dd" /> </span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.session.voVerPlan.verStatue" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.session.voVerPlan.unFinishedTranCount" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.session.voVerPlan.riskCounts" />
						</span>
					</div>
				</td>
					<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property value="#request.session.voVerPlan.totalTranCounts" />
						</span>
					</div>
				</td>				
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"><s:property
								value="#request.session.voVerPlan.vpImpl_user.name" /> </span>
					</div>
				</td>
			</tr>
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
			<td width="50px" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">配置</span>
				</div>
			</td>
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
				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> 
							<s:url id="getVoKeyThingContents" action="getVoKeyThingContents.action">
								<s:param name="id" value="#voKeyThing.id" />
							</s:url> 
							<s:a href="%{getVoKeyThingContents}">查看详细</s:a>
							<!-- ignore privilege s:if test="1 in %{#request.session.pris}"> -->
							<s:url id="overVoKeyThing" action="overVoKeyThing.action">
								<s:param name="id" value="#voKeyThing.id" />
							</s:url> 
								&nbsp;&nbsp;&nbsp;&nbsp;
								<s:a href="%{overVoKeyThing}" target="_blank">一键完成</s:a>
							
							<s:url id="deleteVoKeyThing" action="deleteVoKeyThing.action">
								<s:param name="id" value="#voKeyThing.id" />
							</s:url>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<s:a href="%{deleteVoKeyThing}" target="_blank">删除</s:a>
						</span>
					</div></td>
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
			<th ><div align="center">
					<span class="STYLE1">简要描述</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">当前处理人</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">提交日期</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">期望完成日期</span>
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
			<th ><div align="center">
					<span class="STYLE1">事务风险等级</span>
				</div>
			</th>
			<th ><div align="center">
					<span class="STYLE1">事务总状态</span>
				</div>
			</th>
			<th background="images/tab/bg.gif"
				 class="STYLE1"><div align="center">基本操作</div>
			</th>
		</tr>
		<s:iterator value="#request.voTrans" var="voTran" status="voTrans">
			<tr>
				<td >
					<div align="center">
						<span class="STYLE4"> <s:property
								value="#voTrans.getIndex()+1" /> </span>
					</div>
				</td>
				<td ><div align="center">
						<span class="STYLE4"><s:property value="#voTran.dtsfromSUN.team_name" />
						</span>
					</div>
				</td>
				<td width="100px" ><div align="left">
						<span class="STYLE4"><s:property value="#voTran.dtsfromSUN._dts_order" />
						</span>
					</div>
				</td>
				<td width="600px" ><div style="align:left">
						<s:property value="#voTran.dtsfromSUN._description" />						
					</div>
				</td>
				<td width="50px" ><div align="center">
						<span class="STYLE4"><s:property value="#voTran.dtsfromSUN.user_name" />
						</span>
					</div>
				</td  >
				<td width="100px"><div align="center">
						<span class="STYLE4">
							<s:date name="#voTran.dtsfromSUN.dts_create_time" format="yyyy-MM-dd" />
						</span>
					</div>
				</td>
				<td width="80px"><div align="center">
						<span class="STYLE4">
						<s:date name="#voTran.dtsfromSUN.dts_fix_deadline" format="yyyy-MM-dd" />
						</span>
					</div>
				</td>
				<td width="80px"><div align="center">
						<span class="STYLE4"><s:property value="#voTran.dtsfromSUN.dts_status" />
						</span>
					</div>
				</td>
				<td width="50px"><div align="center">
						<span class="STYLE4"><s:property value="#voTran.dtsfromSUN.dts_data1" />
						</span>
					</div>
				</td>
				<td width="50px"><div align="center">
						<span class="STYLE4"><s:property value="#voTran.tranRisklevel" />
						</span>
					</div>
				</td>
				<td ><div align="center">
						<span class="STYLE4"><s:property value="#voTran.tranStatue" />
						</span>
					</div>
				</td>
				<td >
					<div align="center">
						<span class="STYLE4"> 
						<!-- 
							<s:url id="riskTran" action="nextStatue.action">
									<s:param name="id" value="#voTran.id" />
									<s:param name="tranStatue">风险</s:param>									
							</s:url>
						-->
								<s:url id="left" action="mapKeyThingAndVoTran.action">
									<s:param name="id" value="#voTran.id" />
									<s:param name="keyString" value="#voTran.dtsfromSUN._dts_order+'-----'+#voTran.dtsfromSUN._description"/>
									<s:param name="tranStatue">遗留</s:param>									
								</s:url>
								<s:a href="%{left}" ><img src="images/manageVoVerPlan/遗留.bmp" title="遗留" width="20" height="20"></s:a>
							<s:if test="#voTran.tranStatue!='预测试Fail'">
								<s:url id="YCS_FAIL" action="mapKeyThingAndVoTran.action">
									<s:param name="keyString" value="#voTran.dtsfromSUN._dts_order+'-----'+#voTran.dtsfromSUN._description"/>
									<s:param name="id" value="#voTran.id" />
									<s:param name="tranStatue">预测试Fail</s:param>									
								</s:url>
								<s:a href="%{YCS_FAIL}" ><img src="images/manageVoVerPlan/预测试Fail.bmp" title="预测试Fail" width="20" height="20"></s:a>
							</s:if> 
							<s:if test="#voTran.tranStatue!='回归失败'">
								<s:url id="ZYZ_FAIL" action="mapKeyThingAndVoTran.action">
									<s:param name="keyString" value="#voTran.dtsfromSUN._dts_order+'-----'+#voTran.dtsfromSUN._description"/>
									<s:param name="id" value="#voTran.id" />
									<s:param name="tranStatue">回归Fail</s:param>									
								</s:url>
								<s:a href="%{ZYZ_FAIL}" ><img src="images/manageVoVerPlan/回归Fail.bmp" title="回归Fail" width="20" height="20"></s:a>
							</s:if> 
							<s:if test="#voTran.tranStatue!='风险升级'">
								<s:url id="UP_RISK" action="mapKeyThingAndVoTran.action">
									<s:param name="keyString" value="#voTran.dtsfromSUN._dts_order+'-----'+#voTran.dtsfromSUN._description"/>
									<s:param name="id" value="#voTran.id" />
									<s:param name="tranStatue">风险升级</s:param>									
								</s:url>
								<s:a href="%{UP_RISK}" ><img src="images/manageVoVerPlan/风险升级.bmp" title="风险升级" width="20" height="20"></s:a>
							</s:if> 
							<s:if test="#voTran.tranStatue！='完成'">
								<s:url id="OVER_MANUALLY" action="mapKeyThingAndVoTran.action">
									<s:param name="keyString" value="#voTran.dtsfromSUN._dts_order+'-----'+#voTran.dtsfromSUN._description"/>
									<s:param name="id" value="#voTran.id" />
									<s:param name="tranStatue">完成</s:param>									
								</s:url>
								<s:a href="%{UP_RISK}" ><img src="images/manageVoVerPlan/风险升级.bmp" title="手动完成" width="20" height="20"></s:a>
							</s:if>
						</span>
								
					</div>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
