package Week3_4.Level1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Q8 {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the Coutdown Start Point : ");
            int counter=sc.nextInt();
            while(counter>0)
            {
                System.out.println(counter);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                counter--;
            }
        }
    }
}
