package java_programming.J01_coreJava;

import java.util.Scanner;

public class J4_findHypotenuse {
    public static void main(String[] args) {
        double x,y,result;

        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter value of side X: ");
        x=inputs.nextDouble();
        System.out.println("Enter value of side Y: ");
        y=inputs.nextDouble();

        result=Math.sqrt((x*x+y*y)); //formula to calculate Hypotenuse
        System.out.println("Hypotenuse is :" +result);

        inputs.close();
    }
}
