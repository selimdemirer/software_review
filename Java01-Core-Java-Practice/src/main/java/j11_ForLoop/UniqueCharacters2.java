package j11_ForLoop;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //bdf

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { // compares the character that outer loop picked, with each character
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }

/*
             // also we can use branch statement
            if (count != 1){ // count>1
            continue;
            }
*/

            if (count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }

        }

        System.out.println(result);


    }

}
/*
Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */