package j11_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        for (int i = 15; i>=15 && i<=45; ++i  ){
            System.out.print(i+"\t");
        }

        System.out.println("\nHello"); // This println is just to show that previous print statement does not append a new line!

        System.out.println("-------------------------");

        // print all the even numbers between 1~55

        for (int i= 1; i<55; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("-----------OR---------");

        for (int i = 2; i <=54; i += 2){
            System.out.print(i+" ");
        }


    }
}
