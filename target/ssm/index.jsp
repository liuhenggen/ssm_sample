
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>登陆页面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta name="content-type" content="text/html; charset=UTF-8">
</head>

<body>

去注册吧？<a href="<%=path%>/admin/user/index">点击注册吧</a><br/>
去登录吧？<a href="<%=path %>/admin/user/toLogin"><front color="GREEN" >点击直接登录</front></a>

</body>
</html>