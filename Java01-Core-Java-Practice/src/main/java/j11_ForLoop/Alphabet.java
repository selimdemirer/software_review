package j11_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.print("\t"+i);
        }

        System.out.println();
        System.out.println("---------------------1---------------------");

        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.print("\t"+i);
        }

        System.out.println();
        System.out.println("---------------------2---------------------");

        for (char i = 'Z'; i >= 'A' ; i--) {
            System.out.print("\t"+i);
        }

        System.out.println();
        System.out.println("---------------------3---------------------");

        for (char i = 'z'; i >= 'a' ; i--) {
            System.out.print("\t"+i);
        }

        System.out.println();
        System.out.println("---------------------4---------------------");

        for (char i = 1; i <= 40000; i++) {
            System.out.print(i+" ");
        }



    }

}
/*
Print:
A~Z
a~z
Z~A
z~a
 */