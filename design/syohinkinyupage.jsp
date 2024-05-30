<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>���i�L���y�[�W</title>
<link rel="stylesheet" href="syohinkinyupage.css">
</head>
<body>
	<div class="container">
		<div class="table">
			<div class="tablehead">
				<form action="<%=request.getContextPath()%>/touroku" method="POST">
					<table>
						<caption>�H�i�L��</caption>
						<tr>
							<th>���i��</th>
							<td><input type="text" name="syouhinName" Required></td>
						</tr>
						<tr>
							<th>�C�ɂȂ�</th>
							<td><input type="radio" name="shokuzai_favorite" value="1">Yes
								<input type="radio" name="shokuzai_favorite" value="0">No
								<input type="hidden" name="shokuzai_favorite" value="0">

							</td>
						</tr>
						<tr>
							<th>�H�ޖ�</th>
							<td><input type="text" name="syokuzaiName" Required></td>
						</tr>
						<tr>
							<th>����</th>
							<td><input type="number" name="quantity" max="5000000"
								min="1" Required> <select name="volume">
									<option value="1">g</option>
									<option value="2">ml</option>
									<option value="3">��</option>
							</select></td>
						<tr>
							<th>�~</th>
							<td><input type="number" name="unit_id" max="5000000"
								min="1"></td>
						</tr>
						<tr>
							<th>�ۑ����@</th>
							<td><select name="save_method" id="save" Required>
									<option value="1">�①��</option>
									<option value="2">�Ⓚ��</option>
									<option value="3">��؎�</option>
									<option value="4">�퉷�ۑ�</option>
							</select></td>
						</tr>
						<tr>
							<th>�J�����</th>
							<td><input type="radio" name="open_check" value="1" checked>�J���ς�<input
								type="radio" name="open_check" value="0">���J��</td>
						</tr>
						<tr>
							<th>�W������</th>
							<td><select name="genre_id" Required>
									<option value="1">����</option>
									<option value="2">���</option>
									<option value="3">�ʕ�</option>
									<option value="4">�����</option>
									<option value="5">�����E�C����</option>
									<option value="6">����</option>
									<option value="7">�p����</option>
									<option value="8">���͂��</option>
									<option value="9">�����i��</option>
									<option value="10">���E������</option>
									<option value="11">�˗�</option>
									<option value="12">���[�E�f</option>
									<option value="13">�a��������</option>
									<option value="14">�m��������</option>
									<option value="15">���ؒ�����</option>
									<option value="16">���̑�</option>
							</select></td>
						</tr>
						<tr>
							<th>�L����</th>
							<td><input type="text" name="filling_date" required>
							</td>
						</tr>
						<tr>
							<th>�ܖ������D�������</th>
							<td><input type="date" class="date" name="expiration_date"
								required></td>
						</tr>
					</table>
					<br>
					<div class="button">

                        </td>
                    </tr>
                    <tr>
                        <th>�W������</th>
                        <td>
                            <select name="genre_id">
                               <option value="1">����</option>
                                <option value="2">���</option>
                                <option value="3">�ʕ�</option>
                                <option value="4">�����</option>
                                <option value="5">�����E�C����</option>
                                <option value="6">����</option>
                                <option value="7">�p����</option>
                                <option value="8">���͂��</option>
                                <option value="9">�����i��</option>
                                <option value="10">���E������</option>
                                <option value="11">�˗�</option>
                                <option value="12">���[�E�f</option>
                                <option value="13">�a��������</option>
                                <option value="14">�m��������</option>
                                <option value="15">���ؒ�����</option>
                                <option value="16">���̑�</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>�L����</th>
                        <td>
                            <input type="text" name="filling_date" required>
                        </td>
                    </tr>
                    <tr>
                        <th>�ܖ������D�������</th>
                        <td>
                            <input type="date" class="date" name="expiration_date" required>
                        </td>
                    </tr>
                </table>
                <br>
                <div class="button">

                <button type="submit"  class="btn">�ۑ�</button>
                </div>
                </form>
                </br>

				<%-- <form action="<%=request.getContextPath()%>/ManagementList"
					method="POST">
				 --%>	<div class="button">
					<a href="main.jsp">
						<button type="submit" class="b" name="b">�L�����Z��</button></a>
						<br>
						<br>
					</div>
				</form>
			</div>
        </div>
    </div>

</body>
</html>