/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String std_name = request.getParameter("sname");
        String std_mail = request.getParameter("smail");
        String str_mob = request.getParameter("smob");
        PrintWriter out = response.getWriter();
        //Java Database connection 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava", "root", "");
            String sql = "INSERT INTO studentdetails(name,email,phone) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, std_name);
            ps.setString(2, std_mail);
            ps.setString(3, str_mob);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
               // out.print("Successfully Inserted");
               response.sendRedirect("Studentform.jsp");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
