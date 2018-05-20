<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Marcado - Post Ad</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="helper.css">
	<link rel="stylesheet" type="text/css" href="SignUpHelper.css">
</head>

<body>
	
	<div id="titleborder">
		<h1 style="display:inline">MARCADO - </h1><h4 style="display:inline">An Online Buying and Selling Platform.!</h4>
		
		<!--  <form style="display:inline;" action=""> --> 
			<input style="float:right;" type="submit" value="logout">
			<label style="float:right;"><%=session.getAttribute("uname") %></label>
		<!-- </form>  -->
	</div>
	
	<div id="signupcontentborder">
		<h2 style="display:inline">Submit an AD - </h2><h4 style="display:inline">Please Fill in the Below Details.</h4>
		
		<hr>
		<form action="./uploadServlet" method="post" enctype="multipart/form-data">
		<table>
		
		<tr>
		<td><label><h4 style="display:inline">Title </h4></label></td>
		<td><input type="text" name="producttitle" id="producttitle"></td>
		</tr><tr/>
		
		<tr>
		<td><label><h4 style="display:inline">Category</h4></label></td>
		<td><select id="category" name="prodcategory">
			<option selected disabled>Select The Category</option>
			<option value="stationery">Stationary</option>
			<option value="labequip">Lab Equipment</option>
			<option value="electronics">Electronics</option>
			<option value="mobiles">Mobiles</option>
			<option value="sphbs">Sports/Hobbies</option>
			<option value="cycbks">Cycles/Bikes</option>
		</select></td>
		</tr><tr/>

		<tr>
		<td><label><h4 style="display:inline">Description</h4></label></td>
		<td><textarea cols="50" rows="3" name="proddescription" maxlength="150" placeholder="Max 150 characters allowed" id="description"></textarea></td>
		</tr><tr/>

		<tr>
		<td><label><h4 style="display:inline">Price</h4></label></td>
		<td><input type="text" name="prodprice" maxlength="9" title="Enter The Price" id="price"></td>
		</tr><tr/>
		
		<tr>
		<td><label><h4 style="display:inline">Upload Photo</h4></label></td>
		<td><input type="file" name="photo" accept="image/jpg,image/png" id="photo"></td>
		</tr><tr/>

		<tr>
		<td><input type="submit" name="submit" value="Submit"></td>
		</tr>
		
		</table>
		</form>
		
	</div>

</body>
</html>