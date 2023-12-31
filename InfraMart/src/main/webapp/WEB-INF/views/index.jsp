<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	
	<div class="container " >
	<div class="row">
	<div class="mx-auto col-10 col-md-8 col-lg-6">
	<h2>Login Page</h2>
		<form  action="/login/authentication" method="post">
	
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input type="email" class="form-control w-50" id="exampleInputEmail1" name="email">
		   
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Password</label>
		    <input type="password" class="form-control w-50" id="exampleInputPassword1" name="password">
		  </div>
		 
  <button type="submit" class="btn btn-primary">Login</button>
  <a href="/registration/register"  class="btn btn-primary" >Register</a>
 
</form>
 
	</div>
	</div>
	</div>
	
</body>
</html>