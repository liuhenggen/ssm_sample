
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
    <meta name="keywords" content="注册网页,西安电子科技大学,韩春">
    <meta name="description" content="a simple demo to Web APP">
    <meta name="content-type" content="text/html; charset=UTF-8">
</head>

<body>
<h2 align=center>欢迎您</h2>
<center>
    <form action="<%=path %>/admin/user/login" method="post">
        <table border="1">
            <tr>
                <td>用户名：</td>
                <td><input name="username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input name="password" type="password"></td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="点击登陆"></td>
            </tr>
        </table>

        <div class="form-group  col-lg-6">
            <label class="col-sm-4 control-label">
                验证码:
            </label>
            <div class="col-sm-8">
                <input type="text" id="code" name="code" class="form-control" style="width:250px;"/>
                <img id="imgObj" alt="验证码" src="/article/validateCode" onclick="changeImg()"/>
                <a href="#" onclick="changeImg()">换一张</a>
            </div>
        </div>
    </form>
    还没注册？<a href="<%=path%>/admin/user/index">点击注册吧</a>
</center>
</body>
<script type="text/javascript">
    // 刷新图片
    function changeImg() {
        var imgSrc = $("#imgObj");
        var src = imgSrc.attr("src");
        imgSrc.attr("src", changeUrl(src));
    }
    //为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
    function changeUrl(url) {
        var timestamp = (new Date()).valueOf();
        var index = url.indexOf("?",url);
        if (index > 0) {
            url = url.substring(0, url.indexOf(url, "?"));
        }
        if ((url.indexOf("&") >= 0)) {
            url = url + "×tamp=" + timestamp;
        } else {
            url = url + "?timestamp=" + timestamp;
        }
        return url;
    }
</script>

</html>