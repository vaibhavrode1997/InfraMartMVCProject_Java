<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" 
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" 
	crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>
<body>

	<h1>Product List</h1>
	
<div class="mt-5">	
	<hr style="height:1px">

	<table class="table table-striped">

		<thead>
			<tr>

				<th scope="col">Product Name</th>
				<th scope="col">Quantity</th>
				<th scope="col">Price</th>
				<th scope="col">Category</th>
				<th scope="col">Description</th>
				<!-- <th scope="col">Action</th> -->
			</tr>
		</thead>
		<tbody>
		<c:forEach var="prod" items="${plist}">
			<tr>
				<!-- <th scope="row">1</th> -->
				<td>${prod.name}</td>
				<td>${prod.qty}</td>
				<td>${prod.price}</td>
				<td>${prod.category}</td>
				<td>${prod.description}</td>
				<%-- <td><a href="/product/edit/${prod.id}" ><i>Order</i></a> --%>				
			</tr>
			</c:forEach>
		</tbody>

	</table>
</div>
	
</body>
</html>