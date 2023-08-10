<%@ page import="java.sql.Connection" %>
<%@ page import="Models.Util.ConnectionPool" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <table border="2px black">
            <tr>
            <th >Numero de programa</th>
            <th >Nombre</th>
            <th >Estado</th>
            </tr>
            <c:forEach items="${programas}" var="Program" >
            <tr>
                <td>${Program.getIdentification_program()}</td>
                <td>${Program.Name}</td>
                <td>${Program.Estado}</td>
            </tr>
            </c:forEach>
        </table >



</body>
</html>
