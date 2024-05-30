<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="java.util.*" %>
	<%@page import="java.sql.*" %>
	<%@page import="shokuzaiList.*" %>
	<%@page import="java.util.Date"%>
	<%@page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>管理する食材リストページ</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/shokuzaiListtest/ManagementListpage.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://kit.fontaweso me.com/8ff098a16e.js"crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">

                <div class="logout">
                			 <form action="<%=request.getContextPath() %>/logout">
            	<button type="submit"class="b">ログアウト</button></form>
            	 <a href="<%=request.getContextPath() %>/design/main.jsp">マイページに戻る</a>

		</div>
            <div class="hyoji"style="display:inline-flex">
                <form action="<%=request.getContextPath() %>/SelectList"method="POST"id="select">
                <button type="submit" class="btn btn-outline-primary" name="hyoji">選択した食品で料理を検索</button></form>
           <form action="<%=request.getContextPath() %>/touroku"method="get"id="tsuika">
                <button type="submit" class="btn btn-outline-info"name="tsuika"id="tsuika">食品を追加</button></form>
                            </div>



		<div class="list">
			<table  >
				<tr >
				<th ></th>
				<th >お気に入り</th>
					<th >開封</th>
					<th >食材名</th>
					<th>数量</th>
					<th >保管方法</th>
					<th >期限</th>
					<th >使用量</th>

					<th >削除</th>
				</tr>
	<%

	List<ShokuzaiListBean> shokuzaiListbean=
	(List<ShokuzaiListBean>)request.getAttribute("shokuzaiList");


	 for(int i=0; i<shokuzaiListbean.size();i++){
			ShokuzaiListBean sListbean =shokuzaiListbean.get(i);
%>


				<tr>
					<td ><input type="checkbox"name="selectShokuzai"value="<%=sListbean.getName()%>"form="select"></td>
					<td>
					<b><%if(sListbean.getSFavorite() ==1){out.write("★");}else{out.write("☆");};%></b>
					</td>
					<td ><%if(sListbean.getOpen() == 1){out.print("済");}else{out.print("未");};%></td>
					<td >
					<form action="<%=request.getContextPath()%>/shokuzai">
					<button type="submit" class="btn btn-Link"name="deteil"value="<%=sListbean.getShokuzaiID()%>">
					<%=sListbean.getName()%></button></form></td>
					<td><%=sListbean.getVolume()%><%=sListbean.getUnit() %>/<%=sListbean.getDefaVolume()%>
					<%=sListbean.getUnit() %>×<%=sListbean.getQuantity()%></td>
					<td><%switch(sListbean.getSave()){
					case 1 :out.write("冷蔵庫")
					;break; case 2 :out.write("冷凍庫")
					;break; case 3 :out.write("野菜室")
					;break; case 4:out.write("常温")
					;
					}%></td>
					<td ><%Date exception = sListbean.getExpiration();
					if(exception !=null){
			        Date calender =new Date();
			        long diffInMillies=sListbean.getExpiration().getTime()-calender.getTime();
			        long diffInDays=diffInMillies / (1000 * 60 * 60 * 24);
			        String color=(diffInDays <=3)?"red":"black";
			        out.println("<font color=\""+color+"\">");}%>
			        <%if(exception ==null){out.println("");}else{out.print(sListbean.getExpiration());}%> </td>
					<td ><form action= "<%=request.getContextPath()%>/usedvolume"method="POST">
					<input type="hidden" name="devoSID"value="<%=sListbean.getShokuzaiID()%>">
					<input type="number" name="devolume" min="0" max="<%=sListbean.getDefaVolume()*sListbean.getQuantity()%>deletes"
					value="0"placeholder="0.01"step="0.1">
					<%=sListbean.getUnit() %>

					<input type="submit"value="確定"></form></td>

					 <td ><form action="<%=request.getContextPath() %>/deletes"method="POST">
					 <button type="submit" class="btn btn-outline-success" name="deletes"
					 value="<%=sListbean.getShokuzaiID()%>">削除</button></form></td>
					 </tr>



<%
}
%>

			</table>
		</div>
		</div>

</body>
</html>