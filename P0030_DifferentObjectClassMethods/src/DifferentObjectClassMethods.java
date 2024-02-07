public class DifferentObjectClassMethods {
    public static void main(String[] args) {
        // Creates and returns a copy of this object
        // protected native Object clone() throws CloneNotSupportedException
        //
        // Indicates whether some other object is "equal to" this one
        // public boolean equals(Object obj)
        //
        // Returns a hash code value for the object
        // public native int hashCode()
        //
        // Returns the runtime class of an Object
        // public final native Class<?> getClass()
        //
        // Returns a string representation of the object
        // public String toString()
        //
        // Called by the garbage collector on an object when garbage collection
        // determines that there are no more references to the object
        // protected void finalize() throws Throwable
        //
        // Wakes up a single thread that is waiting on this object's monitor
        // public final native void notify()
        //
        // Wakes up all threads that are waiting on this object's monitor
        // public final native void notifyAll()
        //
        // Makes the current thread working with this object, wait for sometime
        // public final native void wait(long timeout) throws InterruptedException
        //
        // public final void wait(long timeout, int nanos) throws InterruptedException
        //
        // public final void wait() throws InterruptedException
    }
}
