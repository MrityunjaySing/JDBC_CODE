<%@page import="com.jsp.jcart_web_app.dto.Product"%>
<%@page import="com.jsp.jcart_web_app.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			ProductDao dao = new ProductDao();
		%>
		
		<table border="2px">
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>ProductType</th>
			<th>ProductWearType</th>
			<th>ProductPrice</th>
			<th>status</th>
			<th>VerifyNow</th>
		</tr>
		
		<%for(Product product:dao.getAllProductData()){ %>
		
	
		<tr>
			<td><%=product.getProductId()%></td>
			<td><%=product.getProductName()%></td>
			<td><%=product.getProductType()%></td>
			<td><%=product.getProductWearType()%></td>
			<td><%=product.getProductPrice()%></td>
			<td><%=product.getProductVerify()%></td>
			<td><a href=""><button>verifynow</button></a></td>
		</tr>
	<%}%>
	</table>	
</body>
</html>