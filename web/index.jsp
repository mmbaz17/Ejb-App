<%-- 
    Document   : index
    Created on : Jan 30, 2018, 6:14:57 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addServlet" method="post">
        Enter number1<input type="text" name="num1"><br><br>
         Enter number2<input type="text" name="num2"><br><br>
          <input type="submit" value="Calculate">
          <input type="reset" value="Clear">
          </form>
    </body>
</html>
