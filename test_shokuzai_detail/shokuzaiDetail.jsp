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
<title>�H�i�ڍ׃y�[�W</title>
<link rel="stylesheet" href="syouhinsyousai.css">
</head>
<body>
	<h1 class="top_title">���i�ڍ�</h1>
	<div class="but">
		<!-- <button type="button" >���i���X�g��</button> -->
		<button
			<%-- ������URL
			onclick="location.href='<%=request.getContextPath()%>/design/ManagementListpage.jsp'"> --%>


			onclick="location.href='<%=request.getContextPath()%>/test_shokuzai_detail/testshokuzaitop.jsp'">
			�H�ރ��X�g�ɖ߂�</button>
	</div>
	<div class="container">
		<div class="table">
			<div class="tablehead">
				<table>
					<%
					List<ShokuzaiBean> shokuzaiList =
					(List<ShokuzaiBean>)request.getAttribute("shokuzaiList");
					ShokuzaiBean sbean = shokuzaiList.get(16);
		%>
					<tr>
						<th>���i��</th>
						<td><%=sbean.getItem_name()%></td>
					</tr>
					<tr>
						<th>�H�ޖ�</th>
						<td><%=sbean.getMaterials_name()%></td>
					</tr>
					<tr>
						<th>����</th>
						<td><%=sbean.getVolume()%>
						<%=sbean.getUnit_name() %>
						�~
						<%=sbean.getQuantity() %>
						</td>
					</tr>
					<tr>
						<th>�ۑ����@</th>
						<td><%=sbean.getSave_method() %>
						</td>
					</tr>
					<tr>
						<th>�J�����</th>
						<td><%=sbean.getOpen_check()%></td>
					</tr>
					<tr>
						<th>�W������</th>
						<td><%=sbean.getGenre_name()%></td>
					</tr>
					<tr>
						<th>�L������</th>
						<td><%=sbean.getFilling_date()%></td>
					</tr>
					<tr>
						<th>�ܖ������D�������</th>
						<td><%=sbean.getExpiration_date()%></td>
					</tr>
				</table>
				<br>
				<div class="button">
					<button type="button" class="b">�ҏW</button>
					<br> <br>
					<button type="button" class="btn">�폜</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>