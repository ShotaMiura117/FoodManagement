<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
	<%@page import="java.util.*" %>
	<%@page import="java.sql.*" %>
	<%@page import="shokuzaiList.*" %>
<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>�Ǘ�����H�ރ��X�g�y�[�W</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/shokuzaiListtest/ManagementListpage.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://kit.fontaweso me.com/8ff098a16e.js"crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">

                <div class="logout">
                			 <form action="<%=request.getContextPath() %>/logout">
            	<button type="submit"class="b">���O�A�E�g</button></form>

		</div>
            <div class="hyoji"style="display:inline-flex">
                <form action="<%=request.getContextPath() %>/SelectList"method="get"id="select">
                <button type="submit" class="btn btn-outline-primary" name="hyoji">�I�������H�i�ŗ���������</button></form>
           <form action="<%=request.getContextPath() %>/shokuzaikinyu"method="get"id="tsuika">
                <button type="submit" class="btn btn-outline-info"name="tsuika"id="tsuika">�H�i��ǉ�</button></form>
                            </div>



		<div class="list">
			<table  >
				<tr >
				<th ></th>
				<th >���C�ɓ���</th>
					<th >�J��</th>
					<th >�H�ޖ�</th>
					<th>����</th>
					<th >�ۊǕ��@</th>
					<th >����</th>
					<th >�g�p��</th>

					<th >�폜</th>
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
					<b><%if(sListbean.getSFavorite() ==1){out.write("��");}else{out.write("��");};%></b>
					</td>
					<td ><%if(sListbean.getOpen() == 1){out.print("��");}else{out.print("��");};%></td>
					<td >
					<form action="<%=request.getContextPath()%>/shokuzai_deteil">
					<button type="submit" class="btn btn-Link"name="deteil"value="<%=sListbean.getShokuzaiID()%>">
					<%=sListbean.getName()%></button></form></td>
					<td><%=sListbean.getVolume()%><%=sListbean.getUnit() %>/<%=sListbean.getDefaVolume()%>
					<%=sListbean.getUnit() %>�~<%=sListbean.getQuantity()%></td>
					<td><%switch(sListbean.getSave()){
					case 1 :out.write("�①��")
					;break; case 2 :out.write("�Ⓚ��")
					;break; case 3 :out.write("��؎�")
					;break; case 4:out.write("�퉷")
					;
					}%></td>
					<td ><%=sListbean.getExpiration()%> </td>
					<td ><form action= "<%=request.getContextPath()%>/usedvolume"method="POST">
					<input type="hidden" name="devoSID"value="<%=sListbean.getShokuzaiID()%>">
					<input type="number" name="devolume" min="0" max="<%=sListbean.getDefaVolume()*sListbean.getQuantity()%>deletes"value="0"placeholder="0.01"step="0.1">
					<%=sListbean.getUnit() %>

					<input type="submit"value="�m��"></form></td>

					 <td ><form action="<%=request.getContextPath() %>/deletes"method="POST">
					 <button type="submit" class="btn btn-outline-success" name="deletes"
					 value="<%=sListbean.getShokuzaiID()%>">�폜</button></form></td>
					 </tr>
<%
}
%>

			</table>
		</div>
		</div>

</body>
</html>