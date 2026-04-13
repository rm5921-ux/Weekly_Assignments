package Week3_4.Level1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            double num, total=0.0;
            num=sc.nextDouble();
            total+=num;
            while(num!=0)
            {
                num=sc.nextDouble();
                total+=num;
            }
            System.out.println("Total = "+total);
        }
    }
}
