import java.util.Scanner;
public class MaxValue4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int a = sc.nextInt();
        System.out.println("Enter num2:");
        int b = sc.nextInt();
        System.out.println("Enter num3:");
        int c = sc.nextInt();
        int max = a > b ? a : b;
        int res = (max > c) ? max : c;
    }
}