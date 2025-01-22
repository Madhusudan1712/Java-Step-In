package java_programming.J01_coreJava;

public class J26_nestedClass {
    public static void main(String[] args){
        Footwaers shop =new Footwaers();

        Footwaers.Shoes shoesObj1 = shop.new Shoes();
        shoesObj1.brand="PUMA";
        shoesObj1.price=3999;
        shoesObj1.brandDetails();

        System.out.println("----------------------------------");

        Footwaers.Slippers slipperObj1 = shop.new Slippers();
        slipperObj1.brand="Bata";
        slipperObj1.price=999;
        slipperObj1.brandDetails();
    }
}
class Footwaers{
    class Shoes{
        String brand;
        int price;
        void brandDetails(){
            System.out.println("Brand :"+brand+" Price :"+price);
        }
    }
    class Slippers{
        String brand;
        int price;
        void brandDetails(){
            System.out.println("Brand :"+brand+" Price :"+price);
        }
    }
}