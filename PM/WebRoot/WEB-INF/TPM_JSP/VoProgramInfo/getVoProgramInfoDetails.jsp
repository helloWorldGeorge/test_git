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

<title>editVoProgramInfo</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="Widget/datePicker_css/jquery-ui.css" rel="stylesheet">
<script type="text/javascript"
	src="Widget/datePicker_css/jquery-1.8.1.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/jquery-ui.js"></script>
<script type="text/javascript"
	src="Widget/datePicker_css/dateinput-ch-ZN.js"></script>
<script>
	$(document).ready(function() {
		$("#popupDatepicker").datepicker();
	});
</script>

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
.OLD_TXT {color: #999999}
}
</style>

</head>

<body>
		<table class="remark_table" style="width: 100%">
			<tr>
				<th>属性名称</th>
				<th>当前最新信息</th>
			</tr>
			<!-- edit_jsp -->
			<tr>
				<td>主键</td>
				<td><s:property value="%{#request.voProgramInfo.id}" /></td>
			</tr>
			<tr>
				<td>项目名称</td>
				<td><span class="OLD_TXT"><s:property value="#request.voProgramInfo.name" /></span></td>
			</tr>
			<tr>
				<td>服务器信息</td>
				<td><pre><span class="OLD_TXT"><s:property value="#request.voProgramInfo.serverInfo" /></span></pre></td>
			</tr>
			<tr>
				<td>后台信息
				</td>
				<td><pre><span class="OLD_TXT"><s:property value="#request.voProgramInfo.backSpaceInfo" /></span></pre>
				</td>
			</tr>
			<tr>
				<td>第三方账户信息
				</td>
				<td><pre><span class="OLD_TXT"><s:property value="#request.voProgramInfo.thirdPartyInfo" /></span></pre>
				</td>
			</tr>
			<tr>
				<td>创建人
				</td>
				<td><span class="OLD_TXT"><s:property value="#request.voProgramInfo.implUser.name" /></span>
				</td>
			</tr>
			<tr>
				<td>备注
				</td>
				<td><span class="OLD_TXT"><s:property value="#request.voProgramInfo.remark" /></span>
				</td>
			</tr>

		</table>
</body>
</html>
