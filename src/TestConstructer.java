public class TestConstructer {
    TestConstructer(int n, String str)
    {
        System.out.println("Constructor eith two parameters is invoked!!");
        int num=n;
        String name=str;

    }
    TestConstructer(int n, String str,char i)
    {
        System.out.println("Constructor with three parameters is invoked!!");
        int num=n;
        String name = str;
    }
    public static void main(String args[])
    {
        TestConstructer tc = new TestConstructer(12,"Prince");
        TestConstructer tc2 = new TestConstructer(15,"Nishi",'k');
    }
}
