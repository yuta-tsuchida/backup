<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloJSP3</title>
</head>
<body>
  <p>お名前を入力してください</p>
  <form method="post" action="greeting-out.jsp">
    <input type="text" name="user">
    <input type="submit" value="確定">
  </form>
</body>
</html>