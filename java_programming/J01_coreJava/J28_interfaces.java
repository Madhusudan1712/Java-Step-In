package java_programming.J01_coreJava;

public class J28_interfaces {
    public static void main(String[] args){
        //interface - gives the roadmap, and this need to be implemented
        //all variables inside interface are by default final & static

        //ComputerConcept newComputer = new ComputerConcept(); //can't be instantiated
        ComputerConcept newComputer1 = new Laptops();
        ComputerConcept newComputer2 = new Desktops();

        Developer madhu = new Developer();
        madhu.developApp(newComputer1);
        madhu.developApp(newComputer2);
    }
}
interface ComputerConcept{
    //int age; //only initialize not allowed, because by default types are "final & static"
    double marks=7.43;

    //public abstract void development(); //same as bellow line (in interface by default method is public abstract)
    void development();
}
interface multipleInterface{
    void emptyMethod();
}
 class Laptops implements ComputerConcept, multipleInterface{
     public void development(){
         System.out.println("Develops app using Laptop");
     }

     public void emptyMethod(){
         System.out.println("all methods in interface need to be implemented");
     }
 }
 class Desktops implements ComputerConcept, multipleInterface{
     public void development(){
         System.out.println("Develops app using Desktop");
     }
     public void emptyMethod(){
         System.out.println("all methods in interface need to be implemented");
     }
 }
 class Developer{
     void developApp(ComputerConcept obj){
         obj.development();
     }
 }