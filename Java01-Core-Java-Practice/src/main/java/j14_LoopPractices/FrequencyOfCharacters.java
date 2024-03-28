package j14_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd"; // given
        String result = "";     // a2b1c3d1


        for (int j = 0; j <str.length(); j++) { // it gives me each character of string

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // it finds the frequency of each character
                char each = str.charAt(i);
                if (each == ch) {
                    count++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result += ch;
            result += count;
        }
        System.out.println(result);


/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */


    }
}
