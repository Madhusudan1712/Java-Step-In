package java_programming.J01_coreJava;

import java.util.Scanner;

public class J11_1_singleDimensional_1D_array {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the length of tree: ");
        int length = userInput.nextInt();
        System.out.print("Enter the symbol to be printed: ");
        var symbol = userInput.next();

        String[] finalLine=new String[length];

        for(int i=0; i<=length-1; i++){
            finalLine[i]=symbol;
        }
        for(int j=0; j<=length-1; j++){
            for(int k=0; k<=j; k++){
                System.out.print(finalLine[k]);
            }
            System.out.print("\n");
        }
    }
}
