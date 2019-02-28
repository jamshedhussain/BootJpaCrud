<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
		<form:form action="store" method="POST" methodAttribute="user">
			<table>
				<tr>
					<td>User Name :</td>
					<td><form:input path="uName"/></td>
				</tr>
				<tr>
					<td>User Address :</td>
					<td><form:input path="uAdd"/></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"/></td>
					<td><input type="submit" value="Submit"/></td>
				</tr>
			</table>
		</form:form>
	<a href="viewUser">Show All User</a>
</body>
</html>