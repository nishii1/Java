class Parent2 {
    int drb=15;
    String name = "Prince";

    float cgpa(float grade)
    {
        return grade;
    }
}
class Parent3 extends Parent2
{
    int id=213;
    String branch="aiml";

}

class Child extends Parent2 {
    public static void main(String args[]) {
        Parent2 p = new Parent2();
        Child c = new Child();
        System.out.println(p.name);

        System.out.println(p.cgpa(9.7f));
        System.out.println(c.cgpa(9.7f));
    }

}
