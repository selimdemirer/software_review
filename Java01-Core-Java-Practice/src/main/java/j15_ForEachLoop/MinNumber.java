package j15_ForEachLoop;

import java.util.Arrays;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};

    /*
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
    */

        int min = numbers[0]; // we assume that the first number is the min

        for (int each : numbers){
            if (each<min) min=each;
        }

        System.out.println("min = " + min);


    }

}
