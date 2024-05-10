package j34_Collections;

public class CollectionsIntro {

/*

    Data Structures: Work with multiple data

	    • Array (Supports both primitives & non-primitives)
	    • Collection (Supports non-primitives ONLY)
	    • Map (Collection of Pairs)

    Array:
    • Size is fixed
	• Supports both primitives & non-primitives

    Collection (I):
    • Collection is a group of individual objects as a single entity
    • Collection interface is considered as root interface of collection framework
    • Collection interface defines the most common methods which are applicable for any collection object

    Collections:
    • Defines several classes and interfaces which can be used to represent a group of objects as single entity
	• Supports non-primitives ONLY. Can hold different non-primitive data types
    • Growable in nature. Size is dynamic, it is adjusted automatically
    • Standard data structure and there are ready methods to use

			List (I): accepts duplicates, insertion order preserved, has index numbers

					ArrayList (C): internally uses array
								   accessing/retrieving the element is faster ( get() )

					LinkedList (C): internally uses doubly linked list, (implements the Deque interface)
								    adding/removing is faster ( add()/remove() )

					Vector (C): internally uses array
								is Synchronized ==> Thread-safe

					Stack (C): Is synchronized
						       Last in - First out order (LIFO)
						       pop() ===> LIFO

			Set (I): does NOT accept duplicates, does NOT have index

				HashSet (C): order is random / fastest / it does not need to call the methods through the objects

				LinkedHashSet (C): keeps the insertion order as it is / it does not need to call the methods through the objects

				TreeSet (C): keeps the sorted order (Ascending -> 5, 85, 95, 452, 2356)
						     does not accept null / it internally calles the method, so if you give a null object it gives null pointer exception

			 Queue(I): duplicates are allowed
				       insertion order not preserved
				       First in - First out order (FIFO)
                       poll() ===> FIFO

				PriorityQueue (C): implements the Queue interface, maintains the random order, does not accept null

				ArrayDeque (C): implements the Deque interface, maintain the insertion order, accepts null values

				LinkedList (C): Insertion and deletion ( add()/remove() ) are faster than PriorityQueue and ArrayDeque in "LinkedList"; and it does have index number


List                         Queue                            Set
Duplicates are allowed       Duplicates are allowed           Duplicates are not allowed
Insertion order preserved    Insertion order not preserved    Insertion order not preserved
Has index                    Does not have index              Does not have index

• List: If we want to represent a group of individual objects as a single entity where duplicates are allowed, and insertion order preserved
• Queue: If we want to represent a group of individual objects prior to processing
• Set: If we want to represent a group of individual objects as a single entity where duplicates are NOT allowed, and insertion order NOT preserved


Synchronized: multiple threads are being executed one thread at time
			advantage: thread-safe
			disadvantage: slower

process: execution instance of a program

thread: A sequence of execution within process

multi-threading: two or more threads being executed within the process

multi-tasking: two or more process are running

*/

}
