/*
public class StaticBinding9 {
    private void display() {
        System.out.println("Hello..");
    }

    public static void main(String[] args) {
        StaticBinding9 sb = new StaticBinding9();
        sb.display();
    }
*/
class A {
    private int a;
    private String name;
    protected void show()
    {
        System.out.println("Hi..");

    }
}

class B extends A {
    public static void main(String[] args) {
        A obj =new B();
        obj.show();
    }
}


