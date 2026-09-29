package com.campus.services;

import java.util.List;
import java.util.ArrayList;

public class StudentService{
    private static final List<String> students = new ArrayList<>();

    //get students
    public StudentService() {
        students.add(e:e:"John Doe");
        students.add(e:e:"Jane Smith");
        students.add(e:e:"Alice Johnson");
    }

    public List<String> getStudents() {
        return students;
        students = new ArrayList<>();
    }

    //add student
    public void addStudent(String name, String course){
        students.add(String.valueof(students.size() + 1) + ": " + name + " - " + course);
    }
}