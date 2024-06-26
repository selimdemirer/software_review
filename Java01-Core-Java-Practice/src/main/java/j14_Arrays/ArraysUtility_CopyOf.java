package j14_Arrays;

import java.util.Arrays;

public class ArraysUtility_CopyOf {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] erlyBirds = Arrays.copyOf(students, 30);

        System.out.println(Arrays.toString(erlyBirds));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        numbers = Arrays.copyOf(numbers, 5); // {1,2,3,4,5}
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------1---------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6); // 6 excluding like substring method

        System.out.println(Arrays.toString(ch2));

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        // index:        0  1  2  3  4  5  6  7  8  9
        int[] result = Arrays.copyOfRange(scores,3,7);
        int[] result2 = Arrays.copyOfRange(scores,5,scores.length);

        System.out.println(Arrays.toString(result2));


    }

}
