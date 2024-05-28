
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
<body>
ログアウトしました。<br><br>

<a href="<%=request.getContextPath() %>/home">トップに戻る</a>
</body>
</html>
