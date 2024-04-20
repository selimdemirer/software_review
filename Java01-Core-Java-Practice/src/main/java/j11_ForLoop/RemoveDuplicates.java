package j11_ForLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbaacc";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);
            if (!result.contains(ch)) {
                result += ch;
            }
        }

        System.out.println("result = " + result);


    }

}
/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding

 */