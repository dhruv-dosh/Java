package Java;

public class a40_java_hashing {
    public static void main(String[] args) {
        /*
        prestoring and fetching

        1. Number Hashing (frequency problem how many times no. appeared(use array to store count of number appeared then answer)).
        2. char Hashing. (use array to store count of char using ascii appeared then answer)
        we can have only 10^6 int arr inside main and 10^7 globally.
        globally, everything is initialized as 0;
        if we use an array for hashing, it will only ue 10^7 space, So we use hashmap in this case.
        */
        /*
        In Java, a Map is part of the java.util package and is used to store data in key-value pairs. It is not a part of the Collection framework but is considered a part of Java's collections. Each key is unique, and a key maps to one value. Some key points about the Map interface:

Key Features:
Key-Value Pair Storage: Each key is associated with a single value.
No Duplicate Keys: Keys must be unique, but values can be duplicated.
Common Implementations:
HashMap: Unordered, fast, allows one null key and multiple null values.
LinkedHashMap: Ordered by the insertion order.
TreeMap: Ordered by the natural ordering of keys or a custom comparator.
Hashtable: Synchronized, does not allow null keys or values.
Commonly Used Methods:
put(K key, V value): Adds a key-value pair to the map.
get(Object key): Retrieves the value associated with the specified key.
remove(Object key): Removes the mapping for the specified key.
containsKey(Object key): Checks if the map contains a specified key.
containsValue(Object value): Checks if the map contains a specified value.
keySet(): Returns a Set of all the keys in the map.
values(): Returns a Collection of all the values in the map.
entrySet(): Returns a Set of all the key-value pairs (as Map.Entry objects).

         */
    }
}
