package java_programming.J01_coreJava;

public class J17_Constructor {
    //constructor is same as methods, but constructor name should be same as class name
    //constructor will not return anything (no void,no dataType)
    //constructor will be called automatically when class object is created

    public static void main(String[] args){
        Shop appleStore = new Shop();
    }
}

class Shop{
    Shop(){
        String availableBrand = "Apple";
        int cost = 1500;

        System.out.println("Brand:"+availableBrand+" Cost:"+cost);
    }
}