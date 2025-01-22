package java_programming.J01_coreJava;

import java.util.Scanner;

public class J7_breakContinue {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        while (true){
            System.out.print("Select the lucky number from 1 to 10 : ");
            int luckyNum=userInput.nextInt();

            if(luckyNum<1 || luckyNum>10){ //*IMP* user reverse condition (...-2,-1,0 and 11,12,13...)
                System.out.print("Invalid, ");
                continue;
            }

            System.out.println("I have selected "+luckyNum+" as a lucky number from 1 to 10.");
            break;
        }

    }
}
