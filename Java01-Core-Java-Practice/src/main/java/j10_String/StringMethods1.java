package j10_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String word = "Cydeo";
              //index: 01234

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
        */

        System.out.println("---------------------1---------------------");

        String s1 = "Batch 25 is the best batch";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1);

        System.out.println("lastChar = " + lastChar);

        System.out.println("---------------------2---------------------");

        String str = "wooden spoon";
        //str.toUpperCase(); //still "wooden spoon", we didn't create a new string
        str = str.toUpperCase(); //"WOODEN SPOON", we created a new string

        System.out.println(str);

        //Today is a great day to learn java programming language.
        String sentence ="Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);


    }

}
