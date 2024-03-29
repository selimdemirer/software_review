package j11_ForLoop;

public class UniqueCharacters1 {

    public static void main(String[] args) {

        String str = "zeynep";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // if the first and last index of the character are same, it means it is unique
                result += ch;
            }
        }

        System.out.println("result = " + result);

    }

}
/*
Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==> 2
				  lastIndexOf('B') ==> 2
 */
