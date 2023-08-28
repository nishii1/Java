public class Student {
    int n;
    String str="Nishi";
    char c='N';
    static int num=25;
    static String name="Prince";
    static char ch='M';
    void display()
    {
        System.out.println("This is display method!!");
    }
    static void show(){
        System.out.println("This is static method inside the class..!!");
    }

    public static void main(String args[])
    {
        Student s = new Student();
        System.out.println("Calling non static variables ");
        System.out.println(s.n);
        System.out.println(s.str);
        System.out.println(s.c);
        s.display();
        System.out.println("Calling static attributes:");
        System.out.println(num);
        System.out.println(name);
        System.out.println(ch);
        show();
    }
}
