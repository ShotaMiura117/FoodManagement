<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="content-type" content="text/html; charset=windows-31j">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>���i�L���y�[�W</title>
    <link rel="stylesheet" href="syohinkinyupage.css">
</head>
<body>
    <div class="container">
        <div class="table">
            <div class="tablehead">
                <table>
                    <caption>�H�i�L��</caption>
                    <tr>
                        <th>���i��</th>
                        <td>������</td>
                    </tr>
                    <tr>
                        <th>�H�ޖ�</th>
                        <td>������</td>
                    </tr>
                    <tr>
                        <th>����</th>
                        <td><input type="number" name="number" max="50" min="1"></td>
                    </tr>
                    <tr>
                        <th>�ۑ����@</th>
                        <td>
                            <select name="hozon" id="save">
                                <option value="�Ⓚ">�Ⓚ</option>
                                <option value="�Ⓚ�s�v">�Ⓚ�s�v</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>�J�����</th>
                        <td>
                            <input type="checkbox" name="open" checked>�J���ς�<input type="checkbox" name="notOpen">���J��

                        </td>
                    </tr>
                    <tr>
                        <th>�W������</th>
                        <td>
                            <select name="journal">
                                <option value="������">������</option>
                                <option value="�L�q">�L�q</option>
                                <option value=""></option>
                                <option value=""></option>
                                <option value=""></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>�L������</th>
                        <td>
                            <input type="text" name="saveDate">
                        </td>
                    </tr>
                    <tr>
                        <th>�ܖ������D�������</th>
                        <td>
                            <input type="date" class="date" name="date1">
                        </td>
                    </tr>
                </table>
                <br>
                <div class="button">
                <button type="button" class="b">�L�����Z��</button><br><br>
                <button type="button" class="btn">�ۑ�</button>
                </div>
            </div>
        </div>
    </div>

</body>
</html>