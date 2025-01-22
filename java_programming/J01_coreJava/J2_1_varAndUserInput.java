package java_programming.J01_coreJava;

import java.util.Scanner;

public class J2_1_varAndUserInput {
    public static void main(String[] args){
        System.out.print("Enter your name :");
        Scanner nameScanner=new Scanner(System.in);
        var name=nameScanner.nextLine();

        System.out.print("Enter your age :");
        Scanner ageScanner=new Scanner(System.in);
        var age=ageScanner.nextLine();

        System.out.println("Hello "+name+" your age is "+age);
    }
}
