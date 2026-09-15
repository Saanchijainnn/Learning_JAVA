package com.ok.learningjava.datatypes;

/*public class Test {
     static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
    }
}*/

/*public class Test {
     static void main(String[] args) {

        int age = 16;

        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
    }
}*/

/*public class Test {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }
    }
}*/

/*public class Test {
    public static void main(String[] args) {

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}*/

/*public class Test {
    public static void main(String[] args) {

        int age = 20;

        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(result);
    }
}*/

// LOOPS

//while loop
/*public class Test {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            System.out.println("hello");
            i++;
        }
    }
}*/

//For loop
/*public class Test {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}*/

//do while loop
/*public class Test {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
} */


//arrays
/*public class Test {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println(numbers[4]);
    }
}*/

//for each in aaray
/*public class Test {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}*/

//OBJECT ORIENTED PROGRAMMING

/*Class
A class is a blueprint or template used to create objects. It contains data (variables) and methods (functions).*/

/*class ClassName {

    // variables
    int age;

    // method
    void display() {
        System.out.println(age);
    }
}*/

/*Object
An object is an instance of a class. It is used to access the variables and methods of a class.

Syntax:
ClassName objectName = new ClassName();*/

//Encapsulation
 /*Encapsulation means wrapping data (variables) and methods together in a class and protecting the data using access modifiers like private.

Syntax:
class ClassName {
    private dataType variable;

    public void setVariable(dataType value) {
        variable = value;
    }

    public dataType getVariable() {
        return variable;
  }  }
*/


//Inheritance

/*Definition: Inheritance is a mechanism where one class inherits the properties and methods of another class using the extends keyword.
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Inherited method
        d.bark();  // Dog's own method
    }
}
 */
//multiple inheritance is not allowed in java

/*Polymorphism in Java

Definition: Polymorphism means one name having many forms. In Java, it is mainly achieved through method overloading and method overriding.

Example — Method Overriding:
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
    }
}

Explanation: The same sound() method behaves differently depending on the object, so it is called polymorphism.

runtime and compile time polymorphism
Compile-Time Polymorphism

Definition: Compile-time polymorphism is achieved through method overloading, where the method is decided during compilation.

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Test {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
    }
}

Explanation: Same method name add() but different parameters → method overloading → compile-time polymorphism.

Runtime Polymorphism

Definition: Runtime polymorphism is achieved through method overriding, where the method to execute is decided at runtime.

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}

Explanation: Dog overrides sound(), and the method is decided at runtime → method overriding → runtime polymorphism.

Easy trick to remember:
Overloading → Compile Time
Overriding → Runtime*/


/*Abstraction in Java

Definition: Abstraction means hiding implementation details and showing only the essential features to the user.

It is mainly achieved using:

Abstract class
Interface
Example — Abstract Class
abstract class Animal {

    abstract void sound();  // Abstract method

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}

Explanation: Animal hides the implementation of sound() and Dog provides its implementation → this is abstraction.


Abstraction using Interface

Definition: An interface is a blueprint that contains abstract methods. A class uses the implements keyword to provide their implementation.

Syntax:
interface InterfaceName {
    void methodName();
}

class ClassName implements InterfaceName {
    public void methodName() {
        // implementation
    }
}
Example:
interface Animal {
    void sound();   // Abstract method
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}

Explanation: The interface only tells what to do, while the Dog class defines how to do it → this is abstraction using interface.*/