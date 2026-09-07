# 🎓 University Course Management System

A Java-based **Object-Oriented Programming (OOP)** project that models a university department, manages students and courses, supports different course types, and demonstrates abstraction, inheritance, polymorphism, constructor chaining, and object relationships.

---

## 📌 Overview

The **University Course Management System** is designed to represent the core structure of a simple university course registration system using Java classes and object relationships.

The system manages:

- University departments
- Students
- Courses
- Theory courses
- Lab courses
- Student course enrollment
- Course types
- Department courses
- Polymorphic course handling

The project was developed as an **Object-Oriented Programming assignment** using an abstract `Course` class, inheritance, polymorphism, constructor chaining, and composition/aggregation relationships.

---

## 🏗️ Architecture Diagram

```text
                         🎓 UNIVERSITY COURSE SYSTEM
                                  |
                                  v
                       +-----------------------+
                       |      Department       |
                       |-----------------------|
                       | departmentId          |
                       | departmentName        |
                       | students              |
                       | courses               |
                       +-----------+-----------+
                                   |
                    +--------------+--------------+
                    |                             |
                    v                             v
             +-------------+               +-------------+
             |   Student   |               |   Course    |
             |-------------|               | <<abstract>>|
             | studentId   |               | courseCode  |
             | studentName |               | name        |
             | department  |               | description |
             | email       |               | credits     |
             | yearLevel   |               | maxCapacity |
             | gpa         |               | semester    |
             | courses     |               | instructor  |
             +------+------+               +------+------+
                    |                             |
                    |                             |
                    |                   +---------+---------+
                    |                   |                   |
                    v                   v                   v
             List<Course>       +---------------+   +---------------+
                                | TheoryCourse  |   |   LabCourse   |
                                |---------------|   |---------------|
                                | textbook      |   | equipment     |
                                | examType      |   | labLocation   |
                                | lectureHours  |   | safetyTraining|
                                | classroom     |   | duration      |
                                +---------------+   | supervisor    |
                                                    +---------------+
```

---

## 🔗 Class Relationships

```text
                         Course
                       <<abstract>>
                       /          \
                      /            \
                     v              v
             TheoryCourse        LabCourse


Department
   |
   +-- List<Student>
   |
   +-- List<Course>


Student
   |
   +-- List<Course>
```

### Relationship Summary

| Class | Contains / Extends |
|---|---|
| `Course` | Abstract parent class for all course types |
| `TheoryCourse` | Extends `Course` |
| `LabCourse` | Extends `Course` |
| `Department` | Contains `List<Student>` and `List<Course>` |
| `Student` | Contains `List<Course>` |

---

## 🔄 UML Relationships

### Generalization / Inheritance

```text
TheoryCourse ─────▷ Course
LabCourse ────────▷ Course
```

Both concrete course classes inherit the common attributes and behavior from the abstract `Course` class.

### Department Relationships

```text
Department
 |
 +-- 1..* Student
 |
 +-- 1..* Course
```

A department can contain multiple students and multiple courses.

### Student Enrollment

```text
Student
 |
 +-- 1..* Course
```

A student can enroll in different types of courses.

---

# 📦 Class Design

## 📚 Course

The `Course` class is an abstract class that represents the common structure of university courses.

### Attributes

```java
protected String courseCode;
protected String name;
protected String description;
protected int credits;
protected int maxCapacity;
protected String semester;
protected String instructorName;
```

### Responsibilities

- Store common course information.
- Provide getters and setters.
- Define the abstract `getType()` method.
- Provide common course behavior for subclasses.

### Main Methods

```text
Course(...)

getCourseCode()
getName()
getDescription()
getCredits()
getMaxCapacity()
getSemester()
getInstructorName()

setCourseCode(...)
setName(...)
setDescription(...)
setCredits(...)
setMaxCapacity(...)
setSemester(...)
setInstructorName(...)

getType()
toString()
```

`Course` is abstract, so it cannot be instantiated directly.

---

## 📖 TheoryCourse

The `TheoryCourse` class extends `Course` and represents a theoretical course.

### Additional Attributes

```java
private String textbook;
private String examType;
private int lectureHoursPerWeek;
private String classroomNumber;
```

### Responsibilities

- Store theory-course-specific information.
- Return `"Theory"` from `getType()`.
- Override `toString()`.

### Type

```text
Theory
```

### Constructor Chaining

```java
super(courseCode, name, description, credits,
      maxCapacity, semester, instructorName);
```

---

## 🧪 LabCourse

The `LabCourse` class extends `Course` and represents a practical laboratory course.

### Additional Attributes

```java
private int equipmentCount;
private String labLocation;
private boolean safetyTrainingRequired;
private int sessionDurationMinutes;
private String supervisorName;
```

### Responsibilities

- Store lab-course-specific information.
- Return `"Lab"` from `getType()`.
- Override `toString()`.

### Type

```text
Lab
```

### Constructor Chaining

```java
super(courseCode, name, description, credits,
      maxCapacity, semester, instructorName);
```

---

## 👤 Student

The `Student` class represents a university student.

### Attributes

```java
private int studentId;
private String studentName;
private String department;
private String email;
private String phoneNumber;
private int yearLevel;
private double gpa;
private String address;
private List<Course> enrolledCourses;
```

### Responsibilities

- Store student information.
- Maintain enrolled courses.
- Enroll in courses.
- Display the student's courses.

### Main Methods

```text
Student(...)

getStudentId()
getStudentName()
getDepartment()
getEmail()
getPhoneNumber()
getYearLevel()
getGpa()
getAddress()
getEnrolledCourses()

setStudentId(...)
setStudentName(...)
setDepartment(...)
setEmail(...)
setPhoneNumber(...)
setYearLevel(...)
setGpa(...)
setAddress(...)

enroll(...)
displayCourses()
toString()
```

---

## 🏫 Department

The `Department` class represents a university department.

### Attributes

```java
private int departmentId;
private String departmentName;
private String building;
private String headOfDepartment;
private String contactEmail;
private int establishedYear;
private List<Student> students;
private List<Course> courses;
```

### Responsibilities

- Store department information.
- Maintain the department's students.
- Maintain the department's courses.
- Add students.
- Add courses.
- Display all courses offered by the department.

### Main Methods

```text
Department(...)

getDepartmentId()
getDepartmentName()
getBuilding()
getHeadOfDepartment()
getContactEmail()
getEstablishedYear()
getStudents()
getCourses()

setDepartmentId(...)
setDepartmentName(...)
setBuilding(...)
setHeadOfDepartment(...)
setContactEmail(...)
setEstablishedYear(...)

addStudent(...)
addCourse(...)
displayCourses()
toString()
```

---

# 🧠 Object-Oriented Programming Concepts

## Abstract Class

The `Course` class is declared as:

```java
public abstract class Course
```

Therefore, a `Course` object cannot be created directly.

It provides common course attributes and declares:

```java
public abstract String getType();
```

The subclasses provide the actual implementation.

---

## Inheritance

Both concrete course types extend `Course`:

```java
public class TheoryCourse extends Course
```

```java
public class LabCourse extends Course
```

This allows the subclasses to reuse the common course structure.

---

## Polymorphism

The project demonstrates polymorphism by storing both course types using `Course` references.

Example:

```java
Course dataStructures = new TheoryCourse(...);
Course programmingLab = new LabCourse(...);
```

The department also stores courses using:

```java
private List<Course> courses;
```

Therefore, the same list can contain:

```text
TheoryCourse
LabCourse
```

At runtime, Java calls the correct implementation of:

```java
course.getType();
```

For example:

```text
CS201 | Data Structures --> Theory
CS305 | Database Systems --> Theory
CS210 | Programming Lab --> Lab
CS310 | Networking Lab --> Lab
```

---

## Constructor Chaining

Both child classes call the parent constructor using `super(...)`.

Example:

```java
super(courseCode, name, description, credits,
      maxCapacity, semester, instructorName);
```

This initializes the common `Course` attributes before initializing the subclass-specific attributes.

---

## Encapsulation

The `Student`, `Department`, `TheoryCourse`, and `LabCourse` classes use private attributes with public getters and setters.

Example:

```java
private String studentName;

public String getStudentName() {
    return studentName;
}

public void setStudentName(String studentName) {
    this.studentName = studentName;
}
```

This provides controlled access to object data.

---

## Method Overriding

Both concrete course classes override `getType()` and `toString()`.

### TheoryCourse

```java
@Override
public String getType() {
    return "Theory";
}
```

### LabCourse

```java
@Override
public String getType() {
    return "Lab";
}
```

This demonstrates runtime polymorphic behavior.

---

# 🎓 University Scenario

The example creates one department:

```text
Department: Computer Science
Building: Building C
Head: Dr. Hassan Ali
```

The department contains four courses:

```text
CS201 - Data Structures       - Theory
CS305 - Database Systems      - Theory
CS210 - Programming Lab       - Lab
CS310 - Networking Lab        - Lab
```

---

# 👥 Students

The application creates two students:

```text
Ahmed
Sara
```

### Ahmed's Courses

```text
Data Structures
Networking Lab
```

### Sara's Courses

```text
Programming Lab
Database Systems
```

This demonstrates that a student can enroll in different course types.

---

# 📋 All Courses Offered

The department displays all courses stored in its `List<Course>`.

Example output:

```text
======================================================================
  ALL COURSES OFFERED BY THE DEPARTMENT
======================================================================

Department: Computer Science - Courses offered:

  - TheoryCourse{courseCode=CS201, name=Data Structures,
    textbook=Introduction to Algorithms, examType=Written,
    lectureHoursPerWeek=3, classroomNumber=C-101}

  - TheoryCourse{courseCode=CS305, name=Database Systems,
    textbook=Database System Concepts, examType=Written,
    lectureHoursPerWeek=3, classroomNumber=C-102}

  - LabCourse{courseCode=CS210, name=Programming Lab,
    equipmentCount=30, labLocation=Building B, Room 1,
    safetyTrainingRequired=true, sessionDurationMinutes=90,
    supervisorName=Eng. Yousef Sami}

  - LabCourse{courseCode=CS310, name=Networking Lab,
    equipmentCount=15, labLocation=Building B, Room 3,
    safetyTrainingRequired=true, sessionDurationMinutes=120,
    supervisorName=Eng. Mona Adel}
```

---

# 👤 Student Enrollment Output

Example:

```text
======================================================================
  COURSES ENROLLED BY EACH STUDENT
======================================================================

Student: Ahmed
  - TheoryCourse{courseCode=CS201, name=Data Structures, ...}
  - LabCourse{courseCode=CS310, name=Networking Lab, ...}

Student: Sara
  - LabCourse{courseCode=CS210, name=Programming Lab, ...}
  - TheoryCourse{courseCode=CS305, name=Database Systems, ...}
```

---

# 🔬 Polymorphism Demonstration

The program explicitly demonstrates polymorphism:

```text
======================================================================
  POLYMORPHISM DEMONSTRATION
======================================================================

The following objects are stored as Course references,
but Java calls the correct getType() implementation at runtime:

- CS201 | Data Structures --> Theory
- CS305 | Database Systems --> Theory
- CS210 | Programming Lab --> Lab
- CS310 | Networking Lab --> Lab
```

The objects are referenced as `Course`, but their actual implementations determine the result of `getType()`.

---

# 📁 Project Structure

```text
Universitycourses/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── universitycourses/
                        │
                        ├── Course.java
                        ├── TheoryCourse.java
                        ├── LabCourse.java
                        ├── Student.java
                        ├── Department.java
                        └── Universitycourses.java
```

---

# 💻 Technologies Used

| Technology | Purpose |
|---|---|
| Java | Application development |
| Object-Oriented Programming | System design |
| List / ArrayList | Collection management |
| Maven | Project build and management |
| Apache NetBeans | Development environment |

---

# ▶️ How to Run

## Prerequisites

Make sure you have:

- Java JDK installed
- Apache Maven installed
- Apache NetBeans, IntelliJ IDEA, or Eclipse

## Using an IDE

1. Open the Maven project in your IDE.
2. Make sure the Maven project is loaded correctly.
3. Locate the main class:
   `Universitycourses.java`
4. Run the application.
5. Review the console output.

## Using Maven

Navigate to the project directory:

```bash
cd universitycourses
```

Compile the project:

```bash
mvn clean compile
```

Build the project:

```bash
mvn clean package
```

The application can also be executed directly from the IDE.

---

# ✅ Build & Execution

The project successfully compiles and executes using Maven.

Example final output:

```text
======================================================================
  PROGRAM FINISHED SUCCESSFULLY
======================================================================

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
```

---

# 📚 Assignment Requirements

| Requirement | Status |
|---|---|
| Abstract `Course` class | ✅ |
| `TheoryCourse` extends `Course` | ✅ |
| `LabCourse` extends `Course` | ✅ |
| Inheritance | ✅ |
| `List<Course>` polymorphism | ✅ |
| Constructor chaining using `super(...)` | ✅ |
| Override `toString()` | ✅ |
| One department | ✅ |
| Theory and Lab courses | ✅ |
| Two students | ✅ |
| Student enrollment | ✅ |
| Display all courses | ✅ |
| Display each student's courses | ✅ |
| Demonstrate `getType()` polymorphism | ✅ |

---

# 🎯 Learning Outcomes

This project demonstrates practical experience with:

- Java class design
- Abstract classes
- Inheritance
- Polymorphism
- Encapsulation
- Constructor chaining
- Method overriding
- Constructors
- Getters and setters
- `List` and `ArrayList`
- Object relationships
- Student enrollment
- Maven project structure

---

# 👨‍💻 Author

**Mahmoud Bakri**

Java | Object-Oriented Programming | Software Testing & Quality Assurance

## 📄 License

This project was created for educational purposes as part of a Java Object-Oriented Programming assignment.
