<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME</title>
</head>
<body>
  名前とパスワードを入力してください。
  <s:form action="LoginAction">
    <s:textfield name="username"/>
    <s:password name="password"/>
    <s:submit value="送信"/>
  </s:form>
</body>
</html>