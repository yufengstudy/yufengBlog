<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/management.css">
    <script src="${pageContext.request.contextPath}/webjars/jquery/3.6.0/jquery.min.js"> </script>
    <script src="${pageContext.request.contextPath}/static/js/management.js"></script>
</head>
<body>

    <div class="main">
        <%--侧边导航栏--%>
        <div class="leftColumn">
            <div class="sess">

            </div>
            <div class="userDiv">
                <a href="${pageContext.request.contextPath}/management/queryUser"><input class="userBtn" type="button" value="个人信息"></a>
            </div>

            <div class="articleDiv">
                <input class="articleBtn" type="button" value="文章管理">
            </div>

            <div class="issueArticleDiv">
                <a class="issueArticleBtn" href="${pageContext.request.contextPath}/management/article" >发布文章</a>
            </div>
        </div>
        <%--用户信息编辑--%>
        <div class="userRedact">

            <div class="startUser">
                <ui>
                    <li>账号：${user.username}</li>
                    <li>昵称：${user.name}</li>
                    <li>年龄：${user.age}</li>
                    <li>住址：${user.address}</li>
                    <li>简介：${user.signature}</li>
                    <li>电话：${user.phone}</li>
                    <li>微信：${user.wechat}</li>
                    <li>QQ：${user.qq}</li>
                    <li>邮箱：${user.eMail}</li>
                </ui>
            </div>
            <div class="endUser">
                <form action="${pageContext.request.contextPath}/management/updateUser" method="get">
                    <input type="hidden" name="id" value="${user.id}">
                    <ui>
                        <li>账号:<input type="text" name="username" value="${user.username}"></li>
                        <li>昵称:<input type="text" name="name" value="${user.name}"></li>
                        <li>年龄:<input type="text" name="age" value="${user.age}"></li>
                        <li>住址:<input type="text" name="address" value="${user.address}"></li>
                        <li>简介:<input type="text" name="signature" value="${user.signature}"></li>
                        <li>电话:<input type="text" name="phone" value="${user.phone}"></li>
                        <li>微信:<input type="text" name="wechat" value="${user.wechat}"></li>
                        <li >QQ:<input class="QQ" name="qq" type="text" value="${user.qq}"></li>
                        <li>邮箱:<input type="text" name="eMail" value="${user.eMail}"></li>
                    </ui>
                    <input class="updateBtn" type="submit" value="修改">
                </form>
            </div>

        </div>
        <%--文章编辑--%>
        <div class="articleRedact">

        </div>



    </div>

</body>
</html>
