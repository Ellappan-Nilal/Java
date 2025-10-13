import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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

        
        String studentName = request.getParameter("Sname");
        String studentEmail = request.getParameter("Semail");
        String studentMobile = request.getParameter("Smobile");
        
        PrintWriter out=response.getWriter();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/learn", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student_servelt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Student_servelt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       out.println("Student Info:");
       out.println("Name: " + studentName);
       out.println("Email: " + studentEmail);
       out.println("Mobile: " + studentMobile);
        
        
       
    }
}
