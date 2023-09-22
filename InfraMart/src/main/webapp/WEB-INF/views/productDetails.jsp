<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<div class="container m-4" >
	<div class="row">
	<div class="mx-auto col-10 col-md-8 col-lg-6">
	<div class="m-2"> <h2>Product Details</h2></div>
	
		<form action="/product/addProduct" method="post">
	<div class="row">
		  <div class="mb-3 col-sm p-1">
		    <label for="name" class="form-label">Product Name</label>
		    <input type="text" class="form-control "name="name" id="name" aria-describedby="emailHelp">
		   
		  </div>
		  <div class="mb-3 col-sm p-1">
		    <label for="qty" class="form-label">Quantity</label>
		    <input type="text" class="form-control " name="qty" id="qty">
		  </div>
	</div>	
	<div class="row">    
	     <div class="mb-3 col-sm p-1">
		    <label for="price" class="form-label">Price</label>
		    <input type="text" class="form-control" name="price" id="price">
		  </div>
		   <div class="mb-3 col-sm p-1">
		    <label for="category" class="form-label">Category</label>
		    <input type="text" class="form-control" name="category" id="category">
		  </div>
		  
	</div>	
	<div class="row">  
		  <div class="mb-3 col-sm p-1">
		    <label for="description" class="form-label">Description</label>
		    <input type="text" class="form-control"  name="description" id="description">
		  </div> 
	</div>	
			  	 
  <button type="submit" class="btn btn-primary">Submit</button>
  
</form>
	</div>
	</div>
	</div>

</body>
</html>