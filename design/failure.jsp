<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ログイン失敗</title>
</head>

<body>

<h3>ログイン失敗しました。</h3>

<form action="<%=request.getContextPath() %>/login" method = "Post">

	<input type = "submit" name = "btn" value = "ログインページ">

</form>

</body>

</html>