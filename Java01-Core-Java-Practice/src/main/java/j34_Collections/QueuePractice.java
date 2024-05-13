package j34_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90, 200));

        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer> arrayDeque = new ArrayDeque<>(); // I can also use Deque<Integer>
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90, 200));

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90, 200));

        System.out.println("linkedList = " + linkedList);

        System.out.println("---------------------1---------------------");

        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);

        linkedList.poll();

        System.out.println("linkedList = " + linkedList);

        System.out.println("---------------------2---------------------");

        // System.out.println(priorityQueue.get(1)); // Queue does not have index
        // System.out.println(arrayDeque.get(1));    // Queue does not have index
        // System.out.println(linkedList.get(1));    // Queue does not have index

        System.out.println(((List<?>) linkedList).get(1)); // Queue does not have index. But I cast it to List
        System.out.println(((LinkedList<?>) linkedList).get(1)); // Queue does not have index. But I cast it to LinkedList


    }

}