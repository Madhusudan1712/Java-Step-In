package java_programming.J01_coreJava;

import java.util.Scanner;

public class J20_inheritance1 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number1: ");
        double num1 = userInput.nextDouble();
        System.out.print("Enter the number2: ");
        double num2 = userInput.nextDouble();

        J20_inheritance3 advanceCal = new J20_inheritance3();

        advanceCal.calculatorType(); //method override from J20_Inheritance2 - J20_Inheritance3
        advanceCal.add(num1,num2);
        advanceCal.sub(num1,num2);
        advanceCal.multi(num1,num2);
        advanceCal.divide(num1,num2);
    }
}
