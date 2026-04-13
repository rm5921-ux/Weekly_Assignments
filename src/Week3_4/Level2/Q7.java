package Week3_4.Level2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int i,num;
            System.out.print("Enter the number : ");
            num=sc.nextInt();
            System.out.print("Factors of "+num+" are : ");
            for(i=1;i<num;i++)
                if(num%i==0)
                    System.out.print(i+" ");
        }
    }
}
