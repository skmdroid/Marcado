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
	<div id="titleborder">
		<h1 style="display:inline">MARCADO - </h1><h4 style="display:inline">An Online Buying and Selling Platform.!</h4>
		
		<form style="display:inline;" action="">
			<input style="float:right;" type="submit" value="logout">
			<label style="float:right;">USER </label>
			</form>
	</div>

	<div id="indexcontentborder">
	
		
		<form action="PostAd.jsp" method="get">
			<input class="accordion" type="submit" value="Post an Ad" name="postad" id="postanad"/>
		</form>

		
	<script src="accordion.js">
	</script>	
	<br>
	<hr>	
		<h3	style="display:inline">Categories: <h4 style="display:inline">Select what you want to buy.?</h4></h3>
	<table>
	<form action="Products.jsp">
	
	<tr>
	<td>
	
	<input class="categories" value="Stationery" name="Stationery" type="submit">
	
	</td>
	<td>
	<input class="categories" value="Lab Equipments" name="Lab Equipments" type="submit">
	</td>
	<td>
	<input class="categories" value="Electronics" name="Electronics" type="submit">	
	</td>
	</tr><tr/><tr/><tr/>
	
	<tr>
	<td>
	<input class="categories" value="Mobiles" name="Mobiles" type="submit">
	</td>
	<td>
	<input class="categories" value="Sports/Hobbies" name="Sports/Hobbies" type="submit">
	</td>
	<td>
	<input class="categories" value="Cycles/Bikes" name="Cycles/Bikes" type="submit">	
	</td>
	
	<% 
	String uname=request.getParameter("categories"); 
	session.setAttribute("category",uname); 
	%> 
	</tr>
	</form>
	</table>
	</div>
</body>
</html>