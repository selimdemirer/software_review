package j21_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        //Long n1 =num1; it doesn't accept other than Long
        Integer n1 = num1; //autoboxing

        int num2 = n1;  //unboxing

        System.out.println("------------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue; //unboxing

        Byte b1 = 25;

        byte a1 = b1; //unboxing
        short a2 = b1; //unboxing
        int a3 = b1; //unboxing
        long a4 = b1; //unboxing

        System.out.println("------------------------------------");

        int num3 = 200;
        // Long l2 = num3;
        // Double d1 = num3;

        Integer num4 = num3; //autoboxing


        System.out.println("------------------------------------");

        Integer z = 900;
        Integer y =z;

        System.out.println("------------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};



    }

}
/*
Wrapper Classes presented in "java.lang" package.
✨ We don't have to import anything from "java.lang" package because it is imported implicitly.
✨ A "Wrapper Class" only accepts its primitive type! But you can assign a "Wrapper Class" to any primitive type as long as within its range!
✨ Autoboxing and Unboxing are implicitly done!
✨ parse"WrapperClass"(str): converts String to primitive, return type is primitive. [ Integer.parseInt(str) / Double.parseDouble(str) ]
✨ valueOf(str): converts String to Wrapper Class, return type is Wrapper Class object. [ Integer.valueOf(str) / Double.valueOf(str) ]
*/