package j35_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key     value
        Map<Integer, String> hashMap = new HashMap<>(); // Random order, accepts "null" both Key and Value
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella"); // After this line, Ahmet will be removed
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya"); // There must be only one "null" key, the last one will be kept: Hulya

        System.out.println("hashMap = " + hashMap);

        // System.out.println(hashMap.get());

        System.out.println("---------------------1---------------------");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // Insertion order, accepts "null" both Key and Value
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, null);
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, null); // After this line, Ahmet will be removed
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("---------------------2---------------------");

        Map<Integer, String> treeMap = new TreeMap<>(); // Sorted order, accepts "null" as a Value but NOT as a Key
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(7, null);

        System.out.println("treeMap = " + treeMap);

        System.out.println("---------------------3---------------------");

        Map<Integer, String> hashtable = new Hashtable<>(); // Random order, does NOT accept "null" both Key and Value
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        // hashtable.put(null, null);

        System.out.println("hashtable = " + hashtable);


    }

}
