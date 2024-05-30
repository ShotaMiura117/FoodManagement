<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<style>
h1 {
	/*線の種類（実線） 太さ 色*/
	border-bottom: solid 3px black;
}
</style>


<title>削除完了テストページ</title>
</head>
<body>
	<h1>食材データの削除が完了しました。</h1>

	<form action="<%=request.getContextPath()%>/ManagementList"
		method="POST" name="list">
		<input type="hidden" name="param" value="テスト">
	</form>

	<a href="<%=request.getContextPath()%>/ManagementList"
		onclick="document.list.submit();return false;">食品リストページへ</a>



</body>
</html>