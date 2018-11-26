<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Heroes</title>

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" rel="stylesheet" integrity="sha384-Qt9Hug5NfnQDGMoaQYXN1+PiQvda7poO7/5k4qAmMN6evu0oDFMJTyjqaoTGHdqf" crossorigin="anonymous">
<link rel="stylesheet" href="main.css">

</head>
<body>

<div class="container">
<h4><a href="completelist">View Complete List</a></h4>



<table>
<thead>
<tr>

<td style="padding-right: 25px">Name</td>
<td style="padding-right: 25px">Invented</td>
<td style="padding-right: 25px">Year</td>

</thead>

<c:forEach var="c" items="${tinylist2}">
</div>
<tbody>

<tr>
<td style="padding-right: 25px"> ${c.name }</td>
<td style="padding-right: 25px"> ${c.invented }</td>
<td style="padding-right: 25px"> ${c.year }</td>

</tr>
</c:forEach>
</tbody>





</table>
</body>
</html>