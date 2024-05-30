
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" session="true"%>
<%@ page import="shokuzaiList.SelectShokuzaiBean" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="javax.servlet.http.HttpServletResponse"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログアウト</title>
<style>
h1 {
	/*線の種類（実線） 太さ 色*/
	border-bottom: solid 3px black;
}
</style>
<body>
<h1>ログアウトしました。</h1>

<a href="<%=request.getContextPath() %>/design/login.jsp">トップに戻る</a>
</body>
</html>
