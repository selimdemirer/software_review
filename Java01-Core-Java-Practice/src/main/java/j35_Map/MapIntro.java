package j35_Map;

public class MapIntro {

/*

    Data Structures: Work with multiple data

	    • Array (Supports both primitives & non-primitives)
	    • Collection (Supports non-primitives ONLY)
	    • Map (Collection of Pairs)

    Map (I): Map is an interface
	         Pairs of collection
	         Does not have IS A relation with Collection
	         Does not support primitives
	         Size is dynamic
	         Key MUST be unique, value can be duplicated
	         Keeps the last pair of object among the duplicated keys

		HashMap (C): Both key and value can be null
		             Maintains the random order
			         Fastest performance, less memory than others

		LinkedHashMap (C): Both key and value can be null
				           Maintains the insertion order

		TreeMap (C): Key cannot be null, but value can be null
			         Maintains the sorted order (ascending)

		Hashtable (C): Both key and value can NOT be null
			           Maintains the random order
			           Synchronized

    Methods of Map:
		put(key, value): inserts the given key and value to map

		putAll(): adds one map to another

		get(key): returns the value of the given key

		replace(key, newValue): replaces the value of the given key with the given new value (also we can use "put")

		remove(key): removes the given key and its value from the map

        remove(key, value): it returns "boolean"

		containsKey(key): returns true if the given key is contained in the map, otherwise returns false

		containsValue(Value): returns true if the given value is contained in the map, otherwise returns false

		isEmpty(): returns true if the size of the map is 0, otherwise returns false

		equals(Map): returns true if the given Map is equal with the current map, otherwise returns false

		clear(): removes all the pairs from the map

		-----------------------------------------------------------------------------

		keySet(): returns all the keys of the map, returnType is Set

		values(): returns all the values of the map, returnType is Collection

		entrySet(): returns all the entries (Entry: key & value) of map

				getkey()
				getValue()
				setValue()

*/

}
