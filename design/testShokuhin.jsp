<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>�e�X�g���</title>
</head>
<body>
	<h3>�e�X�g</h3>
	<table border="3">
		<try>
		<th>�H��id</th>
		<th>pk_id</th>
		<th>�H�ޖ�</th>
		</try>

		<%
			List<shokuzaiBean> shokuzaiList = (List<ShokzuairBean>) request.getAttribute("shokuzaiList");
			for (int i = 0; i < shokuzaiList.size(); i++) {
				ShokuzaiBean sbean = shokuzaiList.get(i);
		%>
		<tr>
			<td><%=sbean.getShokuzai_id()%></td>
			<td><%=sbean.getPk_id()%></td>
			<td><%=sbean.getMaterials_name()%></td>
		</tr>
		<%
			}
		%>
		</table>

</body>
</html>

