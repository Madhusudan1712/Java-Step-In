package java_programming.J01_coreJava;

public class J15_class_object {
    public static void main(String[] args) {
        Computer com = new Computer(); //object
        com.message();
    }
}
class Computer{ //class
    public void message(){
        System.out.println("hello");
    }
}