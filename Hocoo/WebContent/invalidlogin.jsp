<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700"
	rel="stylesheet">
<link rel="stylesheet" href="css/common-styles.css" />
</head>
<body>
	<div class="wrapper">
		<div class="bg"></div>
		<div class="login">
			<form action="/customercontroller" method="post">
				<input type="hidden" name="formid" value="login"/>
				<h3>LOGIN</h3>
				<p>Invalid Credentials</p>
				<input type="email" name="email" placeholder="Email Id"/> 
				<input type="password" name="password" placeholder="Password"/> 
				<input type="submit" value="Login"/>
			</form>
			<a href="signup.html">Don't have an account? Sign up</a>
		</div>
	</div>
</body>
</html>