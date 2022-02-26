<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
 
</head>
<body  >


   <center> <!-- <center><h1>Admin Login</h1></center><form action="AdminControllerServlet" method="POST">  
        <div class="container">   
        <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;" > 
        	<input type="hidden" name="command" value="LOGIN" />
            
            <br/>
         <tr><td><br/>&nbsp;&nbsp;  Username :  <input type="text" placeholder="Enter Username" name="username" required>  
            <br/>
              
            <br/>
           Password :  <input type="password" placeholder="Enter Password" name="password" required>  
            <br/><br>
            <button type="submit">Login</button>   
            <br/>
            <input type="checkbox" checked="checked"> Remember me   
             
        </div>   
    </form>  -->
    
     <h1 style="Color:blue">Learner's Academy</h1>
 
<h2 style="text-align:center; Color:green"> Welcome To Admin's Login Page!</h2>
<br/>
<br/>
    
   <div class="container">  
    <input type="hidden" name="command" value="LOGIN" />
    <form action="AdminControllerServlet" method="post">
<table border="1" style="text-align:center; margin-left:auto;margin-right:auto;" > 
<tr><td><br/>&nbsp;&nbsp;Username: <input type="text" name="username" placeholder="Enter username" required>&nbsp;&nbsp;<br/><br/>
&nbsp;&nbsp;Password: <input type="password" name="password" placeholder="Enter password" required>&nbsp;&nbsp;<br/><br/><input type="checkbox" checked="checked"> Remember me </td></tr>
<tr><td><input type="submit" value="login"></td></tr> 
</table>  </form></div>   
    
</center>

</body>
</html>