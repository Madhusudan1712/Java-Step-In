package java_programming.J01_coreJava;

import java.util.Random;

public class J5_randomNum {
    public static void main(String[] args) {
        Random randomNum = new Random();

        //int num= randomNum.nextInt(5);
        double num= randomNum.nextDouble(5)+1;

        System.out.println(num);
    }
}