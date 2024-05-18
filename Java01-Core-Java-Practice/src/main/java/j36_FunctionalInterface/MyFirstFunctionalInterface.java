package j36_FunctionalInterface;

@FunctionalInterface
public interface MyFirstFunctionalInterface {

    public abstract void apply(int n);

    // You can still have default methods
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // And static methods
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

}

/*
What Interface can have?
    • Variables: static & final variable only
    • Methods: static, abstract and default methods only (You can use "default" method to create method with implementation. Like static method. You can only use the method keyword "default" in interfaces.)
 */