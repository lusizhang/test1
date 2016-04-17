<%--
 description:
 user: mayuan
 QQ:836119679
 date: 2016/3/27
 time: 19:39
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${website}login">
    studentNumber:<input type="text" name="studentNumber"><br>
    password<input type="password" name="password"><br>
    ${message}
    <input type="submit" value="登录">
</form>
</body>
</html>
