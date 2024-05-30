<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="java.util.Date, java.text.DateFormat"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>�H�ޕҏW�y�[�W</title>


<script>
//�����̓`�F�b�N���s���֐�


function checkForm() {
  // �Z���N�g�{�b�N�X�̗v�f���擾
  var unit = document.getElementById("unit");
  var save = document.getElementById("save");
  var genre = document.getElementById("genre");
  // �e�L�X�g�{�b�N�X�̗v�f���擾
  var materials = document.getElementById("materials")
  var volume = document.getElementById("volume")
  var quantity = document.getElementById("quantity")
  var fi_date = document.getElementById("fi_date");
  var ex_date = document.getElementById("ex_date");

  // �I������Ă���I�v�V�����̃C���f�b�N�X���擾
  var selectedUnitIndex = unit.selectedIndex;
  var selectedSaveIndex = save.selectedIndex;
  var selectedGenreIndex = genre.selectedIndex;

  var radioButtons = document.getElementsByName("open_check");
  var isChecked = false;

  // �I������Ă���I�v�V�����������l�i���I���j�̏ꍇ�A�x����\�������M���L�����Z��
  if (materials.value === "") {
    alert("�H�ޖ�����͂��Ă�������");
    return false;
  }
  if (volume.value === "") {
    alert("���ʂ���͂��Ă�������");
    return false;
  }
  if (quantity.value === "") {
    alert("������͂��Ă�������");
    return false;
  }
  if (selectedUnitIndex === 0) {
    alert("�P�ʂ�I�����Ă�������");
    return false;
  }
   if (selectedSaveIndex === 0) {
	    alert("�ۑ����@��I�����Ă�������");
	    return false;
	  }
  if (selectedGenreIndex === 0) {
	    alert("�W��������I�����Ă�������");
	    return false;
	  }
  if ( fi_date.value === "") {
	    alert("�L��������͂��Ă�������");
	    return false;
	  }
  if ( ex_date.value === "") {
	    alert("�ܖ�����. �����������͂��Ă�������");
	    return false;
	  }
  // �J���`�F�b�N
   for (var i = 0; i < radioButtons.length; i++) {
      if (radioButtons[i].checked) {
        isChecked = true;
        break;
      }
    }

    if (!isChecked) {
      alert("�J���󋵂�I�����Ă�������");
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
						<caption>�ҏW�y�[�W</caption>
						<tr>
							<th>���i��</th>
							<td><input type="text"
								value="<%=session.getAttribute("item_name")%>" name="item_name"></td>
						</tr>
						<tr>
							<th>���C�ɓ���</th>
							<td><input type="radio" name="favorite" value="1">Yes
								<input type="radio" name="favorite" value="0">No
								<input type="hidden" name="favorite" value="0"></td>

						</tr>
						<tr>
							<th>�H�ޖ�</th>
							<td><input type="text" name="materials_name" id="materials"
								value="<%=session.getAttribute("materials_name")%>"></td>
						</tr>
						<tr>
							<th>����</th>
							<td><input type="number" step="0.1" name="volume" id="volume" max="5000000"
								value="<%=session.getAttribute("volume")%>" min="0.1">
								<select name="unit_id" id="unit">
									<option value="" selected disabled>�I��K�{</option>
									<option value="1">g</option>
									<option value="2">ml</option>
									<option value="3">��</option>
							</select>
							�~
							<input type="number" step="0.1" name="quantity" id="quantity" max="5000000"
								min="0.1" value="<%=session.getAttribute("quantity")%>">

							</td>
						</tr>
						<tr>
							<th>�ۑ����@</th>
							<td><select name="save_method" id="save">
									<option value="" selected disabled>�I��K�{</option>
									<option value="1">�①��</option>
									<option value="2">�Ⓚ��</option>
									<option value="3">��؎�</option>
									<option value="4">�퉷�ۑ�</option>
							</select></td>
						</tr>
						<tr>
							<th>�J�����</th>
							<td>
								<input type="radio" name="open_check" id="open" value="1"> �J���ς�
								<input type="radio" name="open_check" id="open" value="0"> ���J��
<!--  								<input type='hidden' value="0" name="open_check"></td>
 -->						</tr>
						<tr>
							<th>�W������</th>
							<td><select name="genre_id" id="genre">
									<option value="" selected disabled>�I��K�{</option>
									<option value="1">����</option>
									<option value="2">���</option>
									<option value="3">�ʕ�</option>
									<option value="4">�����</option>
									<option value="5">�����E�C����</option>
									<option value="6">����</option>
									<option value="7">�p����</option>
									<option value="8">���͂��</option>
									<option value="9">�����i��</option>
									<option value="10">���E������</option>
									<option value="11">�˗�</option>
									<option value="12">���[�E�f</option>
									<option value="13">�a��������</option>
									<option value="14">�m��������</option>
									<option value="15">���ؒ�����</option>
									<option value="16">���̑�</option>
							</select></td>
						</tr>
						<tr>
							<th>�L����</th>
							<td><input type="date" name="filling_date" id="fi_date"
								value="<%=session.getAttribute("filling_date")%>" >
							</td>
						</tr>

						<tr>
							<th>�ܖ������D�������</th>
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
							�L�����Z��</button>
						<br> <br>
						<button type="submit" class="btn"
							onclick="location.href='<%=request.getContextPath()%>/shokuzaie">
							�ۑ�</button>

					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>