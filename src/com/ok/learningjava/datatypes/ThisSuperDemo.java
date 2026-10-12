
package com.ok.learningjava.datatypes;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    // Constructor chaining using this()
    Student() {
        this("Unknown", 0, 0, "None");
    }

    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    void display() {
        super.display();
        System.out.println("Roll : " + rollNo);
        System.out.println("Course: " + course);
    }
}

class ThisSuperDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20, 21, "B.Tech");

        s1.display();

        System.out.println("-------------------");

        Student s2 = new Student();
        s2.display();
    }
}