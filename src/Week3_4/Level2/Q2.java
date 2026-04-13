package Week3_4.Level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            double bonus,salary; int year;
            System.out.print("Enter Salary : ");
            salary=sc.nextDouble();
            System.out.print("Enter year if service : ");
            year=sc.nextInt();
            if(year>5)
            {
                bonus=salary*0.05;
                System.out.println("Bonus Amount : "+bonus);
                System.out.println("Total Salary : "+(salary+bonus));
            }
            else
                System.out.println("No Bonus !");
        }
    }
}
