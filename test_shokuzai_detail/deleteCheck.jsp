
<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="java.util.*"%>
<%@ page import="shokuzai_detail.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>�폜�m�F�y�[�W</title>
<link rel="stylesheet" href="css/shokuzaiDelete.css" type="text/css">


</head>
<body>
	<h1 class="top_title">���̐H�ނ��폜���܂����H</h1>

	<div class="container">
		<div class="table">
			<div class="tablehead">
				<table>

				<% if (!(session.getAttribute("item_name").equals(""))) {%>
					<tr>
						<th>���i��</th>
						<td><%=session.getAttribute("item_name")%></td>
					</tr>
				<% } %>
					<tr>
						<th>�H�ޖ�</th>
						<td><%=session.getAttribute("materials_name")%></td>
					</tr>
					<tr>
						<th>����</th>
						<td><%=session.getAttribute("volume")%>
						<% if (session.getAttribute("unit_id").equals(1)) {
						%>
						g <% }else if (session.getAttribute("unit_id").equals(2)) {
						%>
						ml <% }else if (session.getAttribute("unit_id").equals(3)) {
						%>
						�� <% }else {
						%>
						�P�ʖ��� <%} %>
						�~
						<%=session.getAttribute("quantity")%></td>
					</tr>
<%-- 					<tr>
						<th>�ۑ����@</th>
						<td><%=session.getAttribute("save_method")%></td>
					</tr>
					<tr>
						<th>�J�����</th>
						<td><%=session.getAttribute("open_check")%></td>
					</tr>
					<tr>
						<th>�W������</th>
						<td><%=session.getAttribute("genre_id")%></td>
					</tr>
 --%>					<tr>
						<th>�L������</th>
						<td><%=session.getAttribute("filling_date")%></td>
					</tr>
<%-- 					<tr>
						<th>�ܖ�����/�������</th>
						<td><%=session.getAttribute("expiration_date")%></td>
					</tr>
 --%>				</table>
				<br>

				<div class="button">
					<button type="button" class="btn"
					onclick="location.href='<%=request.getContextPath() %>/shokuzaid'">
						�폜</button>
					<button type="button" class="b"
					onclick="location.href='<%=request.getContextPath()%>/shokuzai'">
						�߂�</button>


				</div>

			</div>
		</div>
	</div>

</body>
</html>


