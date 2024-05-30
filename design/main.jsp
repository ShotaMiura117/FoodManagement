<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>�^�C�g���y�[�W</title>
<link rel="stylesheet" href="title.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar">
		<ul class="nav-list">

			<form action="<%=request.getContextPath()%>/ManagementList"
				method="POST" name="list">
				<input type="hidden" name="param" value="�e�X�g">
			</form>

			<li><a href="<%=request.getContextPath()%>/ManagementList"
				onclick="document.list.submit();return false;">�}�l�W�����g���X�g</a></li>

			<li><a href="syohinkinyupage.jsp">�H�i�L��</a></li>

			<li><a href="ryourisyousaipage.jsp">�����ڍ׃y�[�W</a></li>
			<li><a href="ryoriZairyoKinyu.jsp">�ޗ��L���y�[�W</a></li>
		</ul>
		<h2 class="title">FoodManagementSystem</h2>
				<form action="<%=request.getContextPath()%>/logout"
					method="GET">
		<div class="rightNav">

						<button type="submit" class="btn btn-sm" name="logout">���O�A�E�g</button>
						</form>

					</div></nav>
	<div class="slideshow-container">
		<div class="slider">
			<img src="photos/momo.jpg" alt="Momo" style="width: 100%">
		</div>
		<div class="slider">
			<img src="photos/sasimi.jpg" alt="sasimi" style="width: 100%">
		</div>
		<div class="slider">
			<img src="photos/Ramen.jpg" alt="Ramen" style="width: 100%">
		</div>
	</div>
	<script src="title.js"></script>
</body>
</html>