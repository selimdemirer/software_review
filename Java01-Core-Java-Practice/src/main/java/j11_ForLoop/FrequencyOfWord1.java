package j11_ForLoop;

public class FrequencyOfWord1 {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJava"; // given

        int frequency = 0;
                      //i < str.length()-3
        for (int i = 0; i <= str.length()-4; i++) { // in order not to get "index out of ban", we limited "i" by subtraction
            String eachSub = str.substring(i,i+4);
            if (eachSub.equals("Java")) frequency++;
        }

        System.out.println("frequency = " + frequency);

    }
}
/*
write a program that can return the frequency of the word Java from the sentence

        Ex:     sentence = "JavaJavaJava";

                output: 3


        Ex:  	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4)
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */