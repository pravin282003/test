<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
           <table border="3">
           <tr>
            <td>ROLLNO</td>
             <td>NAME</td>
             <td>USERNAME</td>
              <td>PASSWORD</td>
               <td>ACTION</td>
           </tr>
           <c:forEach items="${data}" var="s">
           <tr>
           <td>${s.rollno}</td>
           <td>${s.name }</td>
           <td>${s.username}</td>
           <td>${s.password}</td>
           <td><a href="delete?rollno=${s.rollno}">DELETE</a>||<a href="edit?rollno=${s.rollno}">EDIT</a></td>
           </tr>
           </c:forEach>
           
           </table>

</body>
</html>