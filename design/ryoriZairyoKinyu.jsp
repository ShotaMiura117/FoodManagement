<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="java.util.*"%>
<%@ page import="test.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>料理詳細ページ</title>
<link rel="stylesheet" href="ryoriZairyoKinyu.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://kit.fontawesome.com/8ff098a16e.js"
	crossorigin="anonymous"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<h1 class="top_title">料理の材料記入ページ</h1>
		<div class="right_container">
			<form action="<%=request.getContextPath()%>/ryori" method="POST">
				<div class="name">
					料理名:<input type="text" name="name" Required> 分:<input
						type="number" name="time" Required><br> <br>
				</div>


				<div id="ingredientContainer">
					<div class="list">
						食材: <input type="text" name="zairyo" Required> 数 量: <input
							type="number" name="suryo" max="500000000" min="0" Required> 単位: <input
							type="number" name="tani" max="5000000" min="0" Required
							style="font-size: smaller;">
						<!--<button type="button" class="rowDelete">削除</button>-->
					</div>
					<%
						String errorMsg = (String) request.getAttribute("errorMsg");
						if (errorMsg != null) {
					%>
					<p><%=errorMsg%></p>
					<%
						}
					%>


					<div class="btn">
						<a href="ryoriZairyoKinyu.jsp"><button type="button"
								name="cancel">キャンセル</button></a>
						<button type="submit" name="hozon">料理の材料保存</button>
					</div>
			</form>
			<form action="<%=request.getContextPath()%>/remove" method="POST">
				Name:<input type="text" name="name" required>
				<%
					String msg = (String) request.getAttribute("errorMsg");
					if (msg != null) {
				%>
				<p><%=msg%></p>
				<%
					}
				%>
				<button type="submit" >削除</button>
			</form>



		</div>
		<div class="listing">
			<%
				ResultSet rs1 = null;
				Connection con1 = null;
				PreparedStatement pst = null;

				try {
					Class.forName("org.postgresql.Driver");
					con1 = DriverManager.getConnection(
							"jdbc:postgresql://52.195.46.205:5432/Food_management",
							"postgres", "postgres");

					String sql = "SELECT materials_name,volume FROM recipe";

					pst = con1.prepareStatement(sql);

					rs1 = pst.executeQuery();
			%>

			<TABLE BORDER="1">
				<TR>
					<TH>材料名</TH>
					<TH>数量</TH>
				</TR>
				<%
					while (rs1.next()) {
				%>
				<TR>
					<TD><%=rs1.getString(1)%></td>
					<TD><%=rs1.getString(2)%></TD>
				</TR>

				<%
					}

					} catch (SQLException e) {
						e.printStackTrace();
					}
				%>
			</TABLE>

		</div>
	</div>

	<div class="left-container">
		<div class="total">
			<div class="box">
				<div class="slideshow-container">
					<div class="slider">
						<img src="img/beefstew.jpg" alt="beer"
							style="width: 250px; height: 250px">
					</div>
					<div class="slider">
						<img src="img/cheesecake.jpg" alt="sasimi"
							style="width: 250px; height: 250px">
					</div>
					<div class="slider">
						<img src="img/curry_rice.jpg" alt="Ramen"
							style="width: 250px; height: 250px">
					</div>
				</div>
			</div>
			<!--<img src="photos/momo.jpg" alt="Food_image"
						style="width: 250px; height: 250px">
				</div>-->
			<div class="medium_box">
				<!--<button id="rowAdder" type="button">タグの追加</button>-->
				<%
					ResultSet rs = null;
					Connection con = null;
					PreparedStatement pstmt = null;

					try {
						Class.forName("org.postgresql.Driver");
						con = DriverManager.getConnection(
								"jdbc:postgresql://52.195.46.205:5432/Food_management",
								"postgres", "postgres");

						String sql = "SELECT * FROM tag LIMIT 4";

						pstmt = con.prepareStatement(sql);

						rs = pstmt.executeQuery();
				%>
				<TABLE BORDER="1">
					<TR>
						<TH>ID</TH>
						<TH>TAG_NAME</TH>
					</TR>

					<%
						while (rs.next()) {
					%>

					<TR>
						<TD><%=rs.getString(1)%></td>
						<TD><%=rs.getString(2)%></TD>
					</TR>

					<%
						}

						} catch (SQLException e) {
							e.printStackTrace();
						}
					%>
				</TABLE>
			</div>
		</div>
	</div>


	<script src="title.js"></script>
</body>
</html>