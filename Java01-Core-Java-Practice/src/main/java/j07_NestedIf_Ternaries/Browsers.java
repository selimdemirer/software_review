package j07_NestedIf_Ternaries;

public class Browsers {

    public static void main(String[] args) {

        String browserName = "edge";

        String result =""; // Temporary

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" ||
                               browserName == "safari" || browserName == "edge" ;

        if (validBrowser){ // 5 Options

            if (browserName == "chrome"){
                result = "Chrome Browser is selected";
            } else if (browserName == "firefox") {
                result ="Firefox Browser is selected";
            } else if (browserName == "opera") {
                result ="Opera Browser is selected";
            } else if (browserName == "safari") {
                result ="Safari Browser is selected";
            }else {
                result ="Edge Browser is selected";
            }

        }else {
            result = "Invalid Browser Name";
        }

        System.out.println(result);


/*
Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if // When there is a precondition..
 */

    }
}
