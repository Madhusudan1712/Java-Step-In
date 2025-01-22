package java_programming.J01_coreJava;

public class J3_typeCasting {
    public static void main(String[] args) {
        double price = 3;

        //double a = 10;
        //int b = (int)a;

        price = (double) price%2; //pice%2=1 [Note: no flowing point value
        System.out.println("Avg. two: "+price);
    }
}
