package com.campus.service;
import com.campus.model.Student;

public class StudentService{
    //calculate total marks
    public int calculateTotal(Student student){
        if(student.getMarks() == null){
            return 0;
        }
        int total=0;
        int[] marks = student.getMarks();
        for(int mark: marks){
            total+=mark;
        }
        return total;
    }
    //calculate average marks
    public double calculateAverage(Student student){
        int[] marks = student.getMarks();
        if(marks == null || marks.length == 0){
            return 0.0;
        }
        int total = calculateTotal(student);
        return (double)total/marks.length;
    }
    //find maximum mark
    public int findMaximum(Student student){
        int[] marks = student.getMarks();
        if(marks == null || marks.length == 0){
            return 0;
        }
        int max = marks[0];
        for(int mark: marks){
            if(mark > max){
                max = mark;
            }
        }
        return max;
    }
    //find minimum mark
    public int findMinimum(Student student){
        int[] marks = student.getMarks();
        if(marks == null || marks.length == 0){
            return 0;
        }
        int min = marks[0];
        for(int mark: marks){
            if(mark < min){
                min = mark;
            }
        }
        return min;
    }
    //grade based on marks
    public char grade(Student student){
        int[] marks = student.getMarks();
        if(marks == null || marks.length == 0){
            return 'F';
        }
        int total = calculateTotal(student);
        int average = (int)calculateAverage(student);
        if(average >= 90){
            return 'A';
        }else if(average >= 80){
            return 'B';
        }else if(average >= 70){
            return 'C';
        }else if(average >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }
    //pass or fail
    public String passorfail(Student student){
        int[] marks = student.getMarks();
        if(marks == null || marks.length == 0){
            return "fail";
        }
        int average = (int)calculateAverage(student);
        if(average >= 40){
            return "pass";
        }else{
            return "fail";
        }
    }
    //display report card
    public void displayReportCard(Student student){
        system.out.println("Student ID: " + student.getStudentid());
        system.out.println("Student Name: " + student.getStudentname());
        system.out.println("Department: " + student.getDepartment());
        system.out.println("Total Marks: " + calculateTotal(student));
        system.out.println("Average Marks: " + calculateAverage(student));
        system.out.println("Maximum Mark: " + findMaximum(student));
        system.out.println("Minimum Mark: " + findMinimum(student));
        system.out.println("Grade: " + grade(student));
        system.out.println("Result: " + passorfail(student));
        
    }    


}