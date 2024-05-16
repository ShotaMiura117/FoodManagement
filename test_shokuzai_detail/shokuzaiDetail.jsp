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
<title>商品詳細ページ</title>
<link rel="stylesheet" href="syouhinsyousai.css">
</head>
<body>
	<h1 class="top_title">商品詳細</h1>
	<div class="but">
		<!-- <button type="button" >商品リストへ</button> -->
		<button
			onclick="<%=request.getContextPath()%>/design/ManagementListpage.jsp">
			食材リストに戻る</button>
	</div>
	<div class="container">
		<div class="table">
			<div class="tablehead">
				<table>
					<%
					List<ShokuzaiBean> shokuzaiList =
					(List<ShokuzaiBean>)request.getAttribute("shokuzaiList");
					ShokuzaiBean sbean = shokuzaiList.get(1);
		%>
					<tr>
						<th>商品名</th>
						<td><%=sbean.getItem_name()%></td>
					</tr>
					<tr>
						<th>食材名</th>
						<td><%=sbean.getMaterials_name()%></td>
					</tr>
					<tr>
						<th>数量</th>
						<td><%=sbean.getVolume()%></td>
					</tr>
					<tr>
						<th>保存方法</th>
						<td>

						<c:choose>
								<c:when <%=sbean.getSave_method()%>="${option == 1}">
								冷蔵庫
								</c:when>
								<c:when <%=sbean.getSave_method()%>="${option == 2}">
								冷凍庫
								</c:when>
								<c:when<%=sbean.getSave_method()%>="${option == 3}">
								野菜室
								</c:when>
								<c:when <%=sbean.getSave_method()%>="${option == 4}">
								常温保存
								</c:when>
						</c:choose>
						</td>
					</tr>
					<tr>
						<th>開封状態</th>
						<td><%=sbean.getVolume()%></td>
					</tr>
					<tr>
						<th>ジャンル</th>
						<td><%=sbean.getGenre_id()%></td>
					</tr>
					<tr>
						<th>記入日時</th>
						<td><%=sbean.getFilling_date()%></td>
					</tr>
					<tr>
						<th>賞味期限．消費期限</th>
						<td><%=sbean.getExpiration_date()%></td>
					</tr>
				</table>
				<br>
				<div class="button">
					<button type="button" class="b">編集</button>
					<br> <br>
					<button type="button" class="btn">削除</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>