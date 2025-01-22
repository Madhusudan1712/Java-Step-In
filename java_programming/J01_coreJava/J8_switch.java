package java_programming.J01_coreJava;

import java.util.Scanner;

public class J8_switch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Available movie's :\n'KGF Ch-2'\t'Jhon Wick Ch-4'\t'Men in Black'\t'Lord of the rings'");
        System.out.print("Select the movie: ");
        var selectMovie = userInput.nextLine();

        System.out.println("____________________________________________________________________________");
        switch (selectMovie){
            case "KGF Ch-2":
                System.out.println("Movie Name: KGF Ch-2");
                System.out.println("Available Screen Time :10:30am, 01:30pm, 04:30pm, 07:30pm\t\t\t-screen-1");
                break;
            case "Jhon Wick Ch-4":
                System.out.println("Movie Name: Jhon Wick Ch-4");
                System.out.println("Available Screen Time :10:30am, 01:30pm\t\t\t-screen-2");
                break;
            case "Men in Black":
                System.out.println("Movie Name: Men in Black");
                System.out.println("Available Screen Time :10:30am, 01:30pm\t\t\t-screen-2");
                break;
            case "Lord of the rings":
                System.out.println("Movie Name: Lord of the rings");
                System.out.println("Available Screen Time :01:30pm\t\t\t-screen-2");
                break;
            default:
                System.out.println("Please type the correct movie name from the list");
        }
        System.out.println("____________________________________________________________________________");
    }
}
