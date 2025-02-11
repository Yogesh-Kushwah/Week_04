package org.example.ai_driven_resume;


import java.util.ArrayList;
import java.util.List;

// Abstract class representing a Job Role
abstract class JobRole {
    private String applicantName;

    public JobRole(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public abstract void displayRoleDetails();
}

// Software Engineer Job Role
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String applicantName) {
        super(applicantName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Job Role: Software Engineer");
        System.out.println("Applicant Name: " + getApplicantName());
        System.out.println("Skills Required: Java, DSA, OOP, System Design");
    }
}

// Data Scientist Job Role
class DataScientist extends JobRole {
    public DataScientist(String applicantName) {
        super(applicantName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Job Role: Data Scientist");
        System.out.println("Applicant Name: " + getApplicantName());
        System.out.println("Skills Required: Python, Machine Learning, Data Analysis, Statistics");
    }
}

// Product Manager Job Role
class ProductManager extends JobRole {
    public ProductManager(String applicantName) {
        super(applicantName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Job Role: Product Manager");
        System.out.println("Applicant Name: " + getApplicantName());
        System.out.println("Skills Required: Communication, Strategy, Leadership, Agile Development");
    }
}

// Generic class for handling resumes
class Resume<T extends JobRole> {
    private List<T> jobRoles;

    // Constructor
    public Resume() {
        this.jobRoles = new ArrayList<>();
    }

    // Method to add a job role to the list
    public void add(T jobRole) {
        jobRoles.add(jobRole);
        System.out.println("Added a new resume for: " + jobRole.getApplicantName());
    }

    // Method to process all resumes in the list
    public void processAllResumes() {
        for (T jobRole : jobRoles) {
            System.out.println("--------------------------------------------");
            System.out.println("Processing Resume for:");
            jobRole.displayRoleDetails();
        }
    }
}

// Main class for the AI-Driven Resume Screening System
public class AIResumeScreeningSystem {

    public static void main(String[] args) {
        // Resume instance to handle multiple job roles
        Resume<JobRole> resumeManager = new Resume<>();

        // Adding resumes for different roles
        resumeManager.add(new SoftwareEngineer("Alice"));
        resumeManager.add(new DataScientist("Bob"));
        resumeManager.add(new ProductManager("Charlie"));

        System.out.println();

        // Processing all added resumes
        System.out.println("Processing All Resumes:");
        resumeManager.processAllResumes();
    }
}
