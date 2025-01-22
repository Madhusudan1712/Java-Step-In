package java_programming.J01_coreJava;

import java.util.Scanner;

public class J32_Recursion {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number :");
        int num = userInput.nextInt();
        int result = sum(num);
        System.out.println("Adding all of the numbers up to "+num);
        System.out.println("Result :"+result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 2);
        } else {
            return 0;
        }
    }
}