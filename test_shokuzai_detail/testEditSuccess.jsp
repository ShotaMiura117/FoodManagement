<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>�ҏW�����y�[�W</title>
</head>
<body>
<h1>�ҏW���������܂����B</h1>
<%-- <a href="<%=request.getContextPath() %>/test_shokuzai_detail/testshokuzaitop.jsp">�H�i���X�g�y�[�W��</a><br/>
 --%>
 <form action ="<%=request.getContextPath()%>/ManagementList" method="POST" name="list">
 <input type="hidden" name="param" value="�e�X�g">
 </form>

 <a href="<%=request.getContextPath() %>/ManagementList" onclick="document.list.submit();return false;">�H�i���X�g�y�[�W��</a>
 <br/>


</body>
</html>