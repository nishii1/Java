import java.util.Scanner;
public class SwitchCase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}