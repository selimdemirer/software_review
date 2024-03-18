package j09_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state name");
        String stateName = input.next();

        System.out.println("Enter your zip code");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country name");
        String country = input.nextLine();


        System.out.println(fullName+" "+buildingNumber+" "+streetName+" "+cityName+" "+stateName+" "+zipCode+" "+country);

        input.close();


/*
1. Enter your full name ----- nextLine()
2. Enter your building number ----- next()

nextLine() (Because we need to clear out scanner memory)

3. Enter your street name ----- nextLine()
4. Enter your city name ----- nextLine()
5. Enter your state name ----- next()
6. Enter your zip code ----- next()

nextLine() (Because we need to clear out scanner memory)

7. Enter your country name ----- nextLine()

Display the shipping address

 */







    }
}
