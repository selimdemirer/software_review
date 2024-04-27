package j27_Encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
        // p1.name = "Daniel";  // Since I am using encapsulation, I need to use setter. (Name & age are private instance variables. So I cannot set them without setter method)
        // p1.age = 28;
        p1.setName("Daniel");
        p1.setAge(28);

        //System.out.println(p1.name+" : "+p1.age); // Since I am using encapsulation, I need to use getter (Name & age are private instance variables. So I cannot retrieve them without getter method)
        System.out.println(p1.getName() + " : " + p1.getAge());


    }

}
