package java_programming.J01_coreJava;

public class J16_staticKeyWord {
    public static void main(String[] args){
        Mobile newMobile1 = new Mobile();
        Mobile newMobile2 = new Mobile();

        Mobile.category ="Smartphone";

        newMobile1.brand="Aplle";
        //newMobile1.category="Smartphone";
        newMobile1.cost=1500;

        newMobile2.brand="Motorola";
        //newMobile2.category="phone";
        newMobile2.cost=200;

        newMobile1.launch();
        newMobile2.launch();

        System.out.println("___________Both static and instance variable are accessed___________");
        Mobile.launch2(newMobile1);
    }
}
class Mobile{
    String brand; // instance variable
    static String category; //if value is changed all object will have the same value
    int cost;
    public void launch(){
        System.out.println("brand: "+brand+" category: "+category+" cost: "+cost);
    }

    public static void launch2(Mobile obj){ //specifying class object
        //Note : only static variables can be accessed in static methods
        System.out.println("brand: "+obj.brand+" category: "+category+" cost: "+obj.cost);
    }
}