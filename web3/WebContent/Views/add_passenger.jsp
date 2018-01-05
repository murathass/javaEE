<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="title"> Add a passenger </div>
		<fieldset>
		<legend>Passenger Details</legend>
			<form action="AddPassenger" method="post">
				<div class="inputField">
					<label for="first-name" class="inputlabel">First name:</label>
					<input name="firstname" type="text"/>
				</div>
				<div class="inputField">
					<label for="lastname" class="inputlabel">Last name:</label>
					<input name="lastname" type="text"/>
				</div>
				
				<div class="inputField">
					<label for="dob" class="inputlabel">Birth day:</label>
					<input name="dob" type="text"/>
				</div>
				
				<div class="inputField">
					<label for="gender" class="inputlabel">Gender:</label>
					<select name="gender">
						<option value="male">Male</option>
						<option value="female">Female</option>
					</select>
				</div>
				
				<div class="inputField">
					<input class="btn-primary" id="submitbtn" type="submit" value="Add New Passenger">
				</div>
				
			</form>
		</fieldset>
	
	</div>
</body>
</html>