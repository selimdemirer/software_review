package j10_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "    ";

        boolean isEmpty = str.isEmpty();

        System.out.println(isEmpty);

        boolean isBlank = str.isBlank();

        System.out.println(isBlank);

        String str2 = "Cydeo    ";

        System.out.println(str2.isBlank());

        System.out.println("---------------------1---------------------");

        System.out.println(str2.repeat(4));

        System.out.println("---------------------2---------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // Yes, YES, yEs, yES, YEs...

        System.out.println( "yEs".equalsIgnoreCase("Yes") );

        System.out.println("---------------------3---------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp =sentence.contains("C#"); //false
        boolean hasJava = sentence.contains("Java"); //true
        boolean hasJava2 = sentence.contains("java"); //false
        boolean hasJava3 = sentence.toLowerCase().contains("java"); //true
        boolean r3 = sentence.contains("java") || sentence.contains("Java");  // true. if user gives this "jAvA", it returns false

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r3);

        System.out.println("---------------------4---------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains("Java")); // false

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true
        System.out.println(input1.toUpperCase().contains(input2)); // false

        System.out.println("---------------------5---------------------");

        String a = "Wooden Spoon"; //"wooden spoon"

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first create the lower case/upper case version of string and then compare it with lowercase/uppercase

        System.out.println(x); //true
        System.out.println(y); //true
        System.out.println(z); //true


    }

}