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
<link rel="stylesheet" href="design/syouhinsyousai.css" type="text/css">
</head>
<body>
	<h1 class="top_title">���i�ڍ�</h1>
	<div class="but">
		<button
			<%-- ������URL
			onclick="location.href='<%=request.getContextPath()%>/design/ManagementListpage.jsp'">
			�H�ރ��X�g�ɖ߂� --%>


			onclick="location.href='<%=request.getContextPath()%>/test_shokuzai_detail/testshokuzaitop.jsp'">
			�e�X�g�g�b�v�ɖ߂�</button>
	</div>
	<div class="container">
		<div class="table">
			<div class="tablehead">
				<table>

				<!-- �Z�b�V��������H�ރ��X�g���擾 -->
					<%
					List<ShokuzaiBean> shokuzaiList =
					(List<ShokuzaiBean>)request.getAttribute("shokuzaiList");
					/* �H�ރ��X�g��(i)�Ԗڂ�Shokuzaibean�ɃZ�b�g */
					ShokuzaiBean sbean = shokuzaiList.get(0);
		%>
					<tr>
						<th>���i��</th>
						<td>
						<%=sbean.getItem_name()%>
						</td>
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
						<th>�ܖ�����/�������</th>
						<td><%=sbean.getExpiration_date()%></td>
					</tr>
				</table>
				<br>
				<div class="button">
				<!-- �ҏW�y�[�W�ɑJ�� -->
					<button type="button" class="b" name="edit_btn" value="�ҏW"
					onclick="location.href='<%=request.getContextPath()%>/test_shokuzai_detail/shokuzaiEdit.jsp'">
					�ҏW
					</button>

					<br> <br>
				<!-- �H�ރf�[�^���폜 -->
					<button type="button" class="btn" name="delete" value="�폜"
					onclick="location.href='<%=request.getContextPath()%>/test_shokuzai_detail/deleteCheck.jsp'"
					>�폜</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>