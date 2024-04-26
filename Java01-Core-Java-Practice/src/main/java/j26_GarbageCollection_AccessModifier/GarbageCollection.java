package j26_GarbageCollection_AccessModifier;

import j23_CustomClass.Dog;
import j24_Constructors.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

/*
Garbage Collection: Collection of unreferenced objects

		unreferenced objects:
			1. null keyword:
					String str = "Java";
					str = null;

			2. creating a new object
					String str = "Java";
					str = "Python";

Garbage Collector: responsible for collecting the unreferenced objects from java heap. and destroys it ( finalize())
*/

    public static void main(String[] args) {
        /*
        //  int n = null;
       String str = null;
        System.out.println( str.toUpperCase() );
         */

        String str = "Wooden Spoon";
        str = null; // after this line, "Wooden Spoon" will be eligible for garbage collection

        System.out.println(str);

        System.out.println("---------------------1---------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max"; // "Lucy" is eligible for garbage collection

        System.out.println(dog1);

        String language = "Python";
        language = "Java"; // "Python" is eligible for garbage collection

        System.out.println(language);

        System.out.println("---------------------2---------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1 == list2); // list1 and list2 are not eligible for garbage collection. Because there is only one object created and they are pointing out same object. Object is a room, reference names are doors!

        System.out.println("---------------------3---------------------");

        Student student1 = new Student("Tahir", 'A', 30, 14, 'B');
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1 == student2); // student1 and student2 are not eligible for garbage collection.

        System.out.println("---------------------4---------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println(l1==l2); // l1 and l2 are not eligible for garbage collection.


    }

}