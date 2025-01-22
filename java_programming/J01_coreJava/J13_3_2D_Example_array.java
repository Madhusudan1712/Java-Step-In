package java_programming.J01_coreJava;

import java.util.Scanner;

public class J13_3_2D_Example_array {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to tic-toe game");

        String[][] playBoard = new String[3][3];

        for(int i=0; i<playBoard.length; i++){
            for (int j=0; j<playBoard.length; j++){
                System.out.print(playBoard[i][j]="_ ");
            }
            System.out.println();
        }
        while (true){
            System.out.print("Player 1[X}: Enter the row position :");
            int player1Row = userInput.nextInt();
            System.out.print("Player 1[X}: Enter the column position :");
            int player1Column = userInput.nextInt();

            if(playBoard[player1Row][player1Column].equals("_ ")){
                playBoard[player1Row][player1Column]="X ";
                for(int i=0; i<playBoard.length; i++){
                    for (int j=0; j<playBoard.length; j++){
                        System.out.print(playBoard[i][j]);
                    }
                    System.out.println();
                }
            }
            else if (!playBoard[player1Row][player1Column].equals("_ ")){
                System.out.println("Place already marked");
            }

            System.out.print("Player 2[O}: Enter the row position :");
            int player2Row = userInput.nextInt();
            System.out.print("Player 2[O}: Enter the column position :");
            int player2Column = userInput.nextInt();

            if(playBoard[player2Row][player2Column].equals("_ ")){
                playBoard[player2Row][player2Column]="O ";
                for(int i=0; i<playBoard.length; i++){
                    for (int j=0; j<playBoard.length; j++){
                        System.out.print(playBoard[i][j]);
                    }
                    System.out.println();
                }
            }
            else if (!playBoard[player2Row][player2Column].equals("_ ")) {
                System.out.println("Place already marked");
            }
        }
    }
}
