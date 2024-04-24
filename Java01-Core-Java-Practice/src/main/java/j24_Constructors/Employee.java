package j24_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        // this.name=name;
        this(name);
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        // this.name=name;
        // this.gender=gender;
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        // this.name=name;
        // this.gender=gender;
        // this.jobTitle=jobTitle;
        this(name, gender, jobTitle);
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }
}
