package j28_Inheritance;

public class InheritanceIntro {

/*

    Inheritance (Is A relation):
    • Used for creating an “is a” relationship among the classes.
    • When an “is-a” relationship exists between objects, it means that the specialized object has all the characteristics of the general object.
    • It allows one class to inherit the features (variables & methods) of another class.
    • The keyword used for inheritance is "extends".

    Super & Sub Classes (Is A relation):
    • Super Class: The class whose features are inherited is known as super class (or a base class or a parent class).
    • Sub Class: The class that inherits the other class is known as subclass (derived class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.

    What is inherited to subclass?
    • All the accessible variables & methods (depending on the access modifier).
    • Private variables and methods are NOT inherited.
    • Constructors are NOT inherited, but child class MUST call one of parent class’ constructor.

    Calling the Super Class Constructor:
    • If parent class has default constructor, subclass calls it implicitly, otherwise super class’ constructor need to be called explicitly in the subclass.
    • The super keyword refers to an object’s super class. We can use the super keyword to call a superclass constructor.

    super() keyword:
    • super() is used to call Parent class constructor from Child class constructor.
    • If parent class has default (No-Argument) constructor, compiler will put super() automatically.
    • If parent class only has constructor with parameters, then child constructor MUST make a matching super(params) call.

    Types of Inheritance:
    • Single Inheritance: Sub classes inherit the features of one super class.
    • Hierarchical Inheritance: Once class serves as superclass for more than one subclass.
    • Multi Level Inheritance: Subclass will be inheriting a Super Class and as well as the subclass also act as the Super Class to the other class.
    • Multiple Inheritance: Java DOES NOT support multiple inheritance with classes. One class can not have more than one superclass and inherit features from all parent class.

    this keyword: refers to the instances. Current class
	        this.  : calls instance variables & instance methods
	        this() : calls the constructor of current class

    super keyword: refers to the instances. Parent class
	        super.  : calls instance variables & instance methods of super class
	        super() : calls the constructor of parent class

	Method Overloading: multiple different methods having the same name, parameters MUST be different
            • ANY method can be overloaded

    Method Overriding: giving different implementations to the method
            • MUST happen in the child class
            • return-type, method name, parameter MUST be same
            • Access modifier need to be same or more visible
				public > protected > default
	        • Method we can not override: private, static, final
            • ONLY the instance methods (not final & not private) can be overriden
            • @Overriden annotation must be applicable

    Access Modifiers:
            • public > protected > default > private

    Object Class: presented in "java.lang" package.
            • parent of all the classes.
            • implicitly extended to all classes

*/

}
