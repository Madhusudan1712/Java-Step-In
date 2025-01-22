//odd number form user input to next 10 values
package java_programming.J01_coreJava;

import java.util.Scanner;

public class J2_2_swapVarValue {
    public static void main(String[] args){
        Scanner aValue = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        double a = aValue.nextDouble();
        System.out.print("Enter the value of B: ");
        double b = aValue.nextDouble();

        //temporary storage
        double temp=0;

        temp=a;
        a=b;
        b=temp;

        System.out.print("A:"+a+"\tB:"+b);
    }
}
