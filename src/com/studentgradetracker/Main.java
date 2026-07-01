package com.studentgradetracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("   STUDENT GRADE TRACKER");
            System.out.println("==============================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Summary Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Student Marks: ");
                    double marks = scanner.nextDouble();

                    tracker.addStudent(name, marks);
                    break;

                case 2:

                    tracker.displayStudents();
                    break;

                case 3:

                    tracker.displaySummaryReport();
                    break;

                case 4:

                    System.out.println("Thank you for using Student Grade Tracker!");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 4);

        scanner.close();

    }

}