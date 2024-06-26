package j35_Map;

import java.util.*;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);
        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students);
        System.out.println(students.size());

        System.out.println("---------------------1---------------------");

        // display the score of Alex:
        System.out.println(students.get("Alex"));

        System.out.println("---------------------2---------------------");

        // replace Ali' score to 90
        students.replace("Ali", 90 );

        System.out.println(students);

        System.out.println("---------------------3---------------------");

        students.remove("Alex");

        System.out.println(students);

        students.remove("Ozan");

        System.out.println(students);

        System.out.println("---------------------4---------------------");

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);

        boolean r3 = students.containsValue(97);
        System.out.println(r3);

        System.out.println("---------------------5---------------------");

        System.out.println(students.isEmpty());

        System.out.println("---------------------6---------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 == map2); // false
        System.out.println(map1.equals(map2)); // true

        System.out.println("---------------------7---------------------");

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);


    }

}