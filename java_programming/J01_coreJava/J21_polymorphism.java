package java_programming.J01_coreJava;

public class J21_polymorphism {
    //poly - Many
    //morphism - Behaviour

    public static void main(String[] args){
        BasicCalculator newDevice = new Calculator(); //reference type-BasicCalculator ,But object-Calculator
        //newDevice.feature();

        //look polymorphism - feature() Behaviour in different object of class
        //1 Behaviour
        newDevice = new BasicCalculator();
        newDevice.feature();
        //2 Behaviour
        newDevice = new Calculator();
        newDevice.feature();
        //3 Behaviour
        newDevice = new ScientificCalculator();
        newDevice.feature();

        //will not work
        //newDevice = new NoInheritance();
        //newDevice.feature();
    }
}

class BasicCalculator {
    void feature(){
        System.out.println("FEATURE'S : Add-Sub");
    }
}
class Calculator extends BasicCalculator {
    void feature(){
        System.out.println("FEATURE'S : Add-Sub-Multi-Divide");
    }
}
class ScientificCalculator extends Calculator {
    void feature(){
        System.out.println("FEATURE'S : Add-Sub-Multi-Divide + Power-SquareRoot");
    }
}

class NoInheritance{
    void feature(){
        System.out.println("Will Not Woks as above class because there is no inheritance");
    }
}