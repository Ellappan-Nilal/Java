
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Student_servelt", urlPatterns = {"/Student_servelt"})
public class Student_servelt extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String studentName = request.getParameter("Sname");
        String studentEmail = request.getParameter("Semail");
        String studentMobile = request.getParameter("Smobile");

        try (PrintWriter out = response.getWriter()) {

            try {
                // Load MySQL driver and connect
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3307/learn", "root", "");

                // SQL query
                String sql = "INSERT INTO details(name, email, mobile) VALUES (?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, studentName);
                ps.setString(2, studentEmail);
                ps.setString(3, studentMobile);

                // Execute update
                int rowsAffected = ps.executeUpdate();

                // ✅ Show message based on insertion result
                if (rowsAffected > 0) {
                    out.println("<h3 style='color:green;'>Successfully Inserted!</h3>");
                } else {
                    out.println("<h3 style='color:red;'>Insertion Failed!</h3>");
                }

                // Display details
                out.println("<h4>Student Details:</h4>");
                out.println("Name: " + studentName + "<br>");
                out.println("Email: " + studentEmail + "<br>");
                out.println("Mobile: " + studentMobile + "<br>");

                // Close resources
                ps.close();
                con.close();

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Student_servelt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h3>Student Servlet is working!</h3>");
    }
}
