<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
<!-- <script  src="js/jquery-3.2.1.js"></script> -->
<script type="text/javascript">
$(document).ready(function(){
	  $("button").click(function(){
		  alert(1);
		   var  s = $("#username").val();
		   alert(s);
	  });
	});

  </script>
<body>
<h2>Hello World!我们都是好孩子</h2>
<form name="from1" action="user/showuser" method="post">
<table width="300" border="1">

<tr>
    <td colspan="2"> 登录窗口</td>
</tr>
<tr>
    <td > 用户名</td>
    <td > <input type="text" name="username" id="username" size="10" value="xxx"></td>
    <spqn id = "user_error"></span>
</tr>

<tr>
    <td > 密码</td>
    <td > <input type="password" name="password" size="10"></td>
</tr>

<tr>
     <td colspan ="2"> <input type="submit" name="submit" value="登录">  <button id = "btn1" onclick = "testUser()">yanz</button>
     <a href="user/register">注册新用户</a></td>
</tr>

 </table>

</form>


<form name="from2" action="user/register" method="post">
<table width="300" border="1">

<tr>
    <td colspan="2"> 登录窗口</td>
</tr>
<tr>
    <td > 用户名</td>
    <td > <input type="text" name="username" size="10"></td>
</tr>

<tr>
    <td > 密码</td>
    <td > <input type="password" name="password" size="10"></td>
</tr>

<tr>
     <td colspan ="2"> <input type="submit" name="submit" value="注册">
</tr>

 </table>

</form>
<a href="springmvc/helloworld">test @springmvc/helloworld</a>
<br/>
<br/>
<a href="user/testModelAndView">testModelAndView</a>
<br/>
<br/>
<a href="user/testMap">testMap</a>
<br/>
<br/>
<a href="user/testRedirect">testRedirect</a>
<br/>
<br/>
<a href="user/testforward">testforward</a>
</body>
</html>
