package com.campus.app;

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //input from user
        System.out.println("Enter student id");
        int id = scanner.nextInt();
        System.out.println("Enter student name");
        String studentname = scanner.next();
        System.out.println("enter the student age");
        int age = scanner.nextInt();
        System.out.println("enter the student department");
        String department = scanner.next();
        System.out.println("number of subjects");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        System.out.println("enter the marks of "+ n + " subjects");
        for(int i=0;i<n;i++){
            System.out.println("enter the marks of subject "+(i+1));
            marks[i] = scanner.nextInt();
            scanner.nextLine();
        }
        Student student = new Student(id,studentname,age,department,marks);
        student.displayStudentInfo(true);
        Student.displayStudentsCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        scanner.close();

    
}
}