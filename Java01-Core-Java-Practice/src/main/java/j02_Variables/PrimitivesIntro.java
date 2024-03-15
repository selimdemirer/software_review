package j02_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;
        // weight: 160 pounds
        // byte weight = 160; 160 is out of byte's range
        // byte num = -129; -129 is out of byte's range
        short weight = 160; // 160 is within the range of short
        // salary: $100000
        // short salary = 100000 // 100000 is out of the short's range
        int salary = 100_000; // preferred data types for integer numbers
        // int asset = 3_333_333_333 it is out of the int's range
        long asset = 3_333_333_333L;  // to tell the compiler that this is the long primitive, the letter l/L need to be added

        //tax: 0.26
        float tax = 0.26F; // to tell the compiler that this is the float primitive, the letter f/F need to be added.
        double PI = 3.14;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 31;
        System.out.println("ch4 = " + ch4);


        char gender = 'M';
        System.out.println(gender);


        boolean isEmployeed = true;
        boolean isMarried = false;
        System.out.println(isMarried);

        boolean result = 100 > 300 ;
        System.out.println("result = " + result);

    }
    

}
