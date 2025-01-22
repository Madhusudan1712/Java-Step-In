package java_programming.J01_coreJava;

public class J20_inheritance3 extends J20_inheritance2 {
    public void calculatorType(){
        System.out.println("only add-sub-multi-divide {from Inheritance3}");
    }
    public void multi(double num1,double num2){
        result = num1*num2;
        System.out.println("multi :"+result);
    }
    public void divide(double num1,double num2){
        result = (double) num1/num2;
        System.out.println("divide :"+result);
    }
}
