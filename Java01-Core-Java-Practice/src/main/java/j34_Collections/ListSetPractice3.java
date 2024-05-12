package j34_Collections;

import java.util.*;

public class ListSetPractice3 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        System.out.println("set = " + set);

        Integer[] array = set.toArray(new Integer[0]);
        System.out.println("array = " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>(set);
        System.out.println("list = " + list);

        // List<String> names = null;
        // System.out.println(names.size());

        System.out.println("---------------------2---------------------");

        // pop() ==> LIFO ==> Stack

        List<Character> chars1 = new Stack<>();
        chars1.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println(chars1); // [A, B, C, D]

        ((Stack) chars1).pop();

        System.out.println(chars1); // [A, B, C]

        ((Stack) chars1).pop();

        System.out.println(chars1); // [A, B]

        System.out.println("---------------------3---------------------");

        // poll() ==> FIFO ==> LinkedList

        List<Character> chars2 = new LinkedList<>();
        chars2.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println(chars2); // [A, B, C, D]

        ((LinkedList<Character>) chars2).poll();

        System.out.println(chars2); // [B, C, D]

        ((LinkedList<Character>) chars2).poll();

        System.out.println(chars2); // [C, D]


    }

}