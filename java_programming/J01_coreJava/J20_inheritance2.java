package java_programming.J01_coreJava;

public class J20_inheritance2 {
    double result;
    public void calculatorType(){
        System.out.println("only add-sub {from Inheritance2}");
    }
    public void add(double num1,double num2){
        result = num1+num2;
        System.out.println("Add :"+result);
    }
    public void sub(double num1,double num2){
        result = num1-num2;
        System.out.println("Sub :"+result);
    }
}
