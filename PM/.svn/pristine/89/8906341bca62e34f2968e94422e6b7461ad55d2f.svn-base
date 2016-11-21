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

  </head>
  
  <body>
  <p> 版本计划ID:<s:property value="#request.vp.verPlanID"/></p>
  <p> 产品:<s:property value="#request.vp.voProduct"/></p>
  <p> 国家:<s:property value="#request.vp.verCountry"/></p>
  <p> 运营商:<s:property value="#request.vp.verVendor"/></p>
  <s:form action="actionBatchAddTran.action" method="post">
  <s:hidden value="#request.vp.verPlanID" name="verPlan.verPlanID"></s:hidden>
	<table width="100%" border="2" cellpadding="0" cellspacing="0" bgcolor="b5d6e6">
					<tr>
						<td width="4%" height="22" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<input type="checkbox" name="checkbox" />
							</div></td>
						<td width="4%" height="22" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">序号</span>
							</div></td>
						<s:if test="1 in #request.userChoose">
						<td width="12%" height="22" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">事务识别编码</span>
							</div></td>
						</s:if>
						<s:if test="2 in #request.userChoose">
						<td width="14%" height="22" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">事务摘要</span>
							</div></td>
						</s:if>	
						<s:if test="3 in #request.userChoose">
						<td  width="30%" height="22" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">事务详细</span>
							</div></td>
						</s:if>
						<s:if test="4 in #request.userChoose">														
						<td width="6%" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">事务类型</span>
							</div></td>
						</s:if>
						<s:if test="5 in #request.userChoose">														
						<td width="6%" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">合入状态</span>
							</div></td>
						</s:if>
						<s:if test="6 in #request.userChoose">
						<td width="6%" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">备注</span>
							</div></td>
						</s:if>
						<s:if test="4 in #request.userChoose">
						<td width="6%" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">事务对应DTS</span>
							</div></td>
						</s:if>
						<s:if test="8 in #request.userChoose">
						<td width="6%" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">事务对应DTS状态</span>
							</div></td>	
						</s:if>
						<s:if test="9 in #request.userChoose">
						<td width="6%" background="images/tab/bg.gif"
							bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE1">事务处理组别</span>
							</div></td>	
						</s:if>
					</tr>
				

			<s:iterator value="#request.voTrans" var="voTran" status="voTrans">
				<tr>
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
            					<input type="checkbox" name="voTransPageCheckBoxs" value="<s:property value='#voTrans.getIndex()'/>" checked="checked"/>
         						</div>
         					</td>
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:property value="#voTrans.getIndex()+1" />
							</span>
						</div>
					</td>
					<s:if test="1 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:textfield name="voTransPage[%{#voTrans.getIndex()}].tranid" theme="simple" value="%{#voTran.tranid}" /></span>
						</div>
					</td>		
					</s:if>
					<s:if test="2 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center" >
							<span class="STYLE4"><s:textfield size="100%" name="voTransPage[%{#voTrans.getIndex()}].tranSummary" theme="simple" value="%{#voTran.tranSummary}" /></span>
						</div>
					</td>	
					</s:if>										
					<s:if test="3 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:textarea cols="100"  name="voTransPage[%{#voTrans.getIndex()}].tranDetails" theme="simple" value="%{#voTran.tranDetails}" /></span>
						</div>
					</td>	
					</s:if>										
					<s:if test="4 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:textfield  name="voTransPage[%{#voTrans.getIndex()}].type" theme="simple" value="%{#voTran.type}" /></span>
						</div>
					</td>	
					</s:if>										
					<s:if test="5 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:textfield  name="voTransPage[%{#voTrans.getIndex()}].fixStatue" theme="simple" value="%{#voTran.fixStatue}" /></span>
						</div>
					</td>	
					</s:if>										
					<s:if test="6 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:textfield  name="voTransPage[%{#voTrans.getIndex()}].remark" theme="simple" value="%{#voTran.remark}" /></span>
						</div>
					</td>	
					</s:if>										
					<s:if test="7 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:textfield name="voTransPage[%{#voTrans.getIndex()}].tranDTS" theme="simple" value="%{#voTran.tranDTS}" /></span>
						</div>
					</td>	
					</s:if>										
					<s:if test="8 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:textfield name="voTransPage[%{#voTrans.getIndex()}].tranDTSstatue" theme="simple" value="%{#voTran.tranDTSstatue}" /></span>
						</div>
					</td>	
					</s:if>										
					<s:if test="9 in #request.userChoose">
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							<span class="STYLE4"><s:textfield name="voTransPage[%{#voTrans.getIndex()}].fixGroup" theme="simple" value="%{#voTran.fixGroup}" /></span>
						</div>
					</td>	
					</s:if>										
				</tr>
			</s:iterator>
			</table>
	<s:submit></s:submit>
	</s:form>
  </body>
</html>
