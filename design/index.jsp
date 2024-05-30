<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>タイトルページ</title>
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
			<li><a href="login.jsp">マネジメントリスト</a></li>
			<li><a href="login.jsp">食品詳細</a></li>
			<li><a href="login.jsp">食品記入</a></li>
			<li><a href="login.jsp">料理詳細ページ</a></li>
			<li><a href="login.jsp">必要な商品合計</a></li>

			<!-- <li><a href="ManagementListpage.jsp">マネジメントリスト</a></li>
			<li><a href="syohinsyosai.jsp">食品詳細</a></li>
			<li><a href="syohinkinyupage.jsp">食品記入</a></li>
			<li><a href="ryourisyousaipage.jsp">料理詳細ページ</a></li>
			<li><a href="syouhingoukei.jsp">必要な商品合計</a></li> -->
		</ul>
		<h2 class="title">FoodManagementSystem</h2>
		<div class="rightNav">
			<a href="login.jsp">
				<button class="btn btn-sm">ログイン</button>
			</a>
		</div>
	</nav>
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