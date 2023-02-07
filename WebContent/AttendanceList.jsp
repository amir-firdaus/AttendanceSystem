<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.List,org.hibernate.Session, org.hibernate.cfg.Configuration,
 org.springframework.stereotype.Controller, org.springframework.ui.Model,
 org.springframework.web.bind.annotation.RequestMapping, org.springframework.web.bind.annotation.ResponseBody,
 com.mysql.cj.xdevapi.SessionFactory, dbutil.HibernateSF, model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attendance List</title>
<style>
table, th, td {
  border: 1px solid;
}
</style>
</head>
<body>
<% 
Session sesi = HibernateSF.getSession().openSession();
Student[] s=new Student[10];
int id=0;
for(int i=0;i<10;i++){
    id++;
	s[i]=sesi.get(Student.class,id);
	
		
}
%>
<h1> Attendance for : <%= s[0].getCourse() %> Section: <%= s[0].getSection()%> </h1>
<table>
<tr>
<td>Name </td>
</tr>
<tr>
<td><%= s[0].getName() %></td>
</tr>
<tr>
<td><%= s[1].getName() %></td>
</tr>
<tr>
<td><%= s[2].getName() %></td>
</tr>
<tr>
<td><%= s[3].getName() %></td>
</tr>
<tr>
<td><%= s[4].getName() %></td>
</tr>
</table>

</body>
</html>