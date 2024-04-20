package j14_Arrays;

import java.util.Arrays;

public class ArraysUtility_Split_ToCharArray {

    public static void main(String[] args) {

        String str = "I  love  java";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        int counter = 0;
        for (String each : words) {
            if (!each.isEmpty())
                counter++;
        }

        System.out.println(counter);
        System.out.println(words.length);
        System.out.println(words.length - counter);

        System.out.println("---------------------1---------------------");

        String name1 = "Adam";
        String[] split = name1.split(""); //{"A","d","a","m"}    // Split Method converts to String[]
        char[] charsOfName = name1.toCharArray(); //{'A','d','a','m'}  // toCharArray Method converts to char[]

        System.out.println(Arrays.toString(split));
        System.out.println(Arrays.toString(charsOfName));

        String charArrayToString1 = new String(charsOfName); // We can create a new String, by using char[] (but we cannot use String[])
        System.out.println(charArrayToString1);

        char[] name2 = {'E', 'L', 'I', 'F'};
        String charArrayToString2 = new String(name2); // We can create a new String, by using char[] (but we cannot use String[])
        System.out.println(charArrayToString2);


    }

}