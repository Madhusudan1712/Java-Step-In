package java_programming.J01_coreJava;

import java.util.Scanner;

public class J6_if_else {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your CRPA to know your grade: ");
        int CGPA = userInput.nextInt();

        if(CGPA>=7 && CGPA<=9){
            System.out.println("Result: B Grade");
        }
        else if (CGPA>=9 && CGPA<=10) {
            System.out.println("Result: A Grade");
        }
        else {
            System.out.println("Result: Fail");
        }
    }
}
