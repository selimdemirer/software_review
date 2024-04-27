package j27_Encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Tatiana",'F',28,110000);

        System.out.println("emp1 = " + emp1);

        emp1.setAge(30);

        System.out.println("emp1 = " + emp1);

        Employee emp2 = new Employee("",'F',17,120000);

        System.out.println("emp2 = " + emp2);

        System.out.println("emp2 age = " + emp2.getAge());


    }

}
