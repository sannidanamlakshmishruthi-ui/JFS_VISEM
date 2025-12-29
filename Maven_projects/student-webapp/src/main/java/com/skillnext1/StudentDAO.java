package com.skillnext1;

import com.skillnext1.Student;

public class StudentDAO {

    // Dummy save method (no database)
    public boolean saveStudent(Student student) {
        // You can later add JDBC code here
        System.out.println("Student Saved:");
        System.out.println(student.getId());
        System.out.println(student.getName());
        //System.out.println(student.getEmail());
        return true;
    }
}
