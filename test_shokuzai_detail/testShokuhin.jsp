<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="java.util.*" %>
<%@ page import="shokuzai_detail.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>�e�X�g���</title>
</head>
<body>
	<h3>�e�X�g</h3>
	<table border="4">
		<try>
		<th>�H��id</th>
		<th>pk_id</th>
		<th>�H�ޖ�</th>
		<th>volume</th>
		</try>

		<%
			List<ShokuzaiBean> shokuzaiList =
			(List<ShokuzaiBean>)request.getAttribute("shokuzaiList");
			for (int i = 0; i < shokuzaiList.size(); i++) {
				ShokuzaiBean sbean = shokuzaiList.get(i);
		%>
		<tr>
			<td><%=sbean.getShokuzai_id()%></td>
			<td><%=sbean.getPk_id()%></td>
			<td><%=sbean.getMaterials_name()%></td>
			<td><%=sbean.getVolume()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>

