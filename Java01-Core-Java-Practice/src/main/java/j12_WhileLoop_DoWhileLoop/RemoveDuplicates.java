package j12_WhileLoop_DoWhileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC"; // given

        String result = ""; // "ABC"

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+ str.charAt(i); // "A" , "A", "B", "B", "C", "C"
            if (result.contains(ch)){ // or result.contains(""+ch)
                continue; // skips
              //break;    // exits
            }
            result += ch;
        }

        System.out.println(result);

    }
}
