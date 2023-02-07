<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <div class="background">
            <div class="shape"></div>
            <div class="shape"></div>
        </div>
        <form action="week06">
            <h3>Login Here</h3>
            <label for="name">NAME</label>     
            <input type="text" placeholder="Fullname" name="name">
            <!-- <label for="email">EMAIL</label>
            <input type="text" placeholder="Email" id="email">-->
            <label for="password">PASSWORD</label>
            <input type="password" placeholder="*********" name="password">
           <!--  <label for="dob">DATE OF BIRTH</label>
            <input type="text" placeholder="dd/mm/yyyy" id="dob">-->
    
            <input type="submit" value="login">
            
        </form>
</body>
</html>