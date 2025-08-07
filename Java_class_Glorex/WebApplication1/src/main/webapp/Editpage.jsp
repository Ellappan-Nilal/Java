<%-- 
    Document   : Editpage
    Created on : 7 Aug 2025, 1:33:04 pm
    Author     : Nilal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Student</title>
    </head>
    <body>
        <h1>Edit Student Data</h1>
        <form action="StudentServlet" method="get">
            <table cellspacing="20">
                <tr>
                    <td>Name</td>
                    <td><input name="sname" type="text"></td>
                </tr>
                 <tr>
                    <td>Email</td>
                    <td><input name="smail" type="email"></td>
                </tr>
                 <tr>
                    <td>Mobile</td>
                    <td><input name="smob" type="number"></td>
                </tr>
                 <tr>
                    <td></td>
                    <td><button>Submit</button></td>
                </tr>
            </table> 
        </form>
    </body>
</html>
