package j36_FunctionalInterface;

// lambda:  () -> {}

public class Test1 {

    public static void main(String[] args) {

        // function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20); // We can access to abstract method via reference name
        oddOrEvenNumber.defaultMethod(); // We can access to default method via reference name
        MyFirstFunctionalInterface.staticMethod(); // We need to access to static method via class name

        System.out.println("---------------------1---------------------");

        // function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age) -> {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(18);

        System.out.println("---------------------2---------------------");

        // function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface printCube;

        printCube = n -> System.out.println(n * n * n); // we don't have to use () because there is only one parameter
                                                        // we don't have to use {} because there is only one statement

        printCube.apply(3);

        System.out.println("---------------------3---------------------");

        //function4: create a function that can check if a number is evenly divisible by 3 & 5
        MyFirstFunctionalInterface divisibleBy3And5 = n -> {
            if (n % 15 == 0) {
                System.out.println(n + " is divisible by 3 and 5");
            } else {
                System.out.println(n + " is not divisible by 3 and 5");
            }
        };

        divisibleBy3And5.apply(30);


    }

}