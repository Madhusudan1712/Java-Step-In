package java_programming.exercises;

//program to get a number from the user and print whether it is positive or negative.

//Test Data:
//Input number: 35
//Expected Output :
//Number is positive

import java.util.Scanner;

public class P0 {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        System.out.print("Enter the number: ");
        double userNum=userInput.nextDouble();
        if(userNum>=0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
