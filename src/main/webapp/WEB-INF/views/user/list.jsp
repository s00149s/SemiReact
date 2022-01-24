<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <table class="table table-hover table table-striped">
        <tr>
            <th>번호</th>
            <th>작성자</th>
            <th>제목</th>
        </tr>

        <c:forEach items="${users}" var="user">
            <tr>
                <th>${user.getId()}</th>
                <th>${user.getPassword()}</th>
                <th>${user.getNickName()}</th>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>