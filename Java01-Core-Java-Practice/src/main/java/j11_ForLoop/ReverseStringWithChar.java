package j11_ForLoop;

public class ReverseStringWithChar {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        char reversed; // We don't need to initialize char!

        for (int i = str.length()-1; i >=0; i--) { // i = last index number ; condition = loop should continue until include first index number 0
            reversed = str.charAt(i);
            System.out.print(reversed); // NOT println!
        }

    }

}
/*
Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */