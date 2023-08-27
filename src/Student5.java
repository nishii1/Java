public class Student5 {
    // Instance variables
    String name;
    int age;
    int id;
    public String getInfo() {
        return ("Name: " + name + "\nAge is: " + age + "\nID is: " + id);
    }
    public static void main(String[] args)
    {
        Student5 Khushi = new Student5();
        Khushi.name = "Khushi";
        Khushi.age = 18
        ;
        Khushi.id = 1234245;
        System.out.println(Khushi.getInfo());
    }
}