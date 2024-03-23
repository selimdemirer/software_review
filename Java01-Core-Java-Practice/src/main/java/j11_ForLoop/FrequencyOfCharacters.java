package j11_ForLoop;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            if (ch == str.charAt(i)) frequency++;

        }

        System.out.println("frequency = " + frequency);

    }
}
/*
Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */