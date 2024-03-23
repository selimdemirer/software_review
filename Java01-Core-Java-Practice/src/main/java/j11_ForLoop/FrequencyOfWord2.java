package j11_ForLoop;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String str = "Cat Cat Dog Dog cAt CAT caT"; // given

        int frequency = 0;
                       //i < str.length()-2
        for (int i = 0; i <= str.length()-3; i++) { // in order not to get "index out of ban", we limited "i" by subtraction
            String eachSub = str.substring(i,i+3);
            if (eachSub.equalsIgnoreCase("cat")) frequency++;
        }

        System.out.println("frequency = " + frequency);

    }
}
