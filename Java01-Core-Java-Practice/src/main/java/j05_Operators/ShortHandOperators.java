package j05_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
        
        //Assignment: = updating the value
        int number = 100;
        System.out.println(number);//it is 100 for now
        number = 200;
        System.out.println(number);//it is 200 anymore
        
        String word = "Java Programming";
        System.out.println(word);//Java Programming
        
        word= "Wooden Spoon";
        System.out.println(word);//Wooden Spoon

        /*
        REMEMBER: Java executes the codes from top to bottom and left to right. Compiler checks that
        "when was the last time this variable was initialized". And then it uses "the last value"
        that assigned to the variable.
         */

        //Addition Assignment
        int x =100;
        System.out.println("x = " + x);
        System.out.println(x+200); //output 300
        System.out.println("x = " + x);//but x is still 100

        //x = x + 200;
        x += 200;
        System.out.println("x = " + x);//x=300

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);//str=Wooden Spoon

        double num1 = 2.5;
        System.out.println("num1 = " + num1);//2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1);//num1 is 8.0

        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance); //1300.5$

        System.out.println("---------------------------------------------");

        //Subtraction Assignment

        //withdrawing 500$
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);//800.5$

        //withdrawing 200$, then depositing 400$
        availableBalance-=200;//600.5
        availableBalance +=400; //1000.5$
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("---------------------------------------------");

        //Multiplication Assignment

        double salary = 50000.50;
        salary *= 2; // salary = salary * 2
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("dodge = " + doge);

        System.out.println("----------------------------------------------");

        //Division Assignment

        double num2 = 25000;
        num2 /= 2 ; // num2 = num2 / 2;
        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------------------");

        //Remainder Assignment

        double num3 = 100;

        num3 %= 3; // %=
        System.out.println("num3 = " + num3);

        System.out.println("-----------------------------------------");

        int amount =127; //cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-----------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("-----------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);













        }
























        
    }

