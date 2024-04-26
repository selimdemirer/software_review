package j26_GarbageCollection_AccessModifier;

class AccessModifiers { //default class

/*
Access Modifiers: define the accessibility
• There are 4 access modifiers available in Java: public > protected > default > private
	• private: ONLY reachable within the same class
	• default: ONLY reachable within the same package
	• protected: ONLY reachable within the same package and subclass
	• public: ALWAYS reachable
• A top level java class can have two access modifiers: public and default
• Variables, Constructors and Methods can have all four access modifiers
*/

    public static int publicData = 100;
    protected static int protectedData = 200;
    static int defaultData = 300; // access modifier: default
    private static int privateData = 400;

    public static void method1() {
        System.out.println("Public");
    }

    protected static void method2() {
        System.out.println("Protected");
    }

    static void method3() {
        System.out.println("Default");
    }

    private static void method4() {
        System.out.println("Private");
    }

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);

    }


}