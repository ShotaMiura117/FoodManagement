<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>管理する食材リストページ</title>
<link rel="stylesheet" href="ManagementListpage.css">
<script src="https://kit.fontaweso me.com/8ff098a16e.js"crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="search">
			<form action="#">
				<input type="text" placeholder="検索してください" name="search">
				<button>
					<i class="fa-solid fa-magnifying-glass" style="font-size: 14px;">検索</i>
				</button>
			</form>
		</div>
		<div class="list">
			<table>
				<tr>
					<th>開封</th>
					<th>食材名</th>
					<th>数量</th>
					<th>賞味期限．消費期限</th>
					<th>削除</th>
					<th>編集</th>
				</tr>
				<tr>
					<td>未</td>
					<td>豚肉</td>
					<td>1</td>
					<td>2024-05-02</td>
					<td><input type="number" name="number" min="1" max="50">
						<input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<td>未</td>
					<td>豚肉</td>
					<td>1</td>
					<td>2024-05-02</td>
					<td><input type="number" name="number" min="1" max="50">
						<input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<td>未</td>
					<td>豚肉</td>
					<td>1</td>
					<td>2024-05-02</td>
					<td><input type="number" name="number" min="1" max="50">
						<input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>