package com.mycompany.jsp_project.resources;

import java.io.IOException;
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

        // Get form parameters
        String studentName = request.getParameter("Sname");
        String studentEmail = request.getParameter("Semail");
        String studentMobile = request.getParameter("Smobile");

        // Print to console (or write to DB / response)
        System.out.println("Student Info:");
        System.out.println("Name: " + studentName);
        System.out.println("Email: " + studentEmail);
        System.out.println("Mobile: " + studentMobile);

        // Optional: send a response back to the browser
        response.setContentType("text/html");
        response.getWriter().println("<h3>Student details submitted successfully!</h3>");
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println("<h3>Use the form to submit student details.</h3>");
    }
}
