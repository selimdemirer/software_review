package j22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        int num1 = 1;
//      list.remove(num1); // return type is arrayList, because "num1" is an index!

        Integer num2 = 200;
//      list.remove(200); // return type is boolean, because "num2" is an object!
        boolean r = list.remove(num2);

        System.out.println(list);
        System.out.println(r); // it removed first 200 object, then returned true

        System.out.println("---------------------1---------------------");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println(list);

        System.out.println("---------------------2---------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); // 0 // if element is not exist, it returns -1
        int b = characters.lastIndexOf('A'); // 4 // if element is not exist, it returns -1

        System.out.println(a);
        System.out.println(b);

        System.out.println("---------------------3---------------------");

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------------4---------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // list1 and list2 are not same objects!
        System.out.println(list1.equals(list2)); // but their contexts are same!

        System.out.println("---------------------5---------------------");

        list1.clear();
        boolean r4 =  list1.isEmpty(); // true

        System.out.println("r4 = " + r4);

        System.out.println("---------------------6---------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers);

    }


}