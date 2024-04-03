package j15_ForEachLoop;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);

        int max = numbers[0]; // we assume that the first number is the max
/*
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]> max){ // if there is element in the array that's greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }

        }
*/

        for (int number : numbers) {
            if(number>max){
                max=number;
            }
        }

        System.out.println(max);


















    }
}
