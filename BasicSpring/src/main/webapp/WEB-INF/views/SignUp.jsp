<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
	<title>Sign Up</title>
</head>
<body>
<h1>
	Sign Up
</h1>

<div>
  <form name="" action="submit" method="POST">
	
	First Name: <input type="text" name="userFirstName">
	Last Name: <input type="text" name="userLastName"> 
	User Name: <input type="text" name="userName">;
	Password: <input type="password" name="userPassword">
	Birthday: <input type="text" name="userBirthday">
	
	Mobile phone: <input type="text" name="userMobilePhone">
	Current email address: <input type="text" name="userCurrentEmailAddress">
	<!-- 
	User Id: <input type="text" name="id"> 
	--> 
  <input type="submit" value="Submit">
</form> 
<p>${user.userid}</p>
</div>
</body>
</html>
