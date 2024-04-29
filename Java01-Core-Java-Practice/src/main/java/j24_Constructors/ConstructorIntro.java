package j24_Constructors;

public class ConstructorIntro {

/*

    Constructor:
    • A special method that every class must have.
    • It’s used when we create objects of a class.
    • We can use constructors to initialize the object’s instance variables.
    • Execution of a constructor always depends on the object.
    • Constructor is a special method that matches the name of the class and has no return type nor a specifier.

    No-Argument Constructors:
    • A constructor that has no parameter.
    • Also known as default constructor.
    • If we do not define constructor to a class, then compiler creates default constructor.

    Parameterized Constructors:
    • A constructor that has parameters.
    • If we want to initialize the fields (instance variables) of the class with our own values, then we pass parameters to the constructor

    Constructor Overloading:
    • We can have multiple constructors in a class by implementing method overloading.

    this() keyword:
    • this() keyword is used to call one constructor from another constructor.
    • This process also known as "constructor chaining".
    • Always needs to be in the first line!

    this. keyword:
    • "this." keyword is a reference variable that refers to the current object.
             this.x            =            x;
        (instance variable)         (method parameter)
    • The main purpose of using "this." keyword is to remove the confusion between variables and method parameters if they have the same name.
    • If we don't use "this." keyword, then we would cut the access to instance variable.

    !!! "this." and "this()" are completely two different things !!!
    !!! Do not mixed them up!!!

    super() keyword:
    • It's used if there is "inheritance" between two class (is a relationship).
    • super() is used to invoke / call parent class's constructor, and it's mandatory.
    • Needs to be in the first line! (like this() keyword)
    • In the child class's constructor, we need to provide all parameters of super class's constructor.

    super. keyword:
    • It calls instance variables & instance methods of super class.

*/

}
