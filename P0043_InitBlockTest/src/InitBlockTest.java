public class InitBlockTest {
    public static void main(String[] args) {
        new TestInit();
    }
}

class TestInit {
    {
        System.out.println("init block called");
    }
    TestInit(){
        System.out.println("default constructor called");
    }
}
