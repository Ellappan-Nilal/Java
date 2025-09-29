<%-- 
    Document   : Student_Form
    Created on : 26 Sept 2025, 11:11:51 am
    Author     : Nilal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Student_servelt">
            <table cellspacing="20">
                <tr>
                    <td>Name </td>
                    <td><input type="text" placeholder="Enter your name"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="email" placeholder="Enter your email"></td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><input type="number" placeholder="Enter your mobile No"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button>Submit</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
