package com.mycompany.universitycourses;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int departmentId;
    private String departmentName;
    private String building;
    private String headOfDepartment;
    private String contactEmail;
    private int establishedYear;
    private List<Student> students;
    private List<Course> courses;
    
    
    //constructor
    public Department(int departmentId, String departmentName, String building, String headOfDepartment, String contactEmail, int establishedYear) {
        
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.building = building;
        this.headOfDepartment = headOfDepartment;
        this.contactEmail = contactEmail;
        this.establishedYear = establishedYear;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    
    
    //getter
    public int getDepartmentId() {
        return departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public String getBuilding() {
        return building;
    }
    public String getHeadOfDepartment() {
        return headOfDepartment;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public int getEstablishedYear() {
        return establishedYear;
    }
    public List<Student> getStudents() {
        return students;
    }
    public List<Course> getCourses() {
        return courses;
    }
    
    
    //setter
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    
    public void displayCourses() {
        System.out.println("Department: " + departmentName + " - Courses offered:");
        for (Course course : courses) {
            System.out.println("  - " + course);
        }
    }
    
    
    @Override
    public String toString() {
        return "Department{" + "departmentId=" + departmentId + ", departmentName=" + departmentName + ", building=" + building + ", headOfDepartment=" + headOfDepartment + ", contactEmail=" + contactEmail + ", establishedYear=" + establishedYear + '}';
    }
    
}
