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
    <title>My JSP 'addPhone.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/datePicker_css/jquery-ui.css" rel="stylesheet">
	<script type="text/javascript" src="css/datePicker_css/jquery-1.8.1.js"></script>
	<script type="text/javascript" src="css/datePicker_css/jquery-ui.js"></script>
	<script type="text/javascript" src="css/datePicker_css/dateinput-ch-ZN.js"></script>
	<link href="red-datepicker.css" rel="stylesheet">
	<script>
	$(document).ready(function() {   
           
       $('#popupDatepicker').datepicker(); //绑定输入框
	
	}); 
</script>
  </head>
  <body>
	<table>
		<tr>
			<td>
				<p>	<s:a href="\PM\TPM_JSP\VoUser\addVoUser.jsp">添加用户</s:a>	</p>
				<s:form action="login.action" method="post">
					<s:textfield name="voUser.loginName" label="用户名" />
					<s:password name="voUser.password" label="密码"></s:password>
					<s:submit value="登入" />
			    </s:form>
			</td>
		</tr>
	</table>    
  </body>
</html>
