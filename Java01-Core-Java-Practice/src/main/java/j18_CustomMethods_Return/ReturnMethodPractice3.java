package j18_CustomMethods_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {

        // finding unique character

        String str = "aabccdee";
        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));
            if (frequency == 1) {
                System.out.println(str.charAt(i));
            }
        }

    }

    //                              "aaa"      'a'
    public static int frequency(String str, char ch) {

        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;

    }


}