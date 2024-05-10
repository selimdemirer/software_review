package j14_Arrays;

import java.util.Arrays;

public class ArraysIntro {

/*
    Data Structures: Work with multiple data

	    • Array (Supports both primitives & non-primitives)
	    • Collection (Supports non-primitives ONLY)
	    • Map (Collection of Pairs)

    Array:
    • Size is fixed
	• Supports both primitives & non-primitives

*/

    public static void main(String[] args) {

     // create a variable that's capable enough to contain 5 names

     // String myGroup[];
        String[] myGroup = new String[5]; // index : 0~4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        System.out.println(myGroup); //hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("---------------------1---------------------");
              //index:      0         1          2           3        4         5         6
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

        System.out.println("---------------------2---------------------");

        int number = 11;

        if (number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

    }


}
