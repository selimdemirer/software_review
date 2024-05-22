package j36_FunctionalInterface;

public class FunctionalInterfaceIntro {

/*

    Functional Interface (SAM):
    • Known as SAM (Single Abstract Method) interface
    • There is only one abstract method in the interface
    • Effectively acts as a function
    • @FunctionalInterface annotation is applicable (Optional)

    Lambda Expression:
    • A function with no name and an identifier
    • Can be defined in the place where they are needed
    • Expresses the instances of a functional Interface
    • Can be assigned to the instance of functional interface

    Regular Interface                                          Functional Interface
    Purpose is just to provide methods to the subclasses       Purpose is creating function, not for inheritance
    Can have multiple abstract method                          Must have only one abstract method (Known as SAM interface)
    Uses method overriding							  		   Uses lambda expression

    Build In Functional Interfaces:
        • Predicate : Represents a function which takes one argument (any object) and returns boolean
        • Consumer : Represents a function which takes one argument (any object) and does not return a value
        • Function : Represents a function which takes one argument (any object) and return a value (any object)
        • BiPredicate : Represents a function which takes two arguments (any objects) and returns boolean
        • BiConsumer : Represents a function which takes two argument (any object) and does not return a value
        • BiFunction : Represents a function which takes two arguments (any objects) and return a value (any object)

*/

}
