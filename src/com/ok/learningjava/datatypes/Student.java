package com.ok.learningjava.datatypes;
import java.util.Scanner;
class Student {
    int rollNo;              // data members
    String name;
    String course;
    double marks;

    void setDetails(int r, String n, String c, double m) {
        rollNo = r;
        name = n;
        course = c;
        marks = m;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
        System.out.println("-------------------------");
    }
}

 class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");

        int n = sc.nextInt();
        Student[] students = new Student[n];   // array of objects

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            System.out.print("Name (one word): ");
            String name = sc.next();

            System.out.print("Course: ");
            String course = sc.next();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();


            students[i] = new Student();        // create object
            students[i].setDetails(roll, name, course, marks);
        }


        System.out.println("\n===== STUDENT DETAILS =====");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}