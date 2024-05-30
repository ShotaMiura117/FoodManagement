<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>編集完了ページ</title>
</head>
<body>
<h1>編集が完了しました。</h1>
<%-- <a href="<%=request.getContextPath() %>/test_shokuzai_detail/testshokuzaitop.jsp">食品リストページへ</a><br/>
 --%>
 <form action ="<%=request.getContextPath()%>/ManagementList" method="POST" name="list">
 <input type="hidden" name="param" value="テスト">
 </form>

 <a href="<%=request.getContextPath() %>/ManagementList" onclick="document.list.submit();return false;">食品リストページへ</a>
 <br/>


</body>
</html>