package j25_Statics;

public class StaticsIntro {

/*

Static Keyword
• Static is a non-access modifier in java
• Indicates that a member belongs to "class", rather than to "object".
• In Java, static is applicable for the followings:
a) Variables
b) Methods
c) Blocks
d) Classes

A) Variables:
• Variable: a name of specific location in memory.
• It's a container which holds the value.
    • Three kind of variables exist in java:
        • Local variable
        • Instance variable
        • Static variable

        1-Local Variable:
        • A variable declared inside a 'method' or 'constructor' or 'block'.
        • Accessible and visible only within the declared method, constructor, or block.
        • Local variables can not have 'access modifier'
        • Local variables can not be 'static'
        • Initialization is mandatory for local variables

        2-Instance Variable:
        • A variable declared "inside a class but outside a method / constructor / block"
        • Belongs to objects, not class.
        • Each object can have its own value
        • Can only be accessed by creating object
        • It can not be "static".
        • Initialization is not mandatory for instance variables

        3-Static Variable:
        • A variable declared as static (inside a class but outside a method / constructor / block)
        • Belongs to class, not object (class level variable)
        • A single copy of variable is created and shared among all objects at class level
        • Objects don't have their own values, instead the same value is shared among all the objects
        • If we change the value of a static variable, all other objects will be affected by the change
        • Can only be accessed by two ways:
            a) Creating an object (objectName.variableName)
            b) Directly with Class Name (className.variableName) (Prefer to access with class name)
        • Initialization is not mandatory for static variables

B) Methods:
• Method: A collection of instructions / block of code to performs a specific task
• Benefit: Reusability of code
• It consist of:
    • Access Modifier
    • Return Type
    • Method Name
    • Parameters
    • Method Body (All the code inside the curly braces)
• In java, there are two kind of basic Methods
        • Instance Method
        • Static Method

        1-Instance Method
        • Method that belongs to "Object" rather than class
        • Declared without "static" keyword (Non-static method)
        • In order to call instance methods, we need to create an "Object"

        2-Static Method
        • Method that belongs to "Class" rather than object
        • Declared with "static" keyword
        • In order to call static methods, we can either:
            a) Create an object (objectName.methodName)
            b) Or directly use the Class name (ClassName.methodName) (Prefer to call through Class Name)
        • "this" keyword is can not be used in static methods

        **Access Rules**
    1-Instance methods can access to both instance variables/methods + static variable/methods
    2-Static methods can only access to static variables/methods

C) Blocks
• A Block in java is a group of statements / code placed inside curly braces
• There are two kind of block in java:
        • Static (Initialization) Block
        • Instance (Initialization) Block

        1-Static Initialization Block
        • It is used to initialize class variables (static variables)
        • It is automatically called when the class is loaded to the memory (Simply when we run the program)
        • Executed before instance blocks and constructor (executed first)
        • Executed only once!
        • We may have more than one static init. block
        • And they are executed in the order based on the source code
        • Static blocks can only access to other static members (variables, methods)

        2-Instance Initialization Block
        • It is used to initialize instance variables
        • It is automatically called whenever an object is created
        • Executed after static blocks and before constructor
        • Executed each time an object is created (unlike static blocks)
        • We may have more than one instance block
        • And they are executed in the order based on the source code
        • Instance blocks can access to both static and instance members

   Execution Flow:
1-Static Blocks (only once)
2-Instance Blocks (whenever we create an object)
3-Constructors (whenever we create an object)
4-Main Method

    Static Imports:
With the help of import, we are able to access classes and interfaces which are present in any package. But using static import, we can access all the static members (variables and methods) of a class directly without explicitly calling class name

*/
}
