import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }

        if (reverse == temp) {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
    }
}
