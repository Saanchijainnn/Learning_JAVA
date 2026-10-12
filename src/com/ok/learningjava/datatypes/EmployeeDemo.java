package com.ok.learningjava.datatypes;

class Employee {

    int id;
    String name;
    double salary;

    // Constructor overloading
    Employee() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 10000;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method overloading
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    void display(String title) {
        System.out.print(title + " -> ");
        display();
    }

    double calculateBonus(double percent) {
        return salary * percent / 100;
    }

    double calculateBonus(double percent, double extra) {
        return (salary * percent / 100) + extra;
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Amit");
        Employee e3 = new Employee(102, "Priya", 45000);

        e1.display();
        e2.display("Trainee");
        e3.display("Manager");

        // Calculate bonus
        System.out.println("Bonus (10%)        : " + e3.calculateBonus(10));
        System.out.println("Bonus (10% + 2000) : " + e3.calculateBonus(10, 2000));
    }
}
