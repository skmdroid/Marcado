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

		<div id="productslist" style="width:100%;">
			<div id="productsitem" style="width:100%;">
				<input type="image" src="images.png" id="prdimage" style="width:80px;height:80px;float:left;">
				<h2 id="prdtitle" style="text-decoration:underline;display:inline;margin-top:5px;padding:5px;">Product Title</h2><h2 id="prdprice" style="display:inline;float:right;padding-right:5px;">Price</h2>
				<h3 id="prddesc" style="margin-left:10px;padding:5px;">Product Description</h3>
			</div>
		</div>
	
	</div>
</body>
</html>