/*
Let's suppose 2 threads are working on this class and both threads are running on different processors having their
own local copy of variable x. If any thread modifies its value, the change will not be reflected back in the original
variable x in the main memory leading to data inconsistency because the other thread is not aware of the modification.
So, to prevent data inconsistency, we can make variable x as volatile.
Now, all the threads will read and write the variable x from/to the main memory. Using volatile, also prevents
 compiler from doing any reordering or any optimizations to the code.
 */
public class Test {
    static volatile int x = 10;
}
/*
Garbage collection in java is the process of looking at heap memory, identifying which objects are in use and which are
not and deleting the unused objects. An unused object or unreferenced object, is no longer referenced by any part of your
program. Garbage collector is a daemon thread that keeps running in the background, freeing up heap memory by destroying
the unreachable objects. There was an analysis done on several applications which showed that most objects are short lived,
so this behavior was used to improve the performance of JVM. In this method, the heap space is divided into smaller parts
or generations. These are, Young Generation, Old or Tenured Generation and Permanent Generation. The Young Generation is
where all new objects are allocated and aged. The young generation is further divided into 3 parts: Eden Space, Survivor
space S0 and Survivor space S1. When the young generation fills up, this causes a minor garbage collection. Some surviving
objects are aged and eventually move to the old generation. All minor garbage collections are "Stop the World" events.
This means that all application threads are stopped until the operation completes. Minor garbage collections are always
Stop the World events. The Old Generation is used to store long surviving objects. Typically, a threshold is set for
young generation object and when that age is met, the object gets moved to the old generation. Eventually the old
generation needs to be collected. This event is called a major garbage collection. Major garbage collection are also
Stop the World events. Often a major

 */
