package j32_Abstraction;

public class AbstractionIntro {

/*

    OOP Principles:
    • OOP: A design pattern of the applications in an organized and modular way
    • There are 4 Object-Oriented Programming (OOP) principles:
        • Encapsulation (data hiding from code that’s outside the class)
        • Inheritance (creating an “is a” relationship among the classes)
        • Abstraction (process of hiding implementation details from the user)
        • Polymorphism (ability of the objects to take on many forms)

    Abstraction:
    • Process of hiding implementation details from the user
    • Only the functionality will be provided to the user
    • Focusing on the essential qualities of something rather than one specific example. (Ignoring the irrelevant & unimportant)
    • User will have the information on what the object does instead of how it does

    Abstract Method:
    • A method that does not have body, only signature
    • A method that’s meant to be overridden
    • Abstract keyword is used to create abstract method

    Abstract Method Rules:
    • An abstract method can not be static
    • An abstract method can not be final
    • An abstract method can not have private access modifier
    • An abstract method does not have body
    • An abstract method can only be created in an abstract class or in an interface

    Abstract Class:
    • A class that’s meant to be a parent (super) class
    • Goal is to provide reusable variables and methods to subclasses
    • Abstract keyword is used to create the abstract class
    • An abstract class can not be instantiated

    Creating Object:
    • Abstract class is meant to be inherited only, not meant to be instantiated
    • Abstract class is not a concrete class and object has to be concrete
    • A subclass of abstract class is called concrete class, and it can be instantiated
    • A Concrete class must implement all the inherited abstract methods

    Regular class                                   Abstract class
    can have constructors, instances and statics    can have constructors, instances and statics
    Regular class can be instantiated               Abstract class can not be instantiated
    Regular class can not have abstract method      Abstract class can have abstract method
    Regular class can be declared as final          Abstract class can not be declared as final

    Interface:
    • It’s a template, a blueprint of a class
    • Interface keyword is used to create interface
    • Specifies the behavior(s) that a class should implement
    • Provides additional methods that subclass(es) need.
    • We can achieve 100% abstraction using interfaces

    Properties of Interface:
    • Variables are static & final by default
    • Interface can have static methods, abstract methods and default methods only
    • Public is the only access modifier that can be used in interface and given by default
    • Abstract keyword is given by default to the abstract methods of interface

    What Interface can have?
    • Variables: static & final variable only
    • Methods: static, abstract and default methods only (You can use "default" method to create method with implementation. Like static method. You can only use the method keyword "default" in interfaces.)

    What Interface can not have?
    • An interface can not have instance variables
    • An interface can not have instance methods
    • An interface can not have constructors
    • An interface can not have blocks
    • We can not create objects from interface

    Implementing the Interface:
    • Class can extend only one superclass, but java allows a class to implement multiple interfaces
    • Implements keyword is used to inherit from interface(s)
    • When a class implements multiple interfaces, it must implement (override) all the abstract methods

    Abstract class                                      Interface
    Can not be instantiated                             Can not be instantiated
    Can not be final                                    Can not be final
    Multiple inheritance is not allowed                 Multiple inheritance is allowed
    Can have constructor                                Can not have constructor
    Can have instance, static and abstract methods      Can have static, abstract and default methods
    Can have instance and static variables              Can only have static variable (final by default)
    Can use other access modifiers than public          Can not use other access modifiers than public

*/

}
