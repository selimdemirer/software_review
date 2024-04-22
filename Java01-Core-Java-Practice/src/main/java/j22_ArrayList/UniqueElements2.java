package j22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique1 = new ArrayList<>();

        for (Integer each : list) {
            int frequency = Collections.frequency(list, each ); // finds the frequency of each element
            if(frequency == 1){
                unique1.add(each);
            }
        }

        System.out.println("frequency solution = " + unique1);

        System.out.println("---------------------1---------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);

        unique2.removeIf( p ->  Collections.frequency(list2, p) > 1 ); // removes the ones have greater than 1 frequency

        System.out.println("frequency + removeIf solution = " + unique2);


    }

}