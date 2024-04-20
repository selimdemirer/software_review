package j22_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>() ;
        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers);
        System.out.println(names);

    }

}
/*
    ArrayList:
• Allows us to store objects
• Presented in “java.util” package
• Size is automatically adjusted (has 'add' and 'remove' functions)
• Does not support primitives
*/