<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>�����ڍ׃y�[�W</title>
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
		<h1 class="top_title">�����̍ޗ��L���y�[�W</h1>
		<form action="<%= request.getContextPath()%>/ryori" method="POST">
			<div class="right_container">

				<div class="name">
					������:<input type="text" name="name"> ��:<input type="time"
						name="time">
				</div>
				<div class="but">
					<button id="rowAdder" type="button">�^�O�̒ǉ�</button>
				</div>
				<div class="list">
					�H��: <input type="text" name="zairyo"> ����: <input
						type="number" name="suryo" max="500000000" min="1"> �P��: <input
						type="number" name="tani" max="5000000" min="1"
						style="font-size: smaller;">

					<div id="newinput"></div>

					<div class="listing">
						<ol>
							<li>�Ђ���:100g</li>
							<li>�ʂ˂�:1/2��</li>
							<li>�s�[�}��:�K��</li>
							<li>�l�Q:�K��</li>
						</ol>
					</div>
					<div class="btn">
					<button type="button" name="cancel">�L�����Z��</button>
					<button type="submit" name="hozon">�����̍ޗ��ۑ�</button>
				</div>
				</div>

	</div>
	</form>
	<div class="left-container">
		<div class="total">
			<div class="box">
				<img src="photos/momo.jpg" alt="Food_image"
					style="width: 250px; height: 250px">
			</div>
			<div class="medium_box">
				<button type="button" name="button">�^�O�̒ǉ�</button>
				<br> <br>
				<button type="button">
					�� <i class="fa-solid fa-xmark"></i>
				</button>
				<button type="button">
					�n���o�[�O <i class="fa-solid fa-xmark"></i>
				</button>
			</div>
			<div class="small_box">
				<br>
				<div class="link">
					<button>
						<a href="#">�O���T�C�g�����N</a>
					</button>
				</div>

			</div>
		</div>

	</div>
	</div>

	<script type="text/javascript">
		$("#rowAdder")
				.click(
						function() {
							newRowAdd = '<div class="list">'
									+ '�H��: <input type="text name="zairyo"> '
									+ '����: <input type="number" name="suryo" max="500000000" min="1"> '
									+ '�P��: <input type="number" name="tani" max="500000000" min="1" style="font-size:smaller;"> ';
							$("#newinput").append(newRowAdd);
						});
	</script>
</body>
</html>