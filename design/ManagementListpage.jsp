<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>�Ǘ�����H�ރ��X�g�y�[�W</title>
<link rel="stylesheet" href=" href="<%=request.getContextPath() %>//ManagementListpage.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://kit.fontaweso me.com/8ff098a16e.js"crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="search">
			<form action="#">
				<input type="text" placeholder="�������Ă�������" name="search">
				<button>
					<i class="fa-solid fa-magnifying-glass" style="font-size: 14px;">����</i>
				</button>
			</form>
			 <div class="logout">
            	<button class="b">
            	<a href="login.jsp">���O�A�E�g</a></button>
            </div>
            <div class="hyoji">
                <button type="button" class="btn btn-outline-primary" name="hyoji">�I���������i�ڍׂ�\��</button>
                <button type="button" class="btn btn-outline-info" name="tsuika">�H�i��ǉ�</button>
            </div>
		</div>
		<div class="list">
			<table>
				<tr>
					<th>�J��</th>
					<th>�H�ޖ�</th>
					<th>����</th>
					<th>�ܖ������D�������</th>
					<th>�폜</th>
				</tr>
				<tr>
					<td>��</td>
					<td>�ؓ�</td>
					<td>1</td>
					<td>2024-05-02</td>
					<td><input type="number" name="number" min="1" max="50">
						<input type="checkbox"></td>
					 <td><button type="button" class="btn btn-outline-success" name="kakutei">�m��</button></td>
				</tr>
				<tr>
					<td>��</td>
					<td>�ؓ�</td>
					<td>1</td>
					<td>2024-05-02</td>
					<td><input type="number" name="number" min="1" max="50">
						<input type="checkbox"></td>
					 <td><button type="button" class="btn btn-outline-success" name="kakutei">�m��</button></td>
				</tr>
				<tr>
					<td>��</td>
					<td>�ؓ�</td>
					<td>1</td>
					<td>2024-05-02</td>
					<td><input type="number" name="number" min="1" max="50">
						<input type="checkbox"></td>
					 <td><button type="button" class="btn btn-outline-success" name="kakutei">�m��</button></td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>