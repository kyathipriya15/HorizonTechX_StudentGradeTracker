package com.studentgradetracker;

import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students;

    // Constructor
    public GradeTracker() {
        students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(String name, double marks) {
        Student student = new Student(name, marks);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n----- Student List -----");

        for (Student student : students) {
            System.out.println("Name  : " + student.getName());
            System.out.println("Marks : " + student.getMarks());
            System.out.println("------------------------");
        }
    }

    // Calculate Average Marks
    public double calculateAverage() {

        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        return total / students.size();
    }

    // Find Highest Marks
    public double findHighestMarks() {

        if (students.isEmpty()) {
            return 0;
        }

        double highest = students.get(0).getMarks();

        for (Student student : students) {
            if (student.getMarks() > highest) {
                highest = student.getMarks();
            }
        }

        return highest;
    }

    // Find Lowest Marks
    public double findLowestMarks() {

        if (students.isEmpty()) {
            return 0;
        }

        double lowest = students.get(0).getMarks();

        for (Student student : students) {
            if (student.getMarks() < lowest) {
                lowest = student.getMarks();
            }
        }

        return lowest;
    }

    // Display Summary Report
    public void displaySummaryReport() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n========== SUMMARY REPORT ==========");
        System.out.println("Total Students : " + students.size());
        System.out.printf("Average Marks  : %.2f%n", calculateAverage());
        System.out.println("Highest Marks  : " + findHighestMarks());
        System.out.println("Lowest Marks   : " + findLowestMarks());
        System.out.println("====================================");
    }
}