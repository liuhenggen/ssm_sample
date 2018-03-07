<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>注册页面</title>

    <meta name="keywords" content="注册网页,西安电子科技大学,韩春">
    <meta name="description" content="a simple demo to Web APP">
    <meta name="content-type" content="text/html; charset=UTF-8">

</head>

<body>

<h2 align=center>注册页面</h2>
<center>

    <form action="<%=path %>/admin/user/register" method="post">
        <table border="1">
            <tr>
                <td>登录名：</td>
                <td><input name="username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input name="password" type="password"></td>
            </tr>
            <tr>
                <td>重复密码：</td>
                <td><input name="conPassword" type="password"></td>
            </tr>
            <tr>
                <td>邮箱地址：</td>
                <td><input name="email"></td>
            </tr>
            <tr align="center">
                <td><input type="submit" value="提交注册"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>

    您有账号？<a href="<%=path %>/admin/user/toLogin"><front color="GREEN" >点击直接登录</front></a>
</center>
</body>
</html>