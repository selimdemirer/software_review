package j11_ForLoop;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School! @#$%WoodenSpoon";

        String digits = ""; // 12345
        String letters = ""; // CydeoSchoolWoodenSpoon
        String chars = ""; // !@#$%

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch <= '9' && ch >= '0') digits += ch;
            else if ((ch <= 'Z' && ch >= 'A') || (ch <= 'z' && ch >= 'a')) letters += ch;
            else if (ch != ' ') chars += ch;

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("chars = " + chars);

    }

}

/*
Write a program that extract the chars from the string
 */