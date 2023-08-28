public class TestConstructor {
    TestConstructor()
    {
        System.out.println("Constructor is invoked!!");
        int n=15;
        char c='k';
        System.out.println("Class variables are initialized:");
        System.out.println(n);
        System.out.println(c);
    }
    public static void main(String args[])
    {
        TestConstructor tc = new TestConstructor();
    }
}
