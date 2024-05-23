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
            <form action="<%= request.getContextPath() %>/touroku" method="POST">
                <table>
                    <caption>食品記入</caption>
                    <tr>
                        <th>商品名</th>
                         <td><input type="text" name="syouhinName" ></td>
                    </tr>
                    <tr>
                        <th>気になる</th>
                        <td>
                            <input type="radio" name="shokuzai_favorite" value="1" >Yes <input type="radio" name="shokuzai_favorite" value="0">No
                            <input type="hidden" name="shokuzai_favorite" value="0">

                        </td>
                    </tr>
                    <tr>
                        <th>食材名</th>
                        <td><input type="text" name="syokuzaiName" ></td>
                    </tr>
                    <tr>
                        <th>数量</th>
                        <td><input type="number" name="quantity" max="5000000" min="1">
                         <select name="volume">
                                <option value="1">g</option>
                                <option value="2">ml</option>
                                <option value="3">個</option>
                                </select>
                        </td>
                     <tr>
                        <th>×</th>
                        <td><input type="number" name="unit_id" max="5000000" min="1"></td>
                    </tr>
                    <tr>
                        <th>保存方法</th>
                        <td>
                            <select name="save_method" id="save">
                              <option value="1">冷蔵庫</option>
                              <option value="2">冷凍庫</option>
                              <option value="3">野菜室</option>
                              <option value="4">常温保存</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>開封状態</th>
                        <td>
                            <input type="radio" name="open_check" value="1" checked>開封済み<input type="radio" name="open_check" value="0">未開封

                        </td>
                    </tr>
                    <tr>
                        <th>ジャンル</th>
                        <td>
                            <select name="genre_id">
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
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>記入日</th>
                        <td>
                            <input type="text" name="filling_date" required>
                        </td>
                    </tr>
                    <tr>
                        <th>賞味期限．消費期限</th>
                        <td>
                            <input type="date" class="date" name="expiration_date" required>
                        </td>
                    </tr>
                </table>
                <br>
                <div class="button">
                <a href="ManagementListpage.jsp">
                <button type="button" class="b">キャンセル</button><br><br></a>
                <button type="submit"  class="btn">保存</button>
                </div>
                </form>
            </div>
        </div>
    </div>

</body>
</html>