<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="java.util.Date, java.text.DateFormat"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>食材編集ページ</title>


<script>
//未入力チェックを行う関数


function checkForm() {
  // セレクトボックスの要素を取得
  var unit = document.getElementById("unit");
  var save = document.getElementById("save");
  var genre = document.getElementById("genre");
  // テキストボックスの要素を取得
  var materials = document.getElementById("materials")
  var volume = document.getElementById("volume")
  var quantity = document.getElementById("quantity")
  var fi_date = document.getElementById("fi_date");
  var ex_date = document.getElementById("ex_date");

  // 選択されているオプションのインデックスを取得
  var selectedUnitIndex = unit.selectedIndex;
  var selectedSaveIndex = save.selectedIndex;
  var selectedGenreIndex = genre.selectedIndex;

  var radioButtons = document.getElementsByName("open_check");
  var isChecked = false;

  // 選択されているオプションが初期値（未選択）の場合、警告を表示し送信をキャンセル
  if (materials.value === "") {
    alert("食材名を入力してください");
    return false;
  }
  if (volume.value === "") {
    alert("数量を入力してください");
    return false;
  }
  if (quantity.value === "") {
    alert("個数を入力してください");
    return false;
  }
  if (selectedUnitIndex === 0) {
    alert("単位を選択してください");
    return false;
  }
   if (selectedSaveIndex === 0) {
	    alert("保存方法を選択してください");
	    return false;
	  }
  if (selectedGenreIndex === 0) {
	    alert("ジャンルを選択してください");
	    return false;
	  }
  if ( fi_date.value === "") {
	    alert("記入日を入力してください");
	    return false;
	  }
  if ( ex_date.value === "") {
	    alert("賞味期限. 消費期限を入力してください");
	    return false;
	  }
  // 開封チェック
   for (var i = 0; i < radioButtons.length; i++) {
      if (radioButtons[i].checked) {
        isChecked = true;
        break;
      }
    }

    if (!isChecked) {
      alert("開封状況を選択してください");
      return false;
    }

  return true;
}


</script>


<link rel="stylesheet" href="css/shokuzaiEdit.css" type="text/css">
</head>
<body>
	<div class="container">
		<div class="table">
			<div class="tablehead">
				<form action="<%=request.getContextPath()%>/shokuzaie" method="POST" id="editForm"
				onsubmit="return checkForm();">
					<table>
						<caption>編集ページ</caption>
						<tr>
							<th>商品名</th>
							<td><input type="text"
								value="<%=session.getAttribute("item_name")%>" name="item_name"></td>
						</tr>
						<tr>
							<th>お気に入り</th>
							<td><input type="radio" name="favorite" value="1">Yes
								<input type="radio" name="favorite" value="0">No
								<input type="hidden" name="favorite" value="0"></td>

						</tr>
						<tr>
							<th>食材名</th>
							<td><input type="text" name="materials_name" id="materials"
								value="<%=session.getAttribute("materials_name")%>"></td>
						</tr>
						<tr>
							<th>数量</th>
							<td><input type="number" step="0.1" name="volume" id="volume" max="5000000"
								value="<%=session.getAttribute("volume")%>" min="0.1">
								<select name="unit_id" id="unit">
									<option value="" selected disabled>選択必須</option>
									<option value="1">g</option>
									<option value="2">ml</option>
									<option value="3">個</option>
							</select>
							×
							<input type="number" step="0.1" name="quantity" id="quantity" max="5000000"
								min="0.1" value="<%=session.getAttribute("quantity")%>">

							</td>
						</tr>
						<tr>
							<th>保存方法</th>
							<td><select name="save_method" id="save">
									<option value="" selected disabled>選択必須</option>
									<option value="1">冷蔵庫</option>
									<option value="2">冷凍庫</option>
									<option value="3">野菜室</option>
									<option value="4">常温保存</option>
							</select></td>
						</tr>
						<tr>
							<th>開封状態</th>
							<td>
								<input type="radio" name="open_check" id="open" value="1"> 開封済み
								<input type="radio" name="open_check" id="open" value="0"> 未開封
<!--  								<input type='hidden' value="0" name="open_check"></td>
 -->						</tr>
						<tr>
							<th>ジャンル</th>
							<td><select name="genre_id" id="genre">
									<option value="" selected disabled>選択必須</option>
									<option value="1">肉類</option>
									<option value="2">野菜</option>
									<option value="3">果物</option>
									<option value="4">魚介類</option>
									<option value="5">乾物・海藻類</option>
									<option value="6">卵類</option>
									<option value="7">パン類</option>
									<option value="8">ごはん類</option>
									<option value="9">乳製品類</option>
									<option value="10">豆・豆腐類</option>
									<option value="11">麺類</option>
									<option value="12">ルー・素</option>
									<option value="13">和風調味料</option>
									<option value="14">洋風調味料</option>
									<option value="15">中華調味料</option>
									<option value="16">その他</option>
							</select></td>
						</tr>
						<tr>
							<th>記入日</th>
							<td><input type="date" name="filling_date" id="fi_date"
								value="<%=session.getAttribute("filling_date")%>" >
							</td>
						</tr>

						<tr>
							<th>賞味期限．消費期限</th>
							<td><input type="date" class="date" name="expiration_date" id="ex_date"
								value="<%=session.getAttribute("expiration_date")%>">
							</td>
						</tr>
					</table>
					<br>
					<div class="button">
						<button type="button" class="b"
							onclick="location.href='<%=request.getContextPath()%>/shokuzai'"
							>
							キャンセル</button>
						<br> <br>
						<button type="submit" class="btn"
							onclick="location.href='<%=request.getContextPath()%>/shokuzaie">
							保存</button>

					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>