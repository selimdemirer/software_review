package j11_ForLoop;

public class FrequencyOfCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd"; // given
        String result = "";     // a2b1c3d1

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch2==ch1) count++;
            }
            if (result.contains(""+ch1)) continue;
            result += ""+ch1+count;
        }

        System.out.println("result = " + result);


    }
}
/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */