package j10_String;

public class StringMethods4 {

    public static void main(String[] args) {

        String str1 = "Java is fun, I love learning Java",
        str2 = str1.replace("Java","Python"); // "Python is fun, I love learning Python"

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println("---------------------------");

        String email1 = "johnsmith@yahoo.com";
        String email2 =email1.replace("yahoo","gmail");

        System.out.println("email1 = " + email1);
        System.out.println("email2 = " + email2);

        String s2 = "Java";
        String s3 = s2.replace("a","e"); //Jeve
        String s4 = s2.replaceFirst("a","e"); //Jeva

        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);









    }
}
