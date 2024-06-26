package j16_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray1 {

    public static void main(String[] args) {
        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

        String[][] groups = new String[3][]; //index: 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.toString(group1)); //toString() is for one dimensional arrays only
        System.out.println( Arrays.deepToString(groups) );

        System.out.println("---------------------1---------------------");
        /*
            {1,2,3}
            {4,5,6,7}
            {8,9,10,11,12}
         */

// index of the elements:  0 1 2     0 1 2 3    0 1  2 3  4
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12} };
        // index of arrays:   0         1             2

        System.out.println( Arrays.deepToString(arr2D) ); // We are using "deepToString" in order to print multi D arrays

        System.out.println( Arrays.toString(arr2D[1]) ); // {4,5,6,7}

        System.out.println( arr2D[2][3] ); //11


    }

}
/*
String[] group1 = {"Jon", "Joes", "James"}
String[] group2 = {"Jon", "Joes", "James"}
String[] group3 = {"Jon", "Joes", "James"}
 */