
import java.util.Scanner;

public class New3Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        String[] arr = new String[size];
        New3Array obj = new New3Array();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLine();
        }
        System.out.println("String in array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
}