package com.mycompany.universitycourses;


public class Universitycourses {

    public static void main(String[] args) {
     printTitle("UNIVERSITY COURSE MANAGEMENT SYSTEM");

        System.out.println("1) Creating the Computer Science department...");
        Department computerScience = new Department(1, "Computer Science", "Building C",
                "Dr. Hassan Ali", "cs.dept@university.edu", 1998);

        System.out.println("2) Creating Theory and Lab courses...");
        Course dataStructures = new TheoryCourse("CS201", "Data Structures",
                "Fundamentals of data structures and algorithms", 3, 40, "Fall 2026",
                "Dr. Nadia Fahmy", "Introduction to Algorithms", "Written", 3, "C-101");
        Course databaseSystems = new TheoryCourse("CS305", "Database Systems",
                "Relational databases, SQL, and database design", 3, 35, "Fall 2026",
                "Dr. Omar Khaled", "Database System Concepts", "Written", 3, "C-102");
        Course programmingLab = new LabCourse("CS210", "Programming Lab",
                "Applied programming exercises", 2, 25, "Fall 2026", "Eng. Yousef Sami",
                30, "Building B, Room 1", true, 90, "Eng. Yousef Sami");
        Course networkingLab = new LabCourse("CS310", "Networking Lab",
                "Hands-on networking and protocols", 2, 20, "Fall 2026", "Eng. Mona Adel",
                15, "Building B, Room 3", true, 120, "Eng. Mona Adel");

        // The Department list is List<Course>, so it can store both subclasses.
        computerScience.addCourse(dataStructures);
        computerScience.addCourse(databaseSystems);
        computerScience.addCourse(programmingLab);
        computerScience.addCourse(networkingLab);

        System.out.println("3) Creating students...");
        Student ahmed = new Student(1001, "Ahmed", "Computer Science", "ahmed@university.edu",
                "0100-000-0001", 2, 3.4, "Cairo, Egypt");
        Student sara = new Student(1002, "Sara", "Computer Science", "sara@university.edu",
                "0100-000-0002", 3, 3.8, "Alexandria, Egypt");
        computerScience.addStudent(ahmed);
        computerScience.addStudent(sara);

        System.out.println("4) Enrolling students in different course types...");
        ahmed.enroll(dataStructures);
        ahmed.enroll(networkingLab);
        sara.enroll(programmingLab);
        sara.enroll(databaseSystems);

        printTitle("ALL COURSES OFFERED BY THE DEPARTMENT");
        computerScience.displayCourses();

        printTitle("COURSES ENROLLED BY EACH STUDENT");
        for (Student student : computerScience.getStudents()) {
            student.displayCourses();
            System.out.println();
        }

        printTitle("POLYMORPHISM DEMONSTRATION");
        System.out.println("The following objects are stored as Course references,");
        System.out.println("but Java calls the correct getType() implementation at runtime:\n");
        for (Course course : computerScience.getCourses()) {
            System.out.println("- " + course.getCourseCode() + " | " + course.getName()
                    + " --> " + course.getType());
        }

        printTitle("PROGRAM FINISHED SUCCESSFULLY");
    }

    private static void printTitle(String title) {
        String line = "=".repeat(70);
        System.out.println("\n" + line);
        System.out.println("  " + title);
        System.out.println(line);
    
    }
}


//This project implements a university course registration system in Java, applying abstract classes, inheritance, and polymorphism, where Course is abstracted into TheoryCourse and LabCourse types managed by the Department and Student classes
