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
  <a href="http://localhost:8080/GYPHONE/PM_JSP/addVoPhone.jsp">添加手机</a>
	 <table width="100%" border="2" cellspacing="0" cellpadding="0">
		 <tr>
			 <td width="100%">
				 <table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="8" background="images/tab/tab_12.gif">&nbsp;</td>
										<td><table width="100%" border="0" cellpadding="0"
												cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"
												onmouseout="changeback()">
												<tr>
													<td width="4%" height="22" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<input type="checkbox" name="checkbox" value="checkbox" />
														</div></td>
													<td width="6%" height="22" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<span class="STYLE1">序号</span>
														</div></td>
													<td width="8%" height="22" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<span class="STYLE1">手机型号</span>
														</div></td>
													<td width="6%" height="22" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<span class="STYLE1">手机编号</span>
														</div></td>
													<td width="13%" height="22" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<span class="STYLE1">手机IMEI号</span>
														</div></td>
													<td width="10%" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<span class="STYLE1">手机属性</span>
														</div></td>
													<td width="13%" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<span class="STYLE1">最新位置</span>
														</div></td>
														
													<td width="15%" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<span class="STYLE1">最新备注</span>
														</div></td>
													<td width="9%" background="images/tab/bg.gif"
														bgcolor="#FFFFFF"><div align="center">
															<span class="STYLE1">最新更新时间</span>
														</div></td>	
													<td width="16%" height="22" background="images/tab/bg.gif"
														bgcolor="#FFFFFF" class="STYLE1"><div align="center">基本操作</div>
													</td>
												</tr>
											
				
										<s:iterator value="#request.allPhone" var="voPhone" status="allPhone">
											<tr>
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
					              					<input type="checkbox" name="checkbox2" value="checkbox" />
					           						</div>
					           					</td>
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4"><s:property value="#allPhone.getIndex()+1" />
														</span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4"><s:property value="#voPhone.phoneType" /></span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4"><s:property value="#voPhone.phoneNum" /></span>
													</div></td>
												
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4"><s:property value="#voPhone.phoneIMEI" /></span>
													</div></td>
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4"><s:property value="#voPhone.phoneAttibute" /></span>
													</div></td>									
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4"><s:property value="#voPhone.latestSituation" /></span>
													</div></td>										
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4"><s:property value="#voPhone.latestUserRemark" /></span>
													</div></td>									
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4">
														<s:date name="#voPhone.latestUpdateDate" format="yyyy-MM-dd"/>
														</span>
													</div></td>
												
												<td height="20" bgcolor="#FFFFFF">
													<div align="center">
														<span class="STYLE4">
															<s:url id="gototransmitPhone" action="gototransmitPhone.action">
															<s:param name="phoneID" value="#voPhone.phoneID" />
															</s:url>
															<s:url id="transmitPhone" action="transmitPhone.action">
															<s:param name="phoneID" value="#voPhone.phoneID" />
															<s:param name="commitString">归还库房</s:param>
															</s:url>
															<s:url id="queryVoPhoneRecord" action="queryVoPhoneRecord.action">
															<s:param name="phoneID" value="#voPhone.phoneID" />
															</s:url>
															<s:if test="#voPhone.latestStatue!='提交状态'">
															<s:a href="%{gototransmitPhone}" target="_blank" >借出/转借</s:a>
															</s:if>															
															<s:if test="#voPhone.latestStatue=='外借状态'">
															&nbsp;&nbsp;&nbsp;&nbsp;
															<s:a href="%{transmitPhone}" >归还库房</s:a>
															</s:if>
															
														</span>
													</div>
												</td>
											</tr>
										</s:iterator>
										</table>
										</td>
										<td width="8" background="images/tab/tab_15.gif">&nbsp;</td>
									</tr>
					</table>
				</td>
			</tr>
	</table>
  </body>
</html>
