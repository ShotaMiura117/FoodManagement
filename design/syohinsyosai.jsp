<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="content-type" content="text/html; charset=windows-31j">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>商品詳細ページ</title>
    <link rel="stylesheet" href="syouhinsyousai.css">
</head>
<body>
    <div class="container">
        <div class="table">
            <div class="tablehead">
                <table>
                    <caption>食品詳細</caption>
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
                        <td>2</td>
                    </tr>
                    <tr>
                        <th>保存方法</th>
                        <td>
                            冷凍
                            </td>
                    </tr>
                    <tr>
                        <th>開封状態</th>
                        <td>
                            <select name="hozon" id="save">
                                <option value="未開封">未開封</option>
                                <option value="開封">開封</option>
                              </select>
                        </td>
                    </tr>
                    <tr>
                        <th>ジャンル</th>
                        <td>ラメン</td>
                    </tr>
                    <tr>
                        <th>記入日時</th>
                        <td>
                            <input type="date" class="date" name="date">
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
                <button type="button" class="b">編集</button><br><br>
                <button type="button" class="btn">削除</button>
                </div>
            </div>
        </div>
    </div>

</body>
</html>