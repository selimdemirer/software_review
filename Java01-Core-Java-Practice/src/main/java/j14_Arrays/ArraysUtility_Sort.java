package j14_Arrays;

import java.util.Arrays;

public class ArraysUtility_Sort {

    public static void main(String[] args) {

        int[] numbers ={10,9,0,1,2,20,4,6,7,8};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // sorts the array in ascending order

        System.out.println(Arrays.toString(numbers));


    }

}
