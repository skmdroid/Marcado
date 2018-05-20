<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Marcado!!!</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="helper.css">
	<link rel="stylesheet" type="text/css" href="accordion.css">
</head>

<body>

	<script type="text/javascript">
		
		function validateLogin()
		{
			var username = document.getElementById('UID').value;
			var password = document.getElementById('Password').value;
			
			if(username == null || username.equals("") || password == null || username.equals(""))
			{
				alert("Please provide all the Inputs..!");
				return false;
			}
		}
	
	</script>

	<div id="titleborder">
		<h1 style="display:inline">MARCADO - </h1><h4 style="display:inline">An Online Buying and Selling Platform.!</h4>
	</div>
	<div id="indexcontentborder">
		<h3>Already an User.?</h3>			
		<button class="accordion">Sign In</button>
		<div class="panel">
			<form action="./login" method="post" onsubmit="return validateLogin()">
				<br/>
				<table>
					<tr>
						<td><b>University ID</b></td><td><input type="text" name="UID" maxlength="9" minlength="9" id="UID"/></td>
					</tr>
					<tr>
						<td><b>Password</b></td><td><input type="Password" name="Password" id="Password"/></td>
				</table>
				<input type="submit" value="Sign In" name="loginsubmit"><br>
			</form>
		</div>
		<br>
		<hr>
		<h3>New User.?</h3>
		
		<form action="SignUp.jsp" method="get">
			<input class="accordion" type="submit" value="Sign Up" name="signupsubmit" id="signupsubmit"/>
		</form>
		
		<div class="panel">
		</div>
		
	<script src="accordion.js">
	</script>	
	</div>

</body>
</html>