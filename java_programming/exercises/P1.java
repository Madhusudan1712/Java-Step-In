package java_programming.exercises;
//program to solve quadratic equations (use if, else if and else).

//Test Data
//how many input numbers: 3
//Input num1: 1
//Input num2: 5
//Input num3: 2
//Expected Output :
//The 1st greatest: 5
//The 2nd greatest: 2
//The 3rd greatest: 1

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        System.out.print("How many input numbers:");
        int inputCount = userInput.nextInt();

        //array to store the user input
        String[] userNum = new String[inputCount];

        for (int i=1; i<=inputCount; i++){
            System.out.println(" ");
            System.out.print("Input "+i+": ");
            double inputValue =userInput.nextDouble();
            userNum[i-1]= Double.toString(inputValue);

            System.out.print("Input inserted to list: ");
            for(int j=1; j<=i; j++) {
                if(j==inputCount){
                    System.out.print(userNum[j - 1]);
                }
                else {
                    System.out.print(userNum[j - 1]+", ");
                }
            }
        }
    }
}
