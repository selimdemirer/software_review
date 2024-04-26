package j26_GarbageCollection_AccessModifier;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.protectedData);
        System.out.println(AccessModifiers.defaultData);
        //    System.out.println( AccessModifiers.privateData ); // private is not visible outside the class

        AccessModifiers.method1();
        AccessModifiers.method2();
        AccessModifiers.method3();
        //    AccessModifiers.method4(); // private is not visible outside the class


    }

}