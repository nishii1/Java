import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
}