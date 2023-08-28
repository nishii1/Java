public class MethodOverloading {
    static int add(int a , int b)
    {
        return(a+b);
    }
    static float add(int a , float b)
    {
        return(a+b);
    }
    static float add(float a , int b)
    {
        return(a+b);
    }
    static float add(float a , float b)
    {
        return(a+b);
    }
    static float add(int a , int b , int c)
    {
        return(a+b+c);
    }
    public static void main(String args[])
    {
        System.out.println("Sum of two Integers:"+add(2,5));
        System.out.println("Sum of float and int:"+add(2.5f,5));
        System.out.println("Sum of int and float:"+add(2,2.5f));
        System.out.println("Sum of float and float:"+add(2.3f,5.6f));
        System.out.println("Sum of three integers:"+add(2,3,9));

    }
}
