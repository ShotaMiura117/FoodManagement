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
<title>食品詳細ページ</title>
<link rel="stylesheet" href="design/syouhinsyousai.css" type="text/css">
</head>
<body>
	<h1 class="top_title">商品詳細</h1>
	<div class="but">
		<button
			<%-- 正しいURL
			onclick="location.href='<%=request.getContextPath()%>/design/ManagementListpage.jsp'">
			食材リストに戻る --%>


			onclick="location.href='<%=request.getContextPath()%>/test_shokuzai_detail/testshokuzaitop.jsp'">
			テストトップに戻る</button>
	</div>
	<div class="container">
		<div class="table">
			<div class="tablehead">
				<table>

				<!-- セッションから食材リストを取得 -->
					<%
					List<ShokuzaiBean> shokuzaiList =
					(List<ShokuzaiBean>)request.getAttribute("shokuzaiList");
					/* 食材リストの(i)番目をShokuzaibeanにセット */
					ShokuzaiBean sbean = shokuzaiList.get(0);
		%>
					<tr>
						<th>商品名</th>
						<td>
						<%=sbean.getItem_name()%>
						</td>
					</tr>
					<tr>
						<th>食材名</th>
						<td><%=sbean.getMaterials_name()%></td>
					</tr>
					<tr>
						<th>数量</th>
						<td><%=sbean.getVolume()%>
						<%=sbean.getUnit_name() %>
						×
						<%=sbean.getQuantity() %>
						</td>
					</tr>
					<tr>
						<th>保存方法</th>
						<td><%=sbean.getSave_method() %>
						</td>
					</tr>
					<tr>
						<th>開封状態</th>
						<td><%=sbean.getOpen_check()%></td>
					</tr>
					<tr>
						<th>ジャンル</th>
						<td><%=sbean.getGenre_name()%></td>
					</tr>
					<tr>
						<th>記入日時</th>
						<td><%=sbean.getFilling_date()%></td>
					</tr>
					<tr>
						<th>賞味期限/消費期限</th>
						<td><%=sbean.getExpiration_date()%></td>
					</tr>
				</table>
				<br>
				<div class="button">
				<!-- 編集ページに遷移 -->
					<button type="button" class="b" name="edit_btn" value="編集"
					onclick="location.href='<%=request.getContextPath()%>/test_shokuzai_detail/shokuzaiEdit.jsp'">
					編集
					</button>

					<br> <br>
				<!-- 食材データを削除 -->
					<button type="button" class="btn" name="delete" value="削除"
					onclick="location.href='<%=request.getContextPath()%>/test_shokuzai_detail/deleteCheck.jsp'"
					>削除</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>