package j11_ForLoop;

public class ReverseStringWithString {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String reversed = ""; // We need to initialize string! In order to contain the reversed version of str at the end

        for (int i = str.length()-1 ; i >=0 ; i--) {
            reversed += str.charAt(i); // adding each character to result
        }

        System.out.println(reversed); // println

    }

}
/*
Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
