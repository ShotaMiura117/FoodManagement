<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<style>
h1 {
	/*���̎�ށi�����j ���� �F*/
	border-bottom: solid 3px black;
}
</style>


<title>�폜�����e�X�g�y�[�W</title>
</head>
<body>
	<h1>�H�ރf�[�^�̍폜���������܂����B</h1>

	<form action="<%=request.getContextPath()%>/ManagementList"
		method="POST" name="list">
		<input type="hidden" name="param" value="�e�X�g">
	</form>

	<a href="<%=request.getContextPath()%>/ManagementList"
		onclick="document.list.submit();return false;">�H�i���X�g�y�[�W��</a>



</body>
</html>