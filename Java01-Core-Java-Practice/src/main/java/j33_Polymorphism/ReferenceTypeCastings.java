package j33_Polymorphism;

import j32_Abstraction.employeeTask.*;
import j32_Abstraction.employeeTask.Person;
import j32_Abstraction.employeeTask.Tester;
import j32_Abstraction.animalTask.Animal;
import j32_Abstraction.animalTask.Cat;
import j32_Abstraction.animalTask.Dog;
import j32_Abstraction.shapeTask.Circle;
import j32_Abstraction.shapeTask.Shape;
import j32_Abstraction.shapeTask.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        //  Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        //  WebDriver driver = (WebDriver) new ChromeDriver();

        //  Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //  Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //  Dog dog = (Dog)animal; // downcasting
        //  dog.bark();

        System.out.println(animal.getName());
        //  System.out.println( dog.getName() );

        ((Dog) animal).bark();

        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());

        System.out.println("---------------------1---------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //  Cat cat = (Cat) animal2;
        //  cat.meow();

        ((Cat) animal2).meow();

        //  ( (Dog) animal2 ).bark();

        System.out.println("---------------------2---------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);

        ((Tester) employee).bugReport();

        //  ( (Tester)employee ).unitTest();

        //  ( (Developer)employee ).unitTest();

        //  Driver driver = (Driver) employee;  // line 1
        Person person = (Person) employee; // line 2
        //  Teacher teacher = (Teacher) employee; // line 3

        System.out.println("---------------------3---------------------");

        Shape s1 = (Shape) new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();

    }


}