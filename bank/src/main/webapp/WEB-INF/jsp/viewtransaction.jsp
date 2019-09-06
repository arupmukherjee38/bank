<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="/bank/listtrans"> 
 Accont Number :<input name="acctNum" type="text" />
 <input type="submit" value="search" name="search"/>
 </form>
</body>
</html>