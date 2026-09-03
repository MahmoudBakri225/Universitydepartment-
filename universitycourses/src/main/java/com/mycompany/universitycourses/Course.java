/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitycourses;

/**
 *
 * @author KA
 */
public abstract class Course {
    protected String courseCode;
    protected String name;
    protected String description;
    protected int credits;
    protected int maxCapacity;
    protected String semester;
    protected String instructorName;
    
    
    //constructor
    public Course(String courseCode, String name, String description, int credits, int maxCapacity, String semester, String instructorName) {
        this.courseCode = courseCode;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.maxCapacity = maxCapacity;
        this.semester = semester;
        this.instructorName = instructorName;
    }
    
   
    //getter
    public String getCourseCode() {
        return courseCode;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getCredits() {
        return credits;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public String getSemester() {
        return semester;
    }
    public String getInstructorName() {
        return instructorName;
    }
    
    
    //setter
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public abstract String getType();
    
    
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", name=" + name + ", description=" + description + ", credits=" + credits + ", maxCapacity=" + maxCapacity + ", semester=" + semester + ", instructorName=" + instructorName + '}';
    }
}
