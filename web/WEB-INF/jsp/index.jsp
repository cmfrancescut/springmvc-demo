<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo</title>
    </head>

    <body>
        <form action="${pageContext.request.contextPath}/login" method="POST">
            <div class="form-group form-group-sm">
                <label for="username">Username:</label><input type="text" name="username" id="username">
                <label for="password">Password:</label><input type="password" name="password" id="username">
                <br/>
                <input type="submit" name="submit" value="Log in">    
            </div>
        </form>
        ${error}
    </body>
</html>
