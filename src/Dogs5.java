public class Dogs5 {
    // Instance variables
    String breed;
    String size;
    int age;
    String color;
    public String getInfo() {
        return ("Breed is: " + breed + "\nSize is: " + size + "\nAge is: " + age + "\nColor is: " + color);
    }
    public static void main(String[] args)
    {
        Dogs5 Julie = new Dogs5();
        Julie.breed = "Gali ka awaara kutta";
        Julie.size = "Pilla hai abhi";
        Julie.age = 5;
        Julie.color = "Black";
        System.out.println(Julie.getInfo());
    }
}
