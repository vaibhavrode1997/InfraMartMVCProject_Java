<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<div class="container m-4" >
	<div class="row">
	<div class="mx-auto col-10 col-md-8 col-lg-6">
	<div class="m-2"> <h2>User Details</h2></div>
	
		<form action="/registration/save" method="post">
	<div class="row">
		  <div class="mb-3 col-sm p-1">
		    <label for="firstname" class="form-label">First Name</label>
		    <input type="text" class="form-control "name="fname" id="firstname" aria-describedby="emailHelp">
		   
		  </div>
		  <div class="mb-3 col-sm p-1">
		    <label for="lastname" class="form-label">Last Name</label>
		    <input type="text" class="form-control " name="lname" id="lastname">
		  </div>
	</div>	
	<div class="row">    
	     <div class="mb-3 col-sm p-1">
		    <label for="email" class="form-label">Email</label>
		    <input type="email" class="form-control" name="email" id="email">
		  </div>
		   <div class="mb-3 col-sm p-1">
		    <label for="password" class="form-label">Password</label>
		    <input type="text" class="form-control" name="password" id="password">
		  </div>
		  
	</div>	
	<div class="row">  
		  <div class="mb-3 col-sm p-1">
		    <label for="phoneno" class="form-label">Phone No</label>
		    <input type="text" class="form-control"  name="phoneno" id="phoneno">
		  </div>
		  <div class="mb-3 col-sm p-1">
		    <label for="role" class="form-label">Role</label>
		    <input type="text" class="form-control" name="role" id="role">
		  </div>
	</div>	
	<div class="row">  
	 <div class="mb-3 col-sm p-1">
		    <label for="Address" class="form-label">Address</label>
		    <input type="text" class="form-control" name="address" id="Address">
		  </div>       
	</div>  
		  	 
  <button type="submit" class="btn btn-primary">Submit</button>
  
</form>
	</div>
	</div>
	</div>


</body>
</html>