<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="content-type" content="text/html; charset=windows-31j">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>アカウント作成ページ</title>



    <link rel="stylesheet" href="login.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/8ff098a16e.js" crossorigin="anonymous"></script>
    <script src="login.js"></script>
    <style>

        @media (min-width: 600px) {
          .bd-placeholder-img-lg {
            font-size: 3.5rem;
            width: 100%;
          }
        }
      </style>
</head>

<body class="text-center">

    <main class="form-signin">
		<form action="<%=request.getContextPath()%>/createa" method="POST">

			<h1 class="h3 mb-3 fw-normal">新規アカウント登録</h1>
			<div class="form-floating">
				<input type="email" name="user_id" class="form-control"
					id="floatingInput" placeholder="nana40@gmail.com" Required> <label
					for="floatingInput"><i class="fa-solid fa-envelope"></i></label>
			</div>
			<br>
			4文字以上の半角英数字を入力してください。

			<div class="form-floating">
				<input type="password" name="password" class="form-control"
					id="floatingPassword" placeholder="Password"
					pattern="^[a-zA-Z0-9]+$" maxlength="20" minlength="4" Required> <label
					for="floatingPassword"><i class="fa-solid fa-key"></i></label> <input
					type="checkbox" onclick="myFunction()">パスワードを表示する
			</div>
			<br>

			<button class="w-100 btn btn-lg btn-primary" type="submit"
			onclick="location.href='<%=request.getContextPath()%>/createa"
			>登録</button>
			</br></br>
			<a href = login.jsp>戻る</a>


			<br>
			<br>

		</form></main>
</body>
</html>