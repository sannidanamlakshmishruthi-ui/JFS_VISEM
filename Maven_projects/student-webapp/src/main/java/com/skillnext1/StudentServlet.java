package com.skillnext1;

import com.skillnext1.StudentDAO;
import com.skillnext1.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");

        Student student = new Student(id, name);
        StudentDAO dao = new StudentDAO();
        dao.saveStudent(student);

        request.setAttribute("student", student);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
