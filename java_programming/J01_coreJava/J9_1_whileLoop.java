package java_programming.J01_coreJava;

import java.util.Scanner;

public class J9_1_whileLoop {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        System.out.print("Enter the name: ");
        var name=userInput.nextLine();

        while(name.isEmpty()){
            System.out.println("Name filed can't be empty, Enter your name: ");
            name=userInput.nextLine();
        }

        System.out.println("Welcome "+name);
    }
}
