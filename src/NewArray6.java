import java.util.Scanner;

public class NewArray6 {
    int[] readNewArray6(int[] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        NewArray6 obj = new NewArray6();
        arr = obj.readNewArray6(arr);
        obj.printArray(arr);
    }
}