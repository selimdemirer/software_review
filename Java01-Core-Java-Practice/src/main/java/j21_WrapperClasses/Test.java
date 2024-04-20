package j21_WrapperClasses;

public class Test {

    public static void main(String[] args) {

        // String to int
        String str1 = "123";
        int int1 = Integer.parseInt(str1);
        Integer Integer1 = int1;

        System.out.println("---------------------1---------------------");

        // String to Integer
        String str2 = "123";
        Integer Integer2 = Integer.valueOf(str2);
        int int2 = Integer2;

        System.out.println(int1==int2);

        System.out.println("---------------------2---------------------");

        // int to String
        int int3 = 123;
        Integer Integer3 = int3;
        String str3 = Integer.toString(int3);

        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str3));

    }

}
