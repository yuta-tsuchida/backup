<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloServlet</title>
</head>
<body>
  GET通信
  <form method="get" action="./TestServlet">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit" value="送信">
  </form>
  POST通信
  <form method="post" action="./TestServlet">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit" value="送信">
  </form>
</body>
</html>