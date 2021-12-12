<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发布文章</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/editormd/examples/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/editormd/css/editormd.css">
    <style>

    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/blogs/addBlog" method="get">
    <div>
        <input type="hidden" name="blogID" value="">
        <input type="hidden" name="id" value="">
        <input type="text" name="title" placeholder="文章标题">
        <input type="text" name="synopsis" placeholder="文章简介">
    </div>
    <div class="issueArticle">
        <div id="layout">
            <div id="test-editormd">
                <textarea style="display: none" name="article"></textarea>
            </div>
        </div>
    </div>
    <div>
        <input type="submit" value="确认发布">
    </div>
</form>


<script src="${pageContext.request.contextPath}/static/lib/editormd/examples/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/lib/editormd/editormd.min.js"></script>
<script type="text/javascript">
    var testEditor;
    $(function () {
        testEditor = editormd("test-editormd", {
            width: "85%",
            height: 650,
            syncScrolling: "single",
            path: "${pageContext.request.contextPath}/static/lib/editormd/lib/"
        });

    });
</script>

</body>
</html>
