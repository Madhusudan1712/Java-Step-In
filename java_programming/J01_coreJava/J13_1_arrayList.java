package java_programming.J01_coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class J13_1_arrayList {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        ArrayList<String> food = new ArrayList<>();
        //ArrayList<Integer> num = new ArrayList<>();

        while (true){
            System.out.print("Enter the food name to be added: ");
            String userNum = userInput.nextLine();
            food.add(userNum); //add,get,set,clear

            System.out.println("--------------------------------List---------------------------------------");
            for(int i=0; i<food.size(); i++){               // for (String s : food)
                System.out.println((i+1)+"."+food.get(i));
            }

            //System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            //for(String s : food){
            //    System.out.println(s);
            //}

            System.out.println("Do you have another food name to add (y/n):");
            String continueOrBreck = userInput.nextLine().toLowerCase();

            if (continueOrBreck.equals("n")){
                break;
            }
            else if (continueOrBreck.equals("y")) {
                continue;
            }
            else {
                String incorrectBreck ="";
                while (true) {
                    System.out.println("Enter the correct option....!");
                    System.out.println("Do you have another food name to add (y/n):");
                    String againcCntinueOrBreck = userInput.nextLine();
                    if (againcCntinueOrBreck.equals("n")){
                        incorrectBreck = "yes";
                        break;
                    } else if (againcCntinueOrBreck.equals("y")) {
                        break;
                    }
                }

                if(incorrectBreck.equals("yes")){
                    break;
                }
            }
        }

    }
}
