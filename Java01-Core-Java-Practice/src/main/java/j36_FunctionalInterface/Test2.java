package j36_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach = s -> { // We need to use "< >" because we need to define the parameter. We used "T" in the abstract method parameter and we need to introduce parameter type to Main method
            for (String each : s.split("")) {
                System.out.print(each+" ");
            }
        };

        printEach.test("Wooden Spoon");

        System.out.println();

        System.out.println("---------------------1---------------------");

        MySecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);

        cube.test(5);




    }

}