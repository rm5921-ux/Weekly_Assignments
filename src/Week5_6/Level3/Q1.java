package Week5_6.Level3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] freq = new int[10];
        num = Math.abs(num);
        while (num != 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
        sc.close();
    }
}
