package j12_WhileLoop_DoWhileLoop;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {

            if (i == 'C'){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("---------------------1---------------------");

        // print all even numbers 1~10
        for (int i = 1; i <= 10; i++) {

            if (i%2 != 0){
                continue; // it means skip the odd numbers
            }
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("---------------------2---------------------");

        // print all odd numbers 1~10
        for (int i = 1; i <= 10; i++) {

            if (i%2 == 0){
                continue; // it means skip the even numbers
            }
            System.out.print(i+" ");
        }


    }

}
