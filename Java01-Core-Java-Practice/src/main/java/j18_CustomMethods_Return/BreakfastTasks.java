package j18_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("cydeo", "school");

        System.out.println("----------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------");

        nameOfMonth(3);

        nameOfDay(4);

        daysInMonth(3);

    }

    //1. Create a method that can display the initials of the person.
    public static void initials(String firstName, String lastName) {

        String initial = firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0);
        System.out.println("initial = " + initial);

    }


    //2. Create a method that can display the domain of the email.
    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {  // 95

        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

        } else {
            name = "Invalid";
        }

        System.out.println("Month Name = " + name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {

        String result = "";

        if (number < 1 || number > 7) {
            result = "Invalid";
            return;
        }

        result = (number == 1) ? "monday" : (number == 4) ? "thursday" : (number == 3) ? "wednesday" : (number == 4) ? "thursday" : (number == 5) ? "friday" : (number == 6) ? "saturday" : "sunday";

        System.out.println("Day Name Of " + number + ". Day Of The Week = " + result);

    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number) {

        String result = "";

        if (number < 1 || number > 12) {
            result = "Invalid Number";
            return;
        }

        switch (number) {

            case 2:
                result = "28 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;

            default:
                result = "31 days";
        }

        System.out.println("Number Of Days Of " + number + ". Month = " + result);

    }

    // ageGroups(int age)


}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
 */