package java_programming.J01_coreJava;

import java.util.Scanner;

public class J10_2_nestedForLoop {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        System.out.print("Enter the number of row's: ");
        int noRow=userInput.nextInt();
        System.out.print("Enter the number of column's: ");
        int noColumn=userInput.nextInt();
        System.out.print("Enter the symbol to be printed: ");
        var symbol=userInput.next();

        for(int i=1; i<=noRow; i++){
            for (int j=1; j<=noColumn; j++){
                System.out.print(symbol+" ");
            }
            System.out.print("\n");
        }
    }
}
