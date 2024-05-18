package j36_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Tasks {

    public static void main(String[] args) {

        // create a function that can return the maximum number from an int array //function

        Function<Integer[], Integer> maxNumOfArr = (arr) -> {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        };

        // create a function that can swap the first and last elements of an array //function

        Function<Integer[], Integer[]> swapFirstAndLastElementsOfArray = arr -> {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
            return arr;
        };

        // create a function that can reverse an array and returns it //function

        Function<Integer[], Integer[]> reverseArray = arr -> {
            Integer[] reverse = new Integer[arr.length];
            for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
                reverse[i] = arr[j];
            }
            return reverse;
        };

        // create a function that can reverse a List //function

        Function<ArrayList<Integer>, ArrayList<Integer>> reverseList = list -> {
            ArrayList<Integer> reverse = new ArrayList<>();
            Collections.reverse(list);
            return reverse;
        };

    }

}
