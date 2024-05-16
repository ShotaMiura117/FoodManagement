<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>料理詳細ページ</title>
    <link rel="stylesheet" href="ryoriZairyoKinyu.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://kit.fontawesome.com/8ff098a16e.js" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <h1 class="top_title">料理の材料記入ページ</h1>
        <div class="right_container">
            <div class="btn">
            <button type="button" name="cancel">キャンセル</button>
            <button type="submit" name="hozon">料理の材料保存</button>  
            </div>
            <div class="name">
                料理名:<input type="text" name="name">
                分:<input type="time" name="time">
            </div>   
            
            <div class="but">
                <button type="button">タグの追加</button>
            </div>
            <div class="list">
                   食材:
                   <input type="text"  name="zairyo">
                   数量:
                    <input type="number" name="suryo" max="500000000" min="1">
                    単位:
                    <input type="number" name="tani" max="5000000" min="1" style="font-size: smaller;">

                    <div class="listing">
                    <ol>
                    <li>ひき肉:100g</li>
                    <li>玉ねぎ:1/2個</li>
                    <li>ピーマン:適量</li>
                    <li>人参:適量</li>
                    </ol>
                    </div>
                    
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