package j15_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        double sum = 0; // 10+20+30...

        for (int number : numbers) {
            sum += number;
        }

        double average = sum/numbers.length;

        System.out.println("average = " + average);


    }

}
