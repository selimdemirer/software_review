package j15_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each:chars){
            System.out.print(each);
        }

        System.out.println("\n---------------------1---------------------");

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("---------------------2---------------------");

        String email = "woodenspoon@gmail.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------3---------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";
        String[] sentences = s.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }

}
