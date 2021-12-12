<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>yufeng</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/index.css">
    <script src="${pageContext.request.contextPath}/webjars/jquery/3.6.0/jquery.min.js"> </script>
    <script src="${pageContext.request.contextPath}/static/js/index.js"></script>
</head>
<body>
<img class="backgroundPage" src="${pageContext.request.contextPath}/static/image/背景.jpg">
    <div class="main">

        <div class="head">

            <div class="logo">
                <span>YuFengStudy.com</span>
            </div>

            <div class="search">
                <form action="#" method="post">
                    <div class="searchText">
                        <input class="Text" type="text" placeholder="请输入关键词">
                    </div>
                    <div class="searchBtn">
                        <button class="Btn" type="submit">搜索</button>
                    </div>
                </form>
            </div>

        </div>

        <hr class="headHr">


        <div class="leftColumn">

            <div class="userHead">
                <a href="${pageContext.request.contextPath}/toLogin" target="_blank"> <img class="headImage"  src="${pageContext.request.contextPath}/static/image/头像.jpg"></a>
            </div>

            <div class="navigation">
                <div class="list">
                    <a  href="${pageContext.request.contextPath}/index"><span id="indexBtn">首页</span></a>
                </div>
                <div class="list">
                    <input type="button" value="留言">
                </div>
                <div class="list">
                    <input type="button" value="关于">
                </div>
                <div class="list">
                    <input type="button" value="打赏">
                </div>
                <div class="list">
                    <input type="button" value="分类">
                </div>
            </div>
        </div>

        <div class="middleColumn">
            <c:forEach var="blog" items="${blogsList}">
            <div class="item">
                <div class="headline">${blog.title}</div>
                <hr>
                <div class="synopsis">${blog.synopsis}</div>
                <hr>
                <span class="viewsNumber">观看人数：${blog.lookNumber}</span>
                <span class="likeNumber">点赞人数：${blog.praisNumber}</span>
                <span class="commentNumber">评论人数：${blog.commentNumber}</span>
            </div>
            </c:forEach>


            <div class="changePage">
                <a href="${pageContext.request.contextPath}/upPage"><input type="button" class="upPage" value="上一页"></a>
                <a>1</a>
                <a>2</a>
                <a>3</a>
                <a>4</a>
                <a>5</a>
                <a href="${pageContext.request.contextPath}/nextPage"><input type="button" class="downPage" value="下一页"></a>
                <input type="text" class="thisPage" name="currentPage" value="${currentPage}">
            </div>

        </div>

        <div class="rightColumn">
            <div class="message">
                <span>博客信息</span><br>
                <span>文章总数：${blogsCount}</span><br>
                <span name="day">运行时间：${day}天</span><br>
                <span>访问人数：${website.accessNumber}</span><br>
            </div>
        </div>

    </div>
</body>
</html>
