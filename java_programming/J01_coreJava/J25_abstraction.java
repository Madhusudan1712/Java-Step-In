package java_programming.J01_coreJava;

public class J25_abstraction {
    public static void main(String[] agrs){
        //to have abstract method then class should be abstract
        //to override the abstract method, you need to inherit the super class
        //all abstract methods in super class need to be implemented in the subclass class

        //BasicPhone newPhone = new BasicPhone(); //directly abstract class can't be accessed
        //newPhone.camera(); //empty only have the structure

        Smartphone newSmartphone = new Smartphone();
        newSmartphone.call();
        newSmartphone.keyboard();
        newSmartphone.camera();
    }
}
abstract class BasicPhone{
    public void call(){
        System.out.println("You can make calls");
    }
    public void keyboard(){
        System.out.println("You can type");
    }
    public abstract void camera(); //you the feature, but currently don't know how to implement
    //public abstract void camera2();
}
class Smartphone extends BasicPhone{
    public void camera(){
        System.out.println("You can take selfie");
    }
//    public void camera2(){
//
//    };
}