<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html lang="en"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>个人主页</title>
    <!-- CSS -->
    <link href="bootstrap.css" rel="stylesheet">
    <link href="blog.css" rel="stylesheet">
  </head>
  <body>
    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item active" href="index.html">首页</a>
          <a class="blog-nav-item" href="#part1">生活</a>
          <a class="blog-nav-item" href="#part2">旅行</a>
          <a class="blog-nav-item" href="#part3">音乐</a>
        </nav>
      </div>
    </div>
	<div class="intr">
    	<span class="avtar"></span>
        <p class="peointr">我叫曹红阳，一个软件工程专业大三的学生。</p>
        <p class="peointr">爱生活，爱旅行，爱音乐。</p>
    </div>
    <div class="title" id="part1">爱生活</div>
    <div class="content">
    	<div class="pic pic1">
    		<img src="h1.jpg" alt="">
    		<p>家乡-笔锋塔下</p>
    	</div>
    	<div class="pic pic2">
    		<img src="h2.jpg" alt="">
    		<p>家乡-襄河河畔</p>
    	</div>
    	<div class="pic pic3">
    		<img src="h3.jpg" alt="">
    		<p>家乡-太平桥岸</p>
    	</div>
    </div>
    <div class="title" id="part2">爱旅行</div>
    <div class="content">
    	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
              <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class=""></li>
                <li class="" data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li class="active" data-target="#carousel-example-generic" data-slide-to="2"></li>
              </ol>
              <div class="carousel-inner" role="listbox">
                <div class="item">
                  <img src="s1.jpg" alt="...">
                </div>
                <div class="item">
                  <img src="s2.jpg" alt="...">
                </div>
				<div class="item active">
                  <img src="s3.jpg" alt="...">
                </div>
              </div>
              <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
              </a>
              <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
                <span class="sr-only">Next</span>
              </a>
            </div>
    </div>
	<div class="title" id="part3">爱音乐</div>
    <div class="content">
        <ul class="nav nav-tabs" role="tablist">
          <li class="active"><a href="#home" role="tab" data-toggle="tab">我的收藏</a></li>
          <li class=""><a href="#profile" role="tab" data-toggle="tab">音乐上传</a></li>
          <li class=""><a href="#messages" role="tab" data-toggle="tab">音乐点评</a></li>
        </ul>
        <div class="tab-content">
          <div class="tab-pane active" id="home">
          	
          </div>
          <div class="tab-pane" id="profile">
          	
          </div>
          <div class="tab-pane" id="messages">
          	
          </div>
        </div>
    </div>
    <div class="blog-footer">
      <p>by <a href="" target="_blank">小草</a>.</p>
    </div>
    <a style="display: none;" href="" class="btt">顶部</a>
    <!-- Js-->
    <script src="jquery-1.js"></script>
    <script src="bootstrap.js"></script>
    <script src="plugin.js"></script>
</body></html>