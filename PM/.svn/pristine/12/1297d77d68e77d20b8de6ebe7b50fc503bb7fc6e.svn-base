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

<title>editVoZHANGTAO</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="Widget/datePicker_css/jquery-ui.css" rel="stylesheet">
<script type="text/javascript" src="Widget/datePicker_css/jquery-1.8.1.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/jquery-ui.js"></script>
<script type="text/javascript" src="Widget/datePicker_css/dateinput-ch-ZN.js"></script>
<script>
	$(document).ready(function() {   
        $("#popupDatepicker").datepicker();
	}); 
</script>
<style type="text/css">
<!--
.OLD_TXT {color: #999999}
-->
</style>
</head>

<body>
<s:form action="editVoZHANGTAO.action" method="post">
<table class="remark_table" style="width: 100%">
<tr>
	<th>属性</th>
	<th>当前最新信息</th>
	<th>需要修改为</th>
	
</tr>
<!-- edit_jsp -->
<tr><td>主键<td><td><span class="OLD_TXT">此参数不可直接编辑</span></td><td><s:hidden name="id" value="%{#request.voZHANGTAO.id}"/></td></tr>
<tr><td>项目名称</td><td><span class="OLD_TXT"><s:property value="#request.voZHANGTAO.name" /></span></td><td><s:textarea cols="130" rows="2" name="name" label="项目名称" value="%{#request.voZHANGTAO.name}"/></td></tr>
<tr><td>服务器信息</td><td><span class="OLD_TXT"><s:property value="#request.voZHANGTAO.serverInfo" /></span></td><td><s:textarea cols="130" rows="2" name="serverInfo" label="服务器信息" value="%{#request.voZHANGTAO.serverInfo}"/></td></tr>
<tr><td>后台信息</td><td><span class="OLD_TXT"><s:property value="#request.voZHANGTAO.backSpaceInfo" /></span></td><td><s:textarea cols="130" rows="2" name="backSpaceInfo" label="后台信息" value="%{#request.voZHANGTAO.backSpaceInfo}"/></td></tr>
<tr><td>第三方账户信息</td><td><span class="OLD_TXT"><s:property value="#request.voZHANGTAO.thirdPartyInfo" /></span></td><td><s:textarea cols="130" rows="2" name="thirdPartyInfo" label="第三方账户信息" value="%{#request.voZHANGTAO.thirdPartyInfo}"/></td></tr>
<tr><td>创建人</td><td><span class="OLD_TXT"><s:property value="#request.voZHANGTAO.implUser" /></span></td><td><s:select name="implUser.id" list="#request.implUsers" listKey="id" listValue="name" label="创建人" value="%{#request.voZHANGTAO.implUser.id}"></s:select></td></tr>
<tr><td>备注</td><td><span class="OLD_TXT"><s:property value="#request.voZHANGTAO.remark" /></span></td><td><s:textarea cols="130" rows="2" name="remark" label="备注" value="%{#request.voZHANGTAO.remark}"/></td></tr>
	
</table>
<s:submit value="确认修改" />
</s:form>
</body>
</html>
