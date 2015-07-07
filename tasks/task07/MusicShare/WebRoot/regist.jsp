<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/index.css">
<style>
/*foot*/
.w1000{ width:1000px; margin:0 auto; position:relative;}
#footer .copyright{ font-size:12px; width:100%; border-top:1px solid #cecece; margin-top:10px; text-align:center; padding:20px 0; color:#6a6a6a;}
#footer .copyright p{ padding:5px 0;}
#footer .copyright a{ color:#269;}
</style>
<meta charset="utf-8">
<title>注册</title>
</head>

<body background="image/background.jpg">
<div class="subNav"><p class="w1000">我的位置：<a href="首页.html">首页</a> > 注册</p></div>
<br>
      <p class="h10"></p>
      <div class="w1000">
            <p class="modelTop"><em></em><em class="rig"></em></p>
            <div class="chartFrm">
                  <p class="jbLeft"></p>
                  <p class="jbRight"></p>
				 <div class="zhuce_list">
	
					<form name="signForm" id="signForm" method="post" action="/mlog/Sign?newReg=1&jump=mlog">
					<div class="zhuce_top">
						<div class="z_top">
							<span>注册帐号：</span><input type="text" name="username"  id="username"  onblur="checkuserName()"/>
							<font color="red">*</font>
							<p>由字母、数字、汉字组成，不能包含空格，长度2-20位</p>
						</div>
						<div class="z_top">
							<span>设置密码：</span><input type="password" id="l_password" name="password" onkeyup="changeRobust();" onblur="checkPwd()"/><var class="l_right undis" id="rightpwd" >
							<font color="red">*</font>
							<p>由字母、数字、符号组成，长度为6-16位</p>
						</div>
						<div class="z_top">
							<span>重复密码：</span><input type="password" id="l_password1" name="password1"  onblur="checkPwd_1()" /><var class="l_right undis" id="rightpwd_1" >
							<font color="red">*</font>
							<br><br>
						</div>
						
						
						<div class="z_top">
							<span>邮箱：</span><input type="text" id="email" name="email"  onblur="checkPwd_1()" />
							<font color="red">*</font>
							<br><br>
						</div>
						
						<div class="z_top">
							<span>电话：</span><input type="text" id="phone" name="phone"  onblur="checkPwd_1()" />
							<font color="red">*</font>
							<br /><br />
						</div>
						
						<div class="z_top">
							<span>性别：</span><input type="text" id="sex" name="sex"  onblur="checkPwd_1()" />
							<font color="red">*</font>
							<br><br>
						</div>
						
						<div>
							<span></span><input type="checkbox" checked="checked" id="agree" name="agree" style=""  /><label for="agree">我已经阅读并接受<a href="userProtocol.html" target="_blank">西电音乐吧用户协议</a></label><br><br>
						</div>
						<div>
							<span></span><a href="#@" onclick="submitSignForm()" class="zhuce_btn"></a>
                            <input type="submit" style="width:90px;height:30px;" value="注册" name="zhuce" class="login"> 
						</div>
 
					</form>
				 </div>
            </div>
      </div>
      <p class="h30"></p>

</body>
</html>
