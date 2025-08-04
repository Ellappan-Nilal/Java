<%-- 
    Document   : Studentlist
    Created on : 3 Aug 2025, 6:26:16 pm
    Author     : Nilal
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student List</h1>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                </tr>
            </thead>
            <tbody border="1" cellpadding="10">
                <%
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava", "root", "");
                    String query = "SELECT * FROM studentdetails";
                    Statement sm = con.createStatement();
                    ResultSet rs = sm.executeQuery(query);
                    //PrintWriter out=response.getWriter();
                    while (rs.next()) {
                        String id = rs.getString("id");
                        String name = rs.getString("name");
                        String email = rs.getString("email");
                        String phone = rs.getString("phone");
                        
                %>              
                <tr>
                    <td><%=id%></td>
                    <td><%=name%></td>
                    <td><%=email%></td>
                    <td><%=phone%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

    </body>
</html>
