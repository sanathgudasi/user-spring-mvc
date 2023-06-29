<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Fill in the Form</h1>
    <form action="reg" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" required/><br><br>
        
        <label for="age">Age:</label>
        <input type="number" name="age" id="age" required/><br><br>
        
        <label for="phno">Phone Number:</label>
        <input type="tel" name="phone" id="phone" required/><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>