public class grandparent {
    int age=85;
    String name="Khushi";
    void walk()
    {
        System.out.println("Slow walker");
    }
}
class Parent extends grandparent {
    int favNum = 5;
    String color = "white";

    void looks() {
        System.out.println("Handsome");
    }
}
class Child1 extends Parent {
    int age = 20;
    String edu = "Graduation";

    void fly() {
        System.out.println("child can fly");
    }
}
class Child2 extends Parent {
    float sal = 6345.75f;
    String address = "Greater noida,UP,India";

    void run() {
        System.out.println("runner child2");
    }

public static void main(String[] args)
{
        grandparent gp = new grandparent();
        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        System.out.println("grandparent details");
        System.out.println("Name:"+gp.name);
        System.out.println("Age:"+p.age);
        gp.walk();

        System.out.println("parent Information:");
        System.out.println("favourite number:"+p.favNum);
        System.out.println("Color:"+p.color);
        p.looks();
        p.walk();
    }
}