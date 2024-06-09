public class GenericDemo {
    public static void main(String[] args) {
        Test<String> t1 = new Test<>("Mark"); //Using the same algorithm with String type with the help of Generics
        System.out.println(t1.getObj());

        Test<Integer> t2 = new Test<>(10); //Using the same algorithm with String type with the help of Generics
        System.out.println(t2.getObj());
    }
}
