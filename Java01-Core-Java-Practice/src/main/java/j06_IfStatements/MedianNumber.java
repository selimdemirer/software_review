package j06_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
            b = 20,
            c = 30;

        boolean aIsMedian = a<b && a>c || a<c && a>b;
        /*
        in order for a to be the median number;
                 1. if c is the minimum number & b is the maximum number, then a is the median number
                 or
                 2. if b is the minimum number & c is the maximum number, then a is the median number
         */
        boolean bIsMedian = b<c && b>a || b<a && b>c;
        boolean cIsMedian = c<a && c>b || c<b && c>a; // !aIsMedian && !bIsMedian

        if (aIsMedian){
            System.out.println(a + " is the median number");
        }
        if (bIsMedian){
            System.out.println(b + " is the median number");
        }
        if (cIsMedian){
            System.out.println(c + " is the median number");
        }
    }
}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number

			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */