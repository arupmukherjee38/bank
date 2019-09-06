<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>LAST 2 TRANSACTION</h1>

<table border="2" width="70%" cellpadding="2" id="t">
		<tr>
			<th>TRANSACTION ID</th>
			<th>ACCOUNT NUMBER</th>
			<th>TRANSACTION TYPE</th>
			<th>TRANSACTION DATE</th>
			<th>summary</th>
			
		</tr>
		<c:forEach var="vo" items="${list}">
			<tr>
				<td>${vo.transId}</td>
				<td>${vo.accNum}</td>
				<td>${vo.transType}</td>
				<td>${vo.trasDate}</td>
				<td>${vo.summary}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>