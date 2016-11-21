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
		<s:a href="\ERP\TPM_JSP\VoUser\addVoUser.jsp">添加</s:a>
	</p>
	<p>
		<s:form action="queryVoUser.action">
			<s:textarea name="queryString">搜索</s:textarea>
		</s:form>
	</p>

	<table width="100%" border="2" cellpadding="0" cellspacing="0"
		bgcolor="b5d6e6">
		<tr>
			<td width="6%" bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">自定义登入用户名</span>
				</div>
			</td>
			<td width="6%" bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">用户英文名</span>
				</div>
			</td>
			<td width="6%" bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">中文名</span>
				</div>
			</td>
			<td width="6%" bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">用户密码</span>
				</div>
			</td>
			<td width="6%" bgcolor="#FFFFFF"><div align="center">
					<span class="STYLE1">用户角色</span>
				</div>
			</td>

			<td width="16%" height="22" background="images/tab/bg.gif"
				bgcolor="#FFFFFF" class="STYLE1"><div align="center">基本操作</div>
			</td>
		</tr>
		<s:iterator value="#request.voUsers" var="voUser" status="voUsers">
			<tr>
				<td height="20" bgcolor="#FFFFFF"><div align="center">
						<span class="STYLE4"><s:property value="#voUser.loginName" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF"><div align="center">
						<span class="STYLE4"><s:property value=".voUser.cnName" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF"><div align="center">
						<span class="STYLE4"><s:property value="#voUser.cnName" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF"><div align="center">
						<span class="STYLE4"><s:property value="#voUser.password" />
						</span>
					</div>
				</td>
				<td height="20" bgcolor="#FFFFFF"><div align="center">
						<span class="STYLE4"><s:property value="#voUser.roleID" />
						</span>
					</div>
				</td>

				<td height="20" bgcolor="#FFFFFF">
					<div align="center">
						<span class="STYLE4"> <s:url id="getVoUserDetails"
								action="getVoUserDetails.action">
								<s:param name="voUser.id" value="#voUser.id" />
							</s:url> <s:a href="%{getVoUserDetails}">详细</s:a> <!-- ignore privilege s:if test="1 in %{#request.session.pris}"> -->
							<s:url id="gotoEditVoUser" action="gotoEditVoUser.action">
								<s:param name="id" value="#voUser.id" />
							</s:url> &nbsp;&nbsp;&nbsp;&nbsp; <s:a href="%{gotoEditVoUser}"
								target="_blank">编辑</s:a> </span>
					</div></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
