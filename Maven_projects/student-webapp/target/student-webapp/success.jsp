<%@ page import="com.student.model.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
</head>
<body>

<%
    Student s = (Student) request.getAttribute("student");
%>

<h2>Student Saved Successfully!</h2>
<p>ID: <%= s.getId() %></p>
<p>Name: <%= s.getName() %></p>

<a href="index.jsp">Add Another Student</a>

</body>
</html>
