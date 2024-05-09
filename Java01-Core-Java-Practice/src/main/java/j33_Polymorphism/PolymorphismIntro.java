package j33_Polymorphism;

import j32_Abstraction.employeeTask.*;
import j32_Abstraction.animalTask.Animal;
import j32_Abstraction.animalTask.Cat;
import j32_Abstraction.animalTask.Dog;
import j32_Abstraction.animalTask.Playable;
import j32_Abstraction.shapeTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

/*

    OOP Principles:
    • OOP: A design pattern of the applications in an organized and modular way
    • There are 4 Object-Oriented Programming (OOP) principles:
        • Encapsulation (data hiding from code that’s outside the class)
        • Inheritance (creating an “is a” relationship among the classes)
        • Abstraction (process of hiding implementation details from the user)
        • Polymorphism (ability of the objects to take on many forms)

    Poly + Morphism (Many Forms):
    • Ability of the objects to take on many forms
    • Occurs when reference type is parent class/interface and object type is child

    Calling method in polymorphism:
    • Only the methods in reference type can be called
    • When we call a method, it will call overridden version from a child class
    • If method is not overridden, it will call parent/super class version

    instanceof keyword:
    • Instanceof keyword can be used to check if the object is certain class. (Returns boolean)

    Polymorphism Rules:
    • Reference type can be parent class or interface
    • Object type can be any extending or implementing child class
    • Reference type decides what is accessible
    • Object type decides which implementation of the method to be executed when the method is called

    Reference Type Castings:
    • Casting one reference type to another
    • There must be IS A (inheritance) relation between the object type and reference type we are casting it to, otherwise ClassCastException will be thrown
    • There are two types of reference type castings: upcasting and downcasting

    Upcasting:
    • Casting the smaller reference type (sub type) to larger reference type (super type)
    • Upcasting is done implicitly and cast operator is not required to be given explicitly
    • Allows us to achieve polymorphism without any explicit action

    Downcasting:
    • Casting the larger reference type (super type) to smaller reference type (sub type)
    • Downcasting is done explicitly and cast operator is required to be given explicitly
    • Allows us to access the features of the objects type that are not in reference type

*/

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        Integer n1 = 2;
        Double n2 = 5.5;
        Boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4) , new Square(7)}; //Object Class: Parent of all classes

        System.out.println(Arrays.toString(array));

        System.out.println("---------------------1---------------------");

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Person> cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println("cydeoEmployees = " + cydeoEmployees);

        System.out.println("---------------------2---------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee.work(); // Reference type decides what is accessible: work() method is in Employee. Object type decides which implementation will be used: override version of work() method will be executed

        employee.sleep(); // Reference type decides what is accessible: sleep() method is in Employee. Object type decides which implementation will be used: override version of sleep() method will be executed

        // employee.bugReport(); // Reference type decides what is accessible: bugReport() method is NOT in Employee

        Tester tester1 = new Tester("Şeyma",25,'F',4,"SDET",100000.00);
        tester1.bugReport();

        System.out.println("---------------------3---------------------");

        Animal animal1 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal1.drink(); // drink() is in Animal Class and it is final
        animal1.eat(); // eat() is in Animal Class but it is overriden in Dog Class
        //  animal1.play(); // play() is in Playable Interface not in Animal Class
        //  animal1.bark(); // bark() is in Dog Class not in Animal Class

        System.out.println("---------------------4---------------------");

        Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
        //  animal2.drink();
        //  animal2.eat();
        //  animal2.bark();

        Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");

        System.out.println("---------------------5---------------------");

        Shape shape = new Circle(5);
        shape.area();
        //  System.out.println( shape.getRadius());
        //  System.out.println( shape.PI);

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);

    }


}