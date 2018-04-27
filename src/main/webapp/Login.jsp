<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<meta name="keywords"
	content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="CSS/style.css" rel='stylesheet' type='text/css' />
<!--webfonts-->
<link
	href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet'
	type='text/css'>
<!--//webfonts-->
<script
	src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<body>
	<script>$(document).ready(function(c) {
	$('.close').on('click', function(c){
		$('.login-form').fadeOut('slow', function(c){
	  		$('.login-form').remove();
		});
	});	  
});
</script>
	<!--SIGN UP-->
	<h1>Fox拍卖网</h1>
	<div class="login-form">
		<div class="close"></div>
		<div class="head-info">
			<label class="lbl-1"> </label> <label class="lbl-2"> </label> <label
				class="lbl-3"> </label>
		</div>
		<div class="clear"></div>
		<div class="avtar">
			<img src="img/avtar.png" />
		</div>
		<form name="Login" method="post" action="Login.action" id="Login">
		<input type="hidden" name="step" value="1"/>
			<input type="text" class="text" name="Username" value="Username"
				onFocus="this.value = '';"
				onBlur="if (this.value == '') {this.value = 'Username';}">
			<div class="key">
				<input type="password" name="Password" value="Password" onFocus="this.value = '';"
					onBlur="if (this.value == '') {this.value = 'Password';}">
			</div>
		<div class="signin">
			<input type="submit" name="Login" value="Login">
		</div>
			</form>
	</div>
	<div class="copy-rights">
		<p>
			Copyright &copy; 2018.Company name All rights reserved.More Templates
			<a target="_blank" title="拍卖网">拍卖网</a> - Collect from <a title="拍卖网"
				target="_blank">Fox</a>
		</p>
	</div>

</body>
</html>
