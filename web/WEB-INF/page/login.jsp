<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/login.css">
</head>
<body>
    <div>
        <div class="h">
            <h1>后台管理</h1>
        </div>
        <div class="formLogin">
            <form action="${pageContext.request.contextPath}/management/login" method="get">
                <input type="text"  name="username" placeholder="账户名"><br><br>
                <input type="password" name="password" placeholder="密码"><br><br>
                <input type="submit" value="登录">
            </form>
        </div>
    </div>
</body>
</html>
