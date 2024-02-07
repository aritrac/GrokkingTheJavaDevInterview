public class StringBuilderAndStringBufferDemo {
    public static void main(String[] args) {
        //both StringBuffer and StringBuilder is mutable unlike String which is immutable due to the following reasons
        //1. Caching Strings will lead to unique hashcode always, hence caching performance will be better
        //2. Security of strings are better as no hacker can change its content for intentional damage
        //3. During class load, the correct class string can be specified, so the hacker cannot change it and load something else
        //4. Multithread safe, as it can be safely shared across multiple threads

        //StringBuffer is threadsafe, it has synchronized access
        StringBuffer sb = new StringBuffer(); //String buffer is thread safe, hence slower
        sb.append("Ari");
        sb.append("tra");
        System.out.println(sb);

        //StringBuilder is not threadsafe, it can be changed by multiple threads asynchronously
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Chatt");
        sb2.append("erjee");
        System.out.println(sb2);
    }
}
