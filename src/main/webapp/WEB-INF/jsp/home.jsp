<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
<h3>Add/Update User</h3>
<form action="addUser">
    Enter Your Id : <input type="text" name="id"><br>
    Enter Your Name : <input type="text" name="name"><br>
    <br>
    Add User : <input type ="submit">
</form>
<hr>
<h3>Get User based on Id</h3>
<form action="getUserById" method="get">
    Enter Your Id : <input type="text" name="id"><br>
    Get User : <input type ="submit">
</form>
<hr>
<h3>Get All Users</h3>
<form action="listUsers" method="get">
    Get Users : <input type="submit">
</form>
<hr>
<h3>Remove User</h3>
<form action="removeUser" method="get">
    Enter Your Id : <input type="text" name="id"><br>
    Remove User : <input type ="submit">
</form>
</body>
</html>