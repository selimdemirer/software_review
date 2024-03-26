package j12_WhileLoop_DoWhileLoop;

public class LoopPractises {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        int j=1; // initialization must be out of the while loops
        while (j<=10){
            System.out.println(j);
            j++; // Iterator must be given at the very end in while loops
        }

        System.out.println("--------------------");

        int k=1; // initialization must be out of the do-while loops
        do {
            System.out.println(k);
            k++; // Iterator must be given at the very end in do-while loops
        }while (k<=10);

    }
}
