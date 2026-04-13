package Week3_4.Level1;

import java.util.Scanner;

public class Q6 {
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter a number : ");
            float number=sc.nextFloat();
            if(number>0)
                System.out.println("Positive");
            else if(number<0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }
    }
}