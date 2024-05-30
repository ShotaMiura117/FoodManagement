<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>アカウント作成失敗画面</title>

<style>
 h2 {
  border-bottom: solid 3px black;
}
</style>
</head>
<body>

<h2>このユーザー名は既に使用されています。</h2>
初めからやり直してください。
<br>
<a href="<%=request.getContextPath() %>/design/SignUp.jsp">ログインページに戻る</a>

</body>
</html>