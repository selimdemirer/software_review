package j31_Exceptions;

public class ExceptionsIntro {

/*

    Exception:
    • An unwanted or unexpected event
    • Occurs during the compile time or during the runtime
    • To prevent exceptions from crashing our program, we must write code that detects and handles them
    • There are two categories of exceptions: checked exception and unchecked exception

    Unchecked (Unexpected Event) Exceptions:
    • Exceptions that are not checked at compile time
    • Occurs during the RUNTIME
    • Code will compile even if we do not handle them
    • They have IS A relationship with RuntimeException (parent class)

    Checked (Unwanted Event) Exceptions:
    • Exceptions that are checked at compile time
    • Occurs during the COMPILE TIME
    • Code will not compile even if we do not handle them
    • They do not have IS A relationship with RuntimeException class

    Errors:
    • Indicates that an illegal operation is being performed
    • Occurs during the runtime only
    • They can not be recovered, and not recommended to handle them

    Exception Handling:
        1. try & catch: used for handling checked & unchecked exceptions
        2. throws: used for handling checked exceptions ONLY

        * It is better to create custom methods using try & catch blocks! Because caller will not be responsible for handling the exception. Disadvantage of try & catch blocks is more codes.

    Exception Object:
    • When runtime exception happens, java will catch it and assigns to a variable in catch block
    • After it is successfully caught, we can use the variable and call some methods on the exception object
    • Popular methods of exception objects are:
        • printStackTrace(): prints a stack trace (full details) of the exception
        • getMessage(): returns only brief description of the exception

    Multiple catch Blocks:
    • If the code in the try block will be capable of throwing more than one type of exception
    • To specify all the possible exceptions that could be thrown
    • Parent exception class can not be placed before child exception class

    Finally Block:
    • An optional block that can be given after last catch block
    • Always executed after try & catch blocks whether an exception occurs or not

    Throws Keyword:
    • Used within the method signature
    • Informs the compiler that method throws one of the listed type exception
    • Fastest way to get rid of the compilation error that’s caused by a checked exception
    • Whoever calls the method that has throws keyword in its signature is responsible to handle it or declare it again

    Throw keyword:
    • Used for manually throwing an exception

*/

}
