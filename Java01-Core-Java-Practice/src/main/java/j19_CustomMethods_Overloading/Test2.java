package j19_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------1---------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------------2---------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------------3---------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtility.printEachElement(names);


        System.out.println("---------------------4---------------------");

        int[] n1 = {10,2,3,4,5,6};

        int max1 = ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);

        System.out.println("---------------------5---------------------");

        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};

        double max2 = ArraysUtility.max(n2);

        System.out.println("max2 = " + max2);

        System.out.println("---------------------6---------------------");


        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1, 10);

        System.out.println("r1 = " + r1);


    }

}