package org.example.multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Abstract base class representing different types of courses
abstract class CourseType {
    abstract void details(); // Method to display course details
}

// Class for exam-based courses
class ExamCourse extends CourseType {
    String name;
    int totalMarks;

    public ExamCourse(String name, int totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }

    // Display details of the exam course
    protected void details() {
        System.out.println("Exam Course Name: " + name + " Total Marks: " + totalMarks);
    }
}

// Class for assignment-based courses
class AssignmentCourse extends CourseType {
    String name;
    int totalMarks;

    public AssignmentCourse(String name, int totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }

    // Display details of the assignment course
    protected void details() {
        System.out.println("Assignment Course Name: " + name + " Total Marks: " + totalMarks);
    }
}

// Class for research-based courses
class ResearchCourse extends CourseType {
    String name;
    int totalMarks;

    public ResearchCourse(String name, int totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }

    // Display details of the research course
    protected void details() {
        System.out.println("Research Course Name: " + name + " Total Marks: " + totalMarks);
    }
}

// Generic class to manage courses of a specific type
class Course<T extends CourseType> {
    List<T> courses;

    public Course() {
        courses = new ArrayList<>();
    }

    // Add a course to the list
    public void add(T course) {
        courses.add(course);
    }

    // Retrieve all courses from the list
    public List<T> getAll() {
        return courses;
    }

    // Display details of all courses in the list
    public void display(List<? extends CourseType> list) {
        for (CourseType sub : list) {
            sub.details();
        }
    }
}

public class UniversityCourseManagementSystem {

    public static void main(String[] args) {
        // Create course managers for each type of course
        Course<ExamCourse> examCourseCourseType = new Course<>();
        Course<AssignmentCourse> assignment = new Course<>();
        Course<ResearchCourse> research = new Course<>();

        // Add specific courses to their respective managers
        examCourseCourseType.add(new ExamCourse("Maths", 120));
        assignment.add(new AssignmentCourse("Java Problems", 100));
        research.add(new ResearchCourse("Thesis", 80));

        // Display details of all exam courses
        examCourseCourseType.display(examCourseCourseType.getAll());
        System.out.println("---------------------------------------------");

        // Display details of all assignment courses
        assignment.display(assignment.getAll());
        System.out.println("---------------------------------------------");

        // Display details of all research courses
        research.display(research.getAll());
        System.out.println("---------------------------------------------");
    }
}
