package j27_Encapsulation;

public class EncapsulationIntro {

/*

    OOP Principles:
    • OOP: A design pattern of the applications in an organized and modular way
    • There are 4 Object-Oriented Programming (OOP) principles:
        • Encapsulation (data hiding from code that’s outside the class)
        • Inheritance (creating an “is a” relationship among the classes)
        • Abstraction (process of hiding implementation details from the user)
        • Polymorphism (ability of the objects to take on many forms)

    Encapsulation (Data Hiding):
    • An object hides its internal data from code that’s outside the class.
    • Only the current class’ methods can directly access and make changes to the instance variables.
    • Hide an instance variable by giving private access modifier, and making the methods that access those fields public.
    • These public methods are called getters & setters (accessor and mutator).

    Getters & Setters:
    • Both are public instance methods, used to protect our data and make our code more secure.
    • Getter is used for reading the private data (instance variable) only.
    • Setter is used for writing (modifying) the private data (instance variable) only.

    Getters Method:
    • An instance return method that returns the private instance variable.
    • Does not pass any parameter.
    • "Return type of the method" MUST match with the data type of the private instance variable.

    Setter Method:
    • An instance method with the return type of void.
    • Passes a parameter, and parameter will be assigned to the private instance variable.
    • "Data type of the parameter" MUST match with the data type of the private instance variable.
    • After encapsulation, we put the setters inside the constructors not "this.". We are putting "this." inside the setters.

*/

}
