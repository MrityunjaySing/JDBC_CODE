<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			<form action="addProduct" method="post"  enctype="multipart/form-data">
					<label>ProductName:</label><br>
					<input type="text" placeholder="productname" name="productName"><br>
					<label>ProductPrice:</label><br>
					<input type="number" placeholder="productprice" name="productPrice"><br>
					<label>ProductType:</label><br>
					<select name="productType">
							<option value="mens">mens</option>
							<option value="womens">womens</option>
							<option value="kids">kids</option>
					</select><br>
					<label>ProductWearType:</label><br>
					<select name="ProductWearType">
							<option value="pant">pant</option>
							<option value="shirt">shirt</option>
							<option value="jeans">jeans</option>
					</select><br>
					<label>User Photo:</label>
					<input type="file" name="photo" size="50"/>
					<input type="submit" value="addproduct">
				</form>
		</div>
	</div>
</body>
</html>