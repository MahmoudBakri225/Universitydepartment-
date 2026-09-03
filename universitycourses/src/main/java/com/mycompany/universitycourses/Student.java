/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitycourses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KA
 */
public class Student {
    private int studentId;
    private String studentName;
    private String department;
    private String email;
    private String phoneNumber;
    private int yearLevel;
    private double gpa;
    private String address;
    private List<Course> enrolledCourses;
    
    
    //constructor
    public Student(int studentId, String studentName, String department, String email, String phoneNumber, int yearLevel, double gpa, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.yearLevel = yearLevel;
        this.gpa = gpa;
        this.address = address;
        this.enrolledCourses = new ArrayList<>();
    }
    
    
    //getter
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getDepartment() {
        return department;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getYearLevel() {
        return yearLevel;
    }
    public double getGpa() {
        return gpa;
    }
    public String getAddress() {
        return address;
    }
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
    
    //setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void enroll(Course course) {
        enrolledCourses.add(course);
    }
    
    public void displayCourses() {
        System.out.println("Student: " + studentName);
        if (enrolledCourses.isEmpty()) {
            System.out.println("  (no courses enrolled)");
            return;
        }
        for (Course course : enrolledCourses) {
            System.out.println("  - " + course);
        }
    }
    
    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", department=" + department + ", email=" + email + ", phoneNumber=" + phoneNumber + ", yearLevel=" + yearLevel + ", gpa=" + gpa + ", address=" + address + '}';
    }
    
}
