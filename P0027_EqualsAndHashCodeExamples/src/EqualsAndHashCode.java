public class EqualsAndHashCode {

    /*
    If two objects are equals according to equals() method, then their hashcode must be same but reverse is not true
    i.e. if two objects have same hashcode then they may/may not be equals.
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Aritra");
        StringBuffer sb2 = new StringBuffer("Aritra");

        System.out.println("sb.equals(sb2): " + sb.equals(sb2));

        System.out.println("hashcode of sb = " + sb.hashCode());
        System.out.println("hashcode of sb2 = " + sb2.hashCode());

        String s1 = "Aritra";
        String s2 = "Aritra";

        //This is happening as both s1 an s2 is pointing to the same object in the String pool on the heap
        //also String class has overridden both equals and hashcode

        System.out.println("hashcode of s1 = " + s1.hashCode());
        System.out.println("hashcode of s2 = " + s2.hashCode());

        System.out.println("s1.equals(s2): " + s1.equals(s2));

    }
}
