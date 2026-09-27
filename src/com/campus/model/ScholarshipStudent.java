package com.campus.model;

public class ScholarshipStudent extends Student {
    private double scholarshipAmount;

    public ScholarshipStudent(int studentid, String studentname, int age, Student department, int[] marks, double scholarshipPercentage) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipAmount = scholarshipPercentage;
    }
    //getters and setters
    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

    @Override
    public void studentType() {
        System.out.println("Scholarship Student");
    }
    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }
    @Override
    public void displayStudentInfo(boolean showMarks){
        super.displayStudentInfo(showMarks);
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }
    @Override
    public void displayStudentInfo(boolean showMarks, boolean showScholarship){
        super.displayStudentInfo(showMarks);
        
    }
}