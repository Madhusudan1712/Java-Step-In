package java_programming.J01_coreJava;

import java.util.Scanner;

public class J9_2_doWhileLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name;

        do {
            System.out.print("Enter the name: ");
            name=userInput.nextLine();
            if(name.isEmpty()){
                System.out.print("Name filed can't be empty, ");
            }
        }while (name.isEmpty());


        System.out.println("Welcome " + name);
    }
}
