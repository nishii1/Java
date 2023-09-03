//Write a  Java program to read command line of same type and to print the string which are having the lenth of three multipules
public class Question9 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum of command line" + sum);
    }
}