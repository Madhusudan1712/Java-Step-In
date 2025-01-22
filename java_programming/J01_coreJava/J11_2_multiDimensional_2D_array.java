package java_programming.J01_coreJava;

import java.util.Scanner;

public class J11_2_multiDimensional_2D_array {
    public static void main(String[] args) {
        String[][] playBoard = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print((playBoard[row][column] = "_ "));
            }
            System.out.println(" ");
        }

        int rowPosition, colPosition;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Player X row position: ");
        rowPosition = userInput.nextInt();
        System.out.print("Player X column position: ");
        colPosition = userInput.nextInt();

        playBoard[rowPosition][colPosition]="X ";

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print((playBoard[row][column]));
            }
            System.out.println(" ");
        }
    }
}
