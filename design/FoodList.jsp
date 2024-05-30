
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" session="true"%>
<%@ page import="food_management.*"%>
<%@ page import="java.util.List" %>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="javax.servlet.http.HttpServletResponse"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>料理検索結果</title>
<style>table
{width:90%;
border-collapse:collapse;}
table,th,td{border:1px solid black;}
th \,td{padding:8px;
text-align:left;}
</style>
<body>
<form action="<%=request.getContextPath() %>/food_gokei" method="post">
<input type="submit"value="合計ページへ"/>
<table>
<thead>
<tr>
<th></th>
<th>料理名</th>
</tr>
</thead>
<tbody>
<%
List<SelectShokuzaiBean> foodList =(List<SelectShokuzaiBean>)
request.getAttribute("foodList");if(foodList !=null){
for (SelectShokuzaiBean food : foodList){
%>
<tr>
<td><input type="checkbox"name="selectedFoods"
value="<%=food.getFoodID()%>"/>
</td>
<td><%=food.getFoodName() %></td>
</tr>
<%
}
}
%>
</tbody>
</table>
</form>

</body>
</html>
