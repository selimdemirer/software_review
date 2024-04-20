package j17_CustomMethods_Void;

public class CustomMethodsWIthParameters { // the method demands additional info to complete its task

    public static void main(String[] args) {

        oddOrEven(5);
        ageOfPerson(1986);
        printNumbers( 100, 120);

    }

    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){ // 10
        if(number % 2 == 0){
            System.out.println(number +" is even number");
        }else{
            System.out.println(number +" is odd number");
        }
    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2024 - birthYear;
        System.out.println("Your age is: "+age);
    }

    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        for (int i = x; i < y+1; i++) {
            System.out.print(i+" ");
        }
    }


}