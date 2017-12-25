<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
 <title>Java后端WebSocket的Tomcat实现</title>

　　　　　　<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />
　　　　　　<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
  
  <script type="text/javascript">
     var websocket = null;
     //判断当前浏览器是否支持WebSocket
     if ('WebSocket' in window) {
         websocket = new WebSocket("ws://localhost:8080/websocket");
     }
     else {
         alert('当前浏览器 Not support websocket')
    }

     //连接发生错误的回调方法
     websocket.onerror = function () {
         setMessageInnerHTML("WebSocket连接发生错误");
     };

     //连接成功建立的回调方法
     websocket.onopen = function () {
         setMessageInnerHTML("WebSocket连接成功");
     }

     //接收到消息的回调方法
     websocket.onmessage = function (event) {
         setMessageInnerHTML(event.data);
    }

     //连接关闭的回调方法
     websocket.onclose = function () {
         setMessageInnerHTML("WebSocket连接关闭");
     }

     //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
     window.onbeforeunload = function () {
         closeWebSocket();
     }

     //将消息显示在网页上
     function setMessageInnerHTML(innerHTML) {
         document.getElementById('message').innerHTML += innerHTML + '<br/>';
     }

     //关闭WebSocket连接
     function closeWebSocket() {
         websocket.close();
     }

     //发送消息
     function send() {
         var message = document.getElementById('text').value;
         websocket.send(message);
     }
 </script>
<body>
 Welcome<br/><input id="text" type="text"/>
      <button onclick="send()">发送消息</button>
     <hr/>
     <button onclick="closeWebSocket()">关闭WebSocket连接</button>
     <hr/>
     <div id="message"></div>
     
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
