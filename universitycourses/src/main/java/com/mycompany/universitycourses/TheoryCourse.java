/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitycourses;

/**
 *
 * @author KA
 */
public class TheoryCourse extends Course {
    private String textbook;
    private String examType;
    private int lectureHoursPerWeek;
    private String classroomNumber;
    
    
    public TheoryCourse(String courseCode, String name, String description, int credits, int maxCapacity, String semester, String instructorName, String textbook, String examType, int lectureHoursPerWeek, String classroomNumber) {
        super(courseCode, name, description, credits, maxCapacity, semester, instructorName);
        this.textbook = textbook;
        this.examType = examType;
        this.lectureHoursPerWeek = lectureHoursPerWeek;
        this.classroomNumber = classroomNumber;
    }
    
    //getter
    public String getTextbook() {
        return textbook;
    }
    public String getExamType() {
        return examType;
    }
    public int getLectureHoursPerWeek() {
        return lectureHoursPerWeek;
    }
    public String getClassroomNumber() {
        return classroomNumber;
    }
    //setter
    public void setTextbook(String textbook) {
        this.textbook = textbook;
    }
    public void setExamType(String examType) {
        this.examType = examType;
    }
    public void setLectureHoursPerWeek(int lectureHoursPerWeek) {
        this.lectureHoursPerWeek = lectureHoursPerWeek;
    }
    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }
    
    @Override
    public String getType() {
        return "Theory";
    }
    @Override
    public String toString() {
        return "TheoryCourse{" + "courseCode=" + courseCode + ", name=" + name + ", textbook=" + textbook + ", examType=" + examType + ", lectureHoursPerWeek=" + lectureHoursPerWeek + ", classroomNumber=" + classroomNumber + '}';
    }   
}
