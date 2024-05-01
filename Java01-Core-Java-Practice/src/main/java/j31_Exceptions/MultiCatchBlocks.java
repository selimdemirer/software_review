package j31_Exceptions;

import j29_Encapsulation_Inheritance.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getSalary()); // Null Pointer Exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Second catch block");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Fourth catch block");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }

        System.out.println("Test Completed");

        System.out.println("---------------------1---------------------");

        try {
            System.out.println("Java".charAt(-1));
        } catch (RuntimeException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }


    }

}