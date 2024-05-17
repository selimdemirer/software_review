package j35_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str1 = "aabcccdeeeef"; // Finding the unique character by using collections utility
        String[] arr = str1.split("");
        Map<String, Integer> result1 = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            if (frequency == 1) {
                result1.put(each, frequency);
            }
        }

        System.out.println(result1);

        System.out.println("---------------------1---------------------");

        String str2 = "aabcccdeeeef"; // Finding the unique character by using indexOf/lastIndexOf equality
        int frequency = 0;
        Map<Character, Integer> result2 = new LinkedHashMap<>();

        for (int i = 0; i < str2.length(); i++) {
            if (str2.indexOf(str2.charAt(i)) == str2.lastIndexOf(str2.charAt(i))) {
                frequency = 1;
                result2.put(str2.charAt(i), frequency);
            }
        }

        System.out.println(result2);


    }

}
/*
 Write a program that can find the unique characters from a String
			Ex:
					str = "aabcccdeeeef";
			output:
					{b=1, d=1, f=1}
*/