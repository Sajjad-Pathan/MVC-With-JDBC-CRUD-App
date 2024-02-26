<%@page import="com.pojo.Car"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">
input {
	width: 150px;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: groove;
}
</style>
<title>
	<%
	request.getContextPath();
	%>
</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<h1>Car Management System</h1>
			</div>

		</nav>
	</header>
	<form action="<%=request.getContextPath()%>/saveCar" >
	<div align="center" >
		<label>Car Name</label><br> <input type="text" name="cname"
			placeholder="Enter Car name" id="cname" pattern="^[A-Z]{2}[ -]?[0-9]{2}[ -]?[A-Z]{1,2}[ -]?[0-9]{4}$"><br> <label>Car
			Number</label><br> <input type="text" name="cnum" placeholder="Enter Car Number"
			id="cnum"> <br><label>Car Owner Name</label> <br><input type="text"
			name="cowner" placeholder="Enter Car Owner Name" id="cowner"><br>

		<label>Submit</label> <input type="submit" value="submit"
		required="required">

	</div>
	</form>
</body>
</html>