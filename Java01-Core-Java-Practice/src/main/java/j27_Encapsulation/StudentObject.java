package j27_Encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Daniel", 29, 'M', 'D', "MIT");
        student1.setAge(39);

        System.out.println(student1);
        System.out.println(student1.getGrade());
        System.out.println(student1.getSchoolName());
        student1.study();

    }


}