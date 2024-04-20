package j12_WhileLoop_DoWhileLoop;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;

        for (int i = 0; a;) {
            System.out.println("Wooden Spoon -- for loop");
        }

        System.out.println("---------------------1---------------------");

        while (a) {
            System.out.println("Wooden Spoon -- while loop"); // 0
        }

        System.out.println("---------------------2---------------------");

        do {
            System.out.println("Wooden Spoon -- do-while loop");
        } while (a);


    }

}
