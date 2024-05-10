<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>必要食品の合計イメージ</title>
<link rel="stylesheet" href="syouhingoukei.css">

</head>
<body>
	<h1 class="top_title">必要商品合計ページ</h1>
	<div class="container">
		<table style="width: 60%;">
			<tr>
				<th class="green" style="width: 50%;">必要な材料</th>
				<th class="gre" style="width: 50%;">不足分</th>
			</tr>
			<tr>
				<td>
					<ol>
						<select class="person" name="person">
							<option value="一人">一人目分の材料</option>
							<option value="一人">二人目分の材料</option>
							<option value="一人">三人目分の材料</option>
							<option value="一人">四人目分材料</option>
						</select>
						<li>鶏肉 :100g</li>
					</ol>
				</td>
				<td>
					<ol>
						<li>ニラ : 100g</li>
					</ol>
				</td>
			</tr>
		</table>
		<!--</div>-->
		<div class="box">
			<div class="image">
				<img src="photos/momo.jpg" style="width: 200px; height: 200px">
			</div>
			<div class="text">
				<ol>
					<li>鶏肉 : 100g</li>
					<li>ニラ : 100g</li>
					<li>もやし : 100g</li>
				</ol>
			</div>
			<div class="btn">
				<button type="button" name="sakujyo">作る料理から削除</button>
			</div>
			<div class="link">
				<a href="#">外部のレシピサイトのURL</a>
			</div>


		</div>

	</div>


</body>
</html>