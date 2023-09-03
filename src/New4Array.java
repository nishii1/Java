import java.util.Scanner;

public class New4Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = scan.nextInt();
        System.out.println("Enter no of columns");
        int m = scan.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter row" + i + "elements");
            for (int j = 0; j < m; j++) {
                mat[i][j] = scan.nextInt();

            }
        }
        System.out.println("Matrix elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}