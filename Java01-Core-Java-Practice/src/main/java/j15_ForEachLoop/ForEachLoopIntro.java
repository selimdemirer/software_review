package j15_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < numbers.length; i++) { // regular for loop // i: indexes of the array
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("------------------------");

        for (int each : numbers) { // for each loop // each:elements of the array
            System.out.println(each);
        }

        // Data type MUST match with the 'successive' values of the data structure

    }

}