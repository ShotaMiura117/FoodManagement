<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<title>料理削除完了画面</title>
<style>
h2 {
	color: red;
	text-align: center;
}
a{
text-align:center;
}
</style>
</head>
<body>
	<h2>データを削除しました.</h2>
	<br>
	<a href="<%= request.getContextPath() %>/design/ryoriZairyoKinyu.jsp">料理記入ページへ</a>
</body>
</html>