//If number is 3 then type my fav , if number is 5 then type your fav if number is 3 & 5 then type our fav or if number is other then type not fav

import java.util.Scanner;
public class Question4 {
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num%3==0 && num%5==0)
        {
            System.out.println("Our Fav");
        }
        else if (num%3==0)
        {
            System.out.println("My fav");
        }
        else if (num%5==0)
        {
            System.out.println("Your Fav");
        }
        else
        {
            System.out.println("Not Fav");
        }
    }
}
