package j34_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //  remove all the elements that are less than 4

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("---------------------1---------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator(); // before lambda expression was introduced we had to use this iterator method

        /*
        boolean r1 = it.hasNext();

        System.out.println(r1);

        System.out.println(it.next());

        boolean r2 = it.hasNext();

        System.out.println(r2);

        System.out.println(it.next());
        */

        while(it.hasNext()){
            if( it.next()  < 4 ){
                it.remove();
            }
        }

        System.out.println(list2);

        System.out.println("---------------------2---------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for( Iterator<Integer> i=list3.iterator() ; i.hasNext() ; ){  // before lambda expression was introduced we had to use this iterator method
            if(i.next() < 4 ){
                i.remove();
            }
        }

        System.out.println(list3);

        System.out.println("---------------------3---------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf( each ->  each < 4 ); // using this removeIf method is exactly same with using iterator

        System.out.println(list4);


    }

}