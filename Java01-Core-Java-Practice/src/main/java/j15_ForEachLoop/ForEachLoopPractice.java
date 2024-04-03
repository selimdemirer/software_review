package j15_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words){
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1)); // in order to convert this statement to a concatenation (not an addition) we need to add "".
            // System.out.println(each.charAt(0)+""+each.charAt(each.indexOf(" ")+1));
        }


    }
}
