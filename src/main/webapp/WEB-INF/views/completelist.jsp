<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hall of Fame</title>

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" rel="stylesheet" integrity="sha384-Qt9Hug5NfnQDGMoaQYXN1+PiQvda7poO7/5k4qAmMN6evu0oDFMJTyjqaoTGHdqf" crossorigin="anonymous">
<link rel="stylesheet" href="main.css">

</head>
<body>

<div class="container">
<h4><a href="/">View Tiny List</a></h4>



<table>
<thead>
<tr>
<td style="padding-right: 25px">First Name</td>
<td style="padding-right: 25px">Last Name</td>
<td style="padding-right: 25px">Innovation</td>
<td>Year</td>

</thead>

<c:forEach var="c" items="${completelist}">
</div>
<tbody>

<tr>
<td style="padding-right: 25px"> ${c.firstName }</td>
<td style="padding-right: 25px"> ${c.lastName }</td>
<td style="padding-right: 25px"> ${c.innovation }</td>
<td style="padding-right: 15px"> ${c.year }</td>

</tr>
</c:forEach>
</tbody>





</table>
</body>
</html>