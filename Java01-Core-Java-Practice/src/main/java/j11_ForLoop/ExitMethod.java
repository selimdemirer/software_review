package j11_ForLoop;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i==3){
//              break;            // terminates the loop:                          0 1 2 Wooden Spoon
//              continue;         // terminates the current iteration of the loop: 0 1 2 4 Wooden Spoon
              System.exit(0);   // terminates the program from now on:           0 1 2
            }
            System.out.print(i+" ");
        }

        System.out.println("Wooden Spoon");


    }
}
