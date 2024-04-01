package j14_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {100,500,30,40,600,80,90};

        int min = numbers[0]; // we assume that the first number is the min

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]<min){ // if there is element in the array that's smaller than the current min number
                min = numbers[i]; // assigning smaller number to variable max
            }
        }

        System.out.println(min);

    }
}
