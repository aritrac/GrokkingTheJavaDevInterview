public class ConcurrentHashMapDemo {
    /*
    - concurrent hash map is internally divided into segments, by default size is 16 that means, at max
    16 threads can work at a time
    - unlike hashtable, the entire map is not locked while reading/writing from the map
    - in concurrenthashmap, concurrent threads can read the value without locking
    - for adding or updating the map, the lock is obtained on segment level, that means each thread can work on
    each segment during high concurrency
    - concurrency level defines a number, which is an estimated number of threads concurrently accessing the map
    - concurrenthashmap does not allow null keys or null values
    - put() method acquires lock on the segment
    - get() method returns the most recently updated value
    - iterators returned by concurrenthashmap are fail safe and never throw concurrentmodificationexception
    - both HashMap and HashSet does not preserve insertion order, for that we need LinkedHashMap and LinkedHashSet
     */
}
