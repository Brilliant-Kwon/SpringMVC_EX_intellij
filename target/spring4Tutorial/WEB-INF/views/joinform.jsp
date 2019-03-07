<%--
  Created by IntelliJ IDEA.
  User: k1212
  Date: 2019-03-07
  Time: 오전 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
    <style type="text/css">
        input {
            display: block;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<form method="post" action="/springTutorial_war_exploded/user/join">
    <input type="text" name="name" placeholder="이름"/>
    <input type="password" name="password" placeholder="비밀번호"/>
    <input type="text" name="email" placeholder="이메일"/>
    <input type="submit" value="전송">
</form>
</body>
</html>
