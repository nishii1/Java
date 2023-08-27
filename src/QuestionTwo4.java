import java.util.Scanner;
public class QuestionTwo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Prime factors of " + num + ": ");
        printPrimeFactors(num);
    }
    public static void printPrimeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
