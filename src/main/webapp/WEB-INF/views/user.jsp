<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>User Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a User
</h1>

<c:url var="addAction" value="/user/addUser" ></c:url>

<form:form action="${addAction}" commandName="user">
<table>
	<c:if test="${!empty user.userCode}">
	<tr>
		<td>
			<form:label path="userId">
				<spring:message text="User ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="userId" readonly="true" size="8"  disabled="true" />
			<form:hidden path="userId" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="userCode">
				<spring:message text="User Code"/>
			</form:label>
		</td>
		<td>
			<form:input path="userCode" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="userName">
				<spring:message text="User Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="userName" />
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty user.userCode}">
				<input type="submit"
					value="<spring:message text="Edit User"/>" />
			</c:if>
			<c:if test="${empty user.userCode}">
				<input type="submit"
					value="<spring:message text="Add User"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Users List</h3>
<c:if test="${!empty listUsers}">
	<table class="tg">
	<tr>
		<th width="80">User ID</th>
		<th width="120">User Code</th>
		<th width="120">User Name</th>
		<th width="120">User Status</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listUsers}" var="user">
		<tr>
			<td>${user.userId}</td>
			<td>${user.userCode}</td>
			<td>${user.userName}</td>
			<td>${user.userStatus}</td>
			<td><a href="<c:url value='/editUser/${user.userId}' />" >Edit</a></td>
			<td><a href="<c:url value='/removeUser/${user.userId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>