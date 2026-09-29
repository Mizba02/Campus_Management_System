package com.campus.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.campus.services.StudentService;
@WebServlet("/Student")

public class StudentServlet extends HttpServlet{
    private final StudentService studentService = new StudentService();
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Student List</title></head>");
        out.println("<body>");
        out.println("<h1> All Students List</h1>");
        out.println("<ul>");
        for (String student : studentService.getStudents()) {
            out.println("<li>" + student + "</li>");
        }
        out.println("</ul>");
        out.print("<a href=\"addStudent.html\">Add Student</a>");
        out.println("</body>");
        out.println("</html>");
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        studentService.addStudent(name, course);
        response.sendRedirect("/Students");
    }

}