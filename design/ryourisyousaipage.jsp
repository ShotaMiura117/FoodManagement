<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=windows-31j">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>料理詳細ページ</title>
    <link rel="stylesheet" href="ryourisyousaipage.css">
    <script src="https://kit.fontawesome.com/8ff098a16e.js" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <h1 class="top_title">料理詳細ページ</h1>
        <div class="btn">
            <button>キャンセル</button>
            <button>
                <a href="#">料理の材料を保存</a>
            </button>
        </div>
        <div class="right_container">
            <div class="name">
                料理名:
            </div>
            <div class="time">分
            </div>
            <div class="list">
               <table>
                   <tr>
                       <th>必要な材料</th>
                       <th>足りない材料</th>
                   </tr>
                   <tr>
                       <td>
                           <ol>
                                <li>ひき肉:100g</li>
                                <li>玉ねぎ:1/2個</li>
                                <li>ピーマン:適量</li>
                                <li>人参:適量</li>
                           </ol>
                       </td>
                       <td>
                           <ol>
                               <li>ひき肉 : 50g</li>
                               <li>玉ねぎ : 1/2個</li>
                           </ol>
                       </td>
                   </tr>



               </table>
        </div>
        </div>


        <div class="left-container">
        <div class="total">
       <div class="box">
           <img src="photos/momo.jpg" alt="Food_image" style="width:250px;height:250px">
       </div>
       <div class="medium_box">
           <button type="button" name="button">タグの追加</button><br><br>
           <button type="button">肉　<i class="fa-solid fa-xmark"></i></button>
           <button type="button">ハンバーグ　<i class="fa-solid fa-xmark"></i></button>
       </div>
       <div class="small_box"><br>
           <div class="link">
               <button>
                   <a href="#">外部サイトリンク</a>
               </button>
           </div>
       </div>
       </div>



    </div>
    </div>

</body>
</html>