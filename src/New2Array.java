import java.util.Scanner;

class New2Array {
    int mainValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter array elements:");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        New2Array obj = new New2Array();
        System.out.println("Min value in Array:" + obj.mainValue(arr));
    }
}