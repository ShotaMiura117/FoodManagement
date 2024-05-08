<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="content-type" content="text/html; charset=windows-31j">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>商品記入ページ</title>
    <link rel="stylesheet" href="syohinkinyupage.css">
</head>
<body>
    <div class="container">
        <div class="table">
            <div class="tablehead">
                <table>
                    <caption>食品記入</caption>
                    <tr>
                        <th>商品名</th>
                        <td>ラメン</td>
                    </tr>
                    <tr>
                        <th>食材名</th>
                        <td>ラメン</td>
                    </tr>
                    <tr>
                        <th>数量</th>
                        <td><input type="number" name="number" max="50" min="1"></td>
                    </tr>
                    <tr>
                        <th>保存方法</th>
                        <td>
                            <select name="hozon" id="save">
                                <option value="冷凍">冷凍</option>
                                <option value="冷凍不要">冷凍不要</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>開封状態</th>
                        <td>
                            <input type="checkbox" name="open" checked>開封済み<input type="checkbox" name="notOpen">未開封

                        </td>
                    </tr>
                    <tr>
                        <th>ジャンル</th>
                        <td>
                            <select name="journal">
                                <option value="ラメン">ラメン</option>
                                <option value="餃子">餃子</option>
                                <option value=""></option>
                                <option value=""></option>
                                <option value=""></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>記入日時</th>
                        <td>
                            <input type="text" name="saveDate">
                        </td>
                    </tr>
                    <tr>
                        <th>賞味期限．消費期限</th>
                        <td>
                            <input type="date" class="date" name="date1">
                        </td>
                    </tr>
                </table>
                <br>
                <div class="button">
                <button type="button" class="b">キャンセル</button><br><br>
                <button type="button" class="btn">保存</button>
                </div>
            </div>
        </div>
    </div>

</body>
</html>