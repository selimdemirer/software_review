package j36_FunctionalInterface;

public class Test3 {

    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
                    String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };

        String result = stringReverse.method("Wooden Spoon");

        System.out.println(result);

        System.out.println("---------------------1---------------------");

        //create a function that can return the cube of an integer
        MyThirdFunctionalInterface<Integer> calculateCube= (i) -> {
            Integer cube  = i*i*i;
            return cube;
        };

        Integer result2 = calculateCube.method(5);

        System.out.println(result2);


    }

}