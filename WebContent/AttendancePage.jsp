<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Key-In Attendance</title>
</head>
<body>
<div id = "attendance">
<div class="name">

<form  action="add" >
<label for="name">Name:</label><br>
  <input type="text" id="name" name="name"><br>
</div>
<div class="course">
<label for="course">Course:</label><br>
<input type="text" id="course" name="course"><br>
</div>
<div class="section">
<tr>
			        <td>Section:</td>
			        <td>
					  	<select name="section" id="section">
					    <option value="1">1</option>
					    <option value="2">2</option>
					    <option value="3">3</option>
					    <option value="4">4</option>
					    <option value="5">5</option>
					    </select>
					</td>
					</tr>
</div>
<input type="submit" name="button1" value="Submit">

</div>

</form>



</body>
</html>