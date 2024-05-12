package j34_Collections;

import java.util.*;

public class ListSetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper Towels"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
/*
        Set<String> set1 = new HashSet<>( Arrays.asList(arr));
        arr = set1.toArray(new String[0]);
        System.out.println(set1);
*/
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------1---------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        System.out.println(list);
        System.out.println(list.get(2));

        list = new ArrayList<>(new LinkedHashSet<>(list)); // very important!!! now list both has index and no duplicates

        System.out.println(list);
        System.out.println(list.get(2));

        System.out.println("---------------------2---------------------");

        String[] array = {"A", "B", "C", "D"};

        List<String> s = new ArrayList<>(Arrays.asList(array));

        s.addAll(Arrays.asList("E", "F", "G"));

        System.out.println(s);

        System.out.println("---------------------3---------------------");

        /*
        Given:
            Integer[] nums = {1, 2, 1, 1, 2, 2, 2, 3, 3, 3, 3, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

              Return the fifth element after removing the duplicates
              Do not change the order of the elements
         */

        Integer[] nums = {1, 2, 1, 1, 2, 2, 2, 3, 3, 3, 3, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(nums));

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
        // or
        LinkedHashSet<Integer> removeDuplicates = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println(removeDuplicates);

        ArrayList<Integer> fifthElement = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(nums)));
        System.out.println(fifthElement.get(4));

        System.out.println("---------------------4---------------------");

        String str = "eeeeeaaaabbbbcccddddf";

        //  eabcdf
        //  544341

        String result = ""; //e5a4b4c3d4f1

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(Arrays.asList(str.split("")), each);
        }

        System.out.println(result);

        System.out.println("---------------------5---------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println(names.toArray(new String[0])[2]); // I can use Arrays, in order to add index to Set

        System.out.println("---------------------6---------------------");

        System.out.println(new ArrayList<>(names).get(4)); // I can use ArrayList, in order to add index to Set

        System.out.println("---------------------7---------------------");

        for (String each : names) {
            System.out.println(each);
        }


    }

}