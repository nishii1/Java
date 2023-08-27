public class Iterative {
    public static void main(String[] args) {
        int i;
        System.out.println("For Loop");
        for (i = 0; i < 5; i++) {
            System.out.println("i");
        }
        System.out.println("While loop");
        i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("Do while Loop");
        i = 0;
        do
        {
            System.out.println(i);
            i++;
        }
        while (i < 5) ;
    }
}