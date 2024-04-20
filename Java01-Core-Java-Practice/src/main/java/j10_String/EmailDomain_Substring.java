package j10_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "selimdemirer@yahoo.com";

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        //String domain = email.substring(13,18);

        System.out.println("domain = " + domain);

        System.out.println("---------------------1---------------------");

        String str1 = "Java is fun, Java is cool";

        String s1 = str1.substring(0,str1.indexOf(","));    // Java is fun
        System.out.println("s1 = " + s1);

        String s2 = str1.substring(str1.lastIndexOf("J")) ; // Java is cool
        System.out.println("s2 = " + s2);


    }

}
