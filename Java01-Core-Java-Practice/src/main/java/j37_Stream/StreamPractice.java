package j37_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list1 = list1.stream().distinct().collect( Collectors.toList());
        System.out.println(list1);

        System.out.println("---------------------1---------------------");

        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana"};
        array=(String[]) Arrays.stream(array).distinct().toArray(String[]::new);
        //String[] result = (String[]) Arrays.stream(array).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        System.out.println("---------------------2---------------------");

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().skip(3).toArray();
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------------3---------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("---------------------4---------------------");

        int[] nums2 =  {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();
        System.out.println(Arrays.toString(nums2));

        System.out.println("---------------------5---------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());
        System.out.println(list3);

        System.out.println("---------------------6---------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());
        System.out.println(list4);

        System.out.println("---------------------7---------------------");

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days =  days.stream().map( p -> p.substring(0, 3) ).collect(Collectors.toList());
        System.out.println(days);

        System.out.println("---------------------8---------------------");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());
        System.out.println(evens);

        System.out.println("---------------------9---------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();
        System.out.println(countJava);
        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p));

        System.out.println("---------------------10---------------------");

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1 = list6.stream().allMatch(p -> p%2==0);
        System.out.println(r1);
        boolean r2 = list6.stream().anyMatch(p-> p>8);
        System.out.println(r2);
        boolean r3 = list6.stream().noneMatch(p->p%3==0); // All of them need to be evenly divisible by 3 in order to return true
        System.out.println(r3);


    }


}