<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<title>Sign up</title>
	<link rel="stylesheet" type="text/css" href="helper.css">
	<link rel="stylesheet" type="text/css" href="SignUpHelper.css">
</head>

<body>

	<script type="text/javascript">
		
		function validateSignUp()
		{
			var username = document.getElementById('username').value;
			var password = document.getElementById('password').value;
			var confirmpassword = document.getElementById('confirmpassword').value;
			var firstname = document.getElementById('firstname').value;
			var lastname = document.getElementById('lastname').value;
			var mobile = document.getElementById('mobile').value;
			var emailid = document.getElementById('emailid').value;
			//var gendermale = document.getElementById('gendermale').value;
			//var genderfemale = document.getElementById('genderfemale').value;
			var institution = document.getElementById('institution').value;
			var course = document.getElementById('course').value;
			var startyear = document.getElementById('startyear').value;
			var endyear = document.getElementById('endyear').value;
			var address = document.getElementById('address').value;
			
			if(username.equals("") || password.equals("") || confirmpassword.equals("") || firstname.equals("") || lastname.equals("")
					 || mobile.equals("") || emailid.equals("") || institution.equals("") || course.equals("")
					 || startyear.equals("") || endyear.equals("") || address.equals(""))
			{
				alert("Please provide all the Inputs..!");
				return false;
			}
		}
	
	</script>

	<form action="./signUp" method="post" onsubmit="return validateSignUp()">
	<div id="titleborder">
		<h1 style="display:inline">MARCADO - </h1><h4 style="display:inline">An Online Buying and Selling Platform.!</h4>
	</div>

	<div id="signupcontentborder">
		<h2 style="display:inline">Sign up - </h2><h4 style="display:inline">Please Fill in the Below Details.</h4>
		<hr>
		
		<table>
		
		<tr>
		<td><label><h4 style="display:inline">University ID </h4></label></td>
		<td><input type="text" name="username" maxlength="9" title="This will be your User name for Login" id="username"></td>
		</tr><tr/>
		
		<tr>
		<td><label><h4 style="display:inline">Password </label></td>
		<td><input type="password" name="password" id="password"></td>
		</tr>
		
		<tr>
		<td><label><h4 style="display:inline">Confirm </label></td>
		<td><input type="password" name="confirmpassword" id="confirmpassword"></td>
		</tr>
		
		<tr>
		<td><label><h4 style="display:inline">First Name </h4></label></td>
		<td><input type="text" name="firstname" maxlength="30" id="firstname"></td>
		</tr><tr/>
		
		<tr>
		<td><label><h4 style="display:inline">Last Name </h4></label></td>
		<td><input type="text" name="lastname" maxlength="30" id="lastname"></td>
		</tr><tr/>
		
		<tr>
		<td><label><h4 style="display:inline">Mobile </h4></label></td>
		<td><input type="text" name="mobile" maxlength="10" id="mobile"></td>
		</tr><tr/>
		
		
		<tr>
		<td><label><h4 style="display:inline">Email </h4></label></td>
		<td><input type="text" name="emailid" maxlength="30" id="emailid"></td>
		</tr><tr/>

		
		<tr>
		<td><label><h4 style="display:inline">Gender : </h4></label></td>
		<td><h5 style="display:inline">Male </h5><input type="radio" name="gender" value="gendermale">
		<h5 style="display:inline">Female </h5><input type="radio" name="gender" value="genderfemale"></td>
		</tr><tr/>
		
		
		<tr>
		<td><label><h4 style="display:inline">Institution </h4></label></td>
		<td><select id="institution" name="institution" id="institution">
			<option selected disabled>Select The Institution</option>
			<option value="sois">School of Information Sciences</option>
		</select></td>
		</tr><tr/>
		
		
		<tr>
		<td><h4><label style="display:inline">Course </label></h4></td>
		<td><select id="course" name="course" id="course">
			<option selected disabled>Select The Course</option>
			<option value="bda">Big Data and Data Analytics</option>
			<option value="vir">Computing Techonologies and Virtualization</option>
			<option value="es">Embedded Systems</option>
			<option value="ewt">Embedded Wireless Technology</option>
			<option value="ms">Medical Software</option>
			<option value="vlsi">VLSI</option>
		</select></td>
		</tr><tr/>

		<tr>
		<td><h4><label>Course Year </label></h4></td>
		<td>
		<select id="startyear" name="startyear" title="Start Year" id="startyear">
			<option selected disabled>Select</option>
			<option value="1999">1999</option><option value="2000">2000</option>
			<option value="2001">2001</option><option value="2002">2002</option>
			<option value="2003">2003</option><option value="2004">2004</option>
			<option value="2005">2005</option><option value="2006">2006</option>
			<option value="2007">2007</option><option value="2008">2008</option>
			<option value="2009">2009</option><option value="2010">2010</option>
			<option value="2011">2011</option><option value="2012">2012</option>
			<option value="2013">2013</option><option value="2014">2014</option>
			<option value="2015">2015</option><option value="2016">2016</option>
		</select>
		<select id="endyear" name="endyear" title="Last Year" id="endyear">
			<option selected disabled>Select</option>
			<option value="2001">2001</option><option value="2002">2002</option>
			<option value="2003">2003</option><option value="2004">2004</option>
			<option value="2005">2005</option><option value="2006">2006</option>
			<option value="2007">2007</option><option value="2008">2008</option>
			<option value="2009">2009</option><option value="2010">2010</option>
			<option value="2011">2011</option><option value="2012">2012</option>
			<option value="2013">2013</option><option value="2014">2014</option>
			<option value="2015">2015</option><option value="2016">2016</option>
			<option value="2015">2017</option><option value="2016">2018</option>
		</select></td>
		</tr><tr/>

		<tr>
		<td><label><h4 style="display:inline">Address </h4></label></td>
		<td><textarea name="address" cols="50" rows="3" maxlength="100" placeholder="Just 100 characters allowed" id="address"></textarea></td>
		</tr><tr/>
		
		<tr>
		<td>
		
			<input type="submit" name="submit" value="Sign Up">
		
		</td>
		</tr>
		
		</table>
		
	</div>
	
	</form>
</body>

</html>