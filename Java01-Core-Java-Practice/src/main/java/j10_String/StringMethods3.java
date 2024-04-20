package j10_String;

public class StringMethods3 {

    public static void main(String[] args) {

        String str1 = "     batch 25      US       "; //only the spaces that are not seperating the characters, not used with between the characters will be removed by this trim method.
        str1=str1.trim();

        System.out.println(str1);

        System.out.println("---------------------1---------------------");

        String str2 = "Cydeo School";

        int n1 = str2.indexOf('h'); // or we can use "h"
        System.out.println("n1 = " + n1); // 8
        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2); // 4 // it gives the first "0" (in Cydeo not school)
        int n3 = str2.indexOf("ool");
        System.out.println("n3 = " + n3); // 9 // it gives the first character of "ool"

        String str3 = "Java Programming Language"; // 23 // it gives the last g
        int n4 = str3.lastIndexOf("g");
        System.out.println("n4 = " + n4);

        System.out.println("---------------------2---------------------");

        String s = "Java Nova Cava Wava orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);


    }

}
