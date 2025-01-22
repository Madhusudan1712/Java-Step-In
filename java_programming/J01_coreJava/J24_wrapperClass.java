package java_programming.J01_coreJava;

public class J24_wrapperClass {
    public static void main(String[] args){
        //WrapperClass -> Integer, Double, Float, Character, String, ...

        int num=5; //primitive type

        //Integer num1 = new Integer(num); //unboxing
        Integer num1=num; //auto-unboxing

        System.out.println(num1);

        String num2 = "5";
        int num3 = Integer.parseInt(num2);

        System.out.println(num1*num3);
    }
}
