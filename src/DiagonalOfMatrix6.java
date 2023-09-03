import java.util.Scanner;

class DiagonalOfMatrix6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the no.of columns:");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            System.out.println("Enter the elements of row-" + i);
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements in array are:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int s = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == mat[i][i]) {
                    s += mat[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal Elements:" + s);
    }
}