package j31_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        try {
            System.out.println("Try Block");
            System.out.println(arr[10]);
        } catch (NullPointerException e) {
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0); // If I catch the exception here (If I use RunTimeException) finally block won't be executed
        } finally {
            System.out.println("Finally Block");
        }


    }

}