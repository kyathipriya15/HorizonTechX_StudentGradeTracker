package com.studentgradetracker;

public class Student {

    private String name;
    private double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }
}