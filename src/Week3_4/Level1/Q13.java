package Week3_4.Level1;

import java.util.Scanner;

public class Q13 {
    static int formula(int num)
    {
        int sum=((num)*(num+1))/2;
        System.out.println("Using Formula - n(n+1)/2, Sum = "+sum+"\n");
        return sum;
    }
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int i,num,sum=0;
            System.out.print("Enter the Number : ");
            num=sc.nextInt();
            if(num>0)
            {
                for(i=1;i<=num;i++)
                    sum+=i;
                System.out.println("Using Loop, Sum = "+sum);
                if(formula(num)==sum)
                    System.out.println("Sum using both methods is same !");
            }
            else
                System.out.println("Not a Natural Number!");
        }
    }
}
