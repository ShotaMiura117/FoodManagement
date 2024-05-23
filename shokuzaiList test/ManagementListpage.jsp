<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
	<%@page import="java.util.*" %>
	<%@page import="java.sql.*" %>
	<%@page import="kari.*" %>
<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>管理する食材リストページ</title>
<link rel="stylesheet" href="ManagementListpage.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://kit.fontaweso me.com/8ff098a16e.js"crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">

			 <div class="logout">
            	<button class="b"onclick="<%=request.getContextPath() %>/logout">ログアウト</button>
            </div>
            <div class="hyoji">
                <form action="<%=request.getContextPath() %>/foodList"method="get"id="select">
                <button type="submit" class="btn btn-outline-primary" name="hyoji"id="select">選択した食品で料理を検索</button></form>
 <%--            <form action="<%=request.getContextPath() %>/shokuzaikinyu"method="get"id="tsuika">--%>
                <button type="submit" class="btn btn-outline-info"onclick="<%=request.getContextPath() %>/shokuzaikinyu"
                 name="tsuika"id="tsuika">食品を追加</button><%--</form>--%>
            </div>
		</div>
		<div class="list">
			<table>
				<tr>
				<th></th>
				<th></th>
					<th>開封</th>
					<th>食材名</th>
					<th>数量</th>
					<th>保管方法</th>
					<th>期限</th>
					<th>使用量</th>
					<th></th>
					<th>削除</th>
				</tr>
	<%
/* 	List<ShokuzaiListBean> shokuzaiListbean=
	(ShokuzaiListBean)request.getAttribute("shokuzaiList");
 */
	List<ShokuzaiListBean> shokuzaiListbean=
	(List<ShokuzaiListBean>)request.getAttribute("shokuzaiList");

	/* for(int i=0; i<shokuzaiList.size();i++){
		ShokuzaiListBean shokuzaiListbean =shokuzaiList.get(i);
	 */

	 for(int i=0; i<shokuzaiListbean.size();i++){
			ShokuzaiListBean sListbean =shokuzaiListbean.get(i);
	%>


				<tr>
					<td><input type="checkbox"name="selectShokuzai"value="<%=sListbean.getName()%>"form="select"></td>
					<td>
					<b><%if(sListbean.getSFavorite() ==1){out.write("★");}else{out.write("☆");};%></b>
					</td>
					<td><%if(sListbean.getOpen() == 1){out.write("済");}else{out.write("未");};%></td>
					<td>
					<button type="submit" class="btn btn-Link"name="deteil"value="<%=sListbean.getShokuzaiID()%>"
					onclick="<%=request.getContextPath()%>/shokuzai_deteil">
					<%=sListbean.getName()%></button></td>
					<td><%=sListbean.getVolume()%><%=sListbean.getUnit() %>/<%=sListbean.getDefaVolume()%>
					<%=sListbean.getUnit() %>×<%=sListbean.getQuantity()%></td>
					<td><%switch
					(sListbean.getSave()){
					case 1 :out.write("冷蔵庫")
					;break; case 2 :out.write("冷凍庫")
					;break; case 3 :out.write("野菜室")
					;break; case 4:out.write("常温")
					;
					}%></td>
					<td><%=sListbean.getExpiration()%> </td>
					<td><form action= "<%=request.getContextPath()%>/usedvolume"method="post">
					<input type="hidden" name="devoSID"value="<%=sListbean.getShokuzaiID()%>">
					<input type="number" name="devolume" min="0" max="<%=sListbean.getDefaVolume()*sListbean.getQuantity()%>">
					<%=sListbean.getUnit() %>
					<input type="submit"value="確定"></form></td>
					 <td> <button type="button" class="btn btn-outline-success" name="delete"
					 onclick="<%=request.getContextPath() %>/deletes"value="<%=sListbean.getShokuzaiID()%>">削除</button></td>
				</tr>
<%
}
%>

			</table>
		</div>

</body>
</html>