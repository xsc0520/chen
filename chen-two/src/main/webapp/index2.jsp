<%@ page contentType="text/html; charset=UTF-8"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>HTML5手机端动感登录框代码 - 站长素材</title>

<link rel="stylesheet" type="text/css" href="css/default.css">

<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/styles.css">

</head>
<body>
<form name="from1" action="user/showuser.action" method="post">
<div class='login'>
  <div class='login_title'>
	<span>账号登录</span>
  </div>
  <div class='login_fields'>
	<div class='login_fields__user'>
	  <div class='icon'>
		<img src='img/user_icon_copy.png'>
	  </div>
	  <input placeholder='用户名' type='text' name="username">
		<div class='validation'>
		  <img src='img/tick.png'>
		</div>
	  </input>
	</div>
	<div class='login_fields__password'>
	  <div class='icon'>
		<img src='img/lock_icon_copy.png'>
	  </div>
	  <input placeholder='密码' type='password' name="password">
	  <div class='validation'>
		<img src='img/tick.png'>
	  </div>
	</div>
	<div class='login_fields__submit'>
	  <input type='submit' name="submit" value='登录'>
	</div>
  </div>
</form>
<script type="text/javascript" src='js/stopExecutionOnTimeout.js?t=1'></script>
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script>

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
<p>适用浏览器：360、FireFox、Chrome、Opera、傲游、搜狗、世界之窗. 不支持Safari、IE8及以下浏览器。</p>
<p>来源：<a href="http://sc.chinaz.com/" target="_blank">站长素材</a></p>
</div>
</body>
</html>
