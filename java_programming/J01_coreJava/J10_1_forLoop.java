package java_programming.J01_coreJava;

import java.util.Scanner;

public class J10_1_forLoop {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        String userChoice;

        while (true){
            System.out.print("Choose [even or odd] :");
            userChoice=userInput.nextLine().trim().toLowerCase();
            if(userChoice.equals("even") || userChoice.equals("odd")){
                if(userChoice.equals("even")){
                    System.out.println("Selected even number");
                }
                else {
                    System.out.println("Selected odd number");
                }
                break;
            }
            else {
                System.out.print("Invalid, ");
            }
        }

        int startNum, endNum;

        System.out.println("Enter the start value: ");
        startNum=userInput.nextInt();
        System.out.println("Enter the end value: ");
        endNum=userInput.nextInt();

        switch (userChoice){
            case "even":{
                System.out.println("Even number between"+startNum+" and "+endNum);
                for(int i=startNum; i<=endNum; i++){
                    if(i%2==0){
                        System.out.print(i+",");
                    }
                }
            }
            break;
            case "odd":{
                System.out.println("Odd number between "+startNum+" and "+endNum);
                for(int i=startNum; i<=endNum; i++){
                    if(i%2!=0){
                        System.out.print(i+",");
                    }
                }
            }
            break;
        }
    }
}
