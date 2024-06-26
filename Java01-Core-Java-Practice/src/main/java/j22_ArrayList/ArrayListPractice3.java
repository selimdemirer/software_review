package j22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {

    public static void main(String[] args) {

        ArrayList<String> employees =new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll( Arrays.asList("Ahmed", "David") ); // removes other than these

        System.out.println(employees);

        System.out.println("---------------------1---------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );

        list.removeIf( p -> p.charAt(0) == 'M' );

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));


    }

}