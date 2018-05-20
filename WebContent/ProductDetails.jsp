<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Marcado.!!!</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="helper.css">
	<link rel="stylesheet" type="text/css" href="accordion.css">
</head>

<body>
	<div id="titleborder">
		<h1 style="display:inline">MARCADO - </h1><h4 style="display:inline">An Online Buying and Selling Platform.!</h4>
		
		<form style="display:inline;" action="">
			<input style="float:right;" type="submit" value="logout">
			<label style="float:right;">USER</label>
			</form>
	</div>

	<div id="indexcontentborder">
		<form action="Adpage.html">
			<input style="float:right;text-align:center;" class="accordion" type="submit" value="Post an Ad" name="postanad" id="postanad"/>
		</form>

		<br><br><br>
		
		<div class="panel">
		</div>
		
		<script src="accordion.js">
		</script>	

		<h2 style="display:inline;">Product Title</h2><h2 style="display:inline;">     Price</h2>
		<br>

		<img src="no_image.png" style="width: 150px;height: 150px;background: #00f" /><br>

		<h3 id="desc">Description</h3>

		<br><br>

		<h2>Contact Details</h2>

		<h3 id="name">Name:</h3>
		<h3 id="mobile`">Mobile:</h3>
		<h3 id="email">Email:</h3>
		<h3 id="instruct">Instruction:</h3>


	
	</div>
</body>
</html>