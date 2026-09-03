/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitycourses;

/**
 *
 * @author KA
 */
public class LabCourse extends Course {
    private int equipmentCount;
    private String labLocation;
    private boolean safetyTrainingRequired;
    private int sessionDurationMinutes;
    private String supervisorName;
    
    
    //constractor
    public LabCourse(String courseCode, String name, String description, int credits, int maxCapacity, String semester, String instructorName, int equipmentCount, String labLocation, boolean safetyTrainingRequired, int sessionDurationMinutes, String supervisorName) {
        super(courseCode, name, description, credits, maxCapacity, semester, instructorName);
        this.equipmentCount = equipmentCount;
        this.labLocation = labLocation;
        this.safetyTrainingRequired = safetyTrainingRequired;
        this.sessionDurationMinutes = sessionDurationMinutes;
        this.supervisorName = supervisorName;
    }
    
    
    //getter
    public int getEquipmentCount() {
        return equipmentCount;
    }
    public String getLabLocation() {
        return labLocation;
    }
    public boolean isSafetyTrainingRequired() {
        return safetyTrainingRequired;
    }
    public int getSessionDurationMinutes() {
        return sessionDurationMinutes;
    }
    public String getSupervisorName() {
        return supervisorName;
    }
    
    
    //setter
    public void setEquipmentCount(int equipmentCount) {
        this.equipmentCount = equipmentCount;
    }
    public void setLabLocation(String labLocation) {
        this.labLocation = labLocation;
    }
    public void setSafetyTrainingRequired(boolean safetyTrainingRequired) {
        this.safetyTrainingRequired = safetyTrainingRequired;
    }
    public void setSessionDurationMinutes(int sessionDurationMinutes) {
        this.sessionDurationMinutes = sessionDurationMinutes;
    }
    
    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }
    
    @Override
    public String getType() {
        return "Lab";
    }
    
    @Override
    public String toString() {
        return "LabCourse{" + "courseCode=" + courseCode + ", name=" + name + ", equipmentCount=" + equipmentCount + ", labLocation=" + labLocation + ", safetyTrainingRequired=" + safetyTrainingRequired + ", sessionDurationMinutes=" + sessionDurationMinutes + ", supervisorName=" + supervisorName + '}';
    }
}
