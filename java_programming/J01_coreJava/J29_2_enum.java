//package java_programming.J01_coreJava;
//
//public class J29_2_enum {
//    public static void main(String[] args){
//        //Laptop newLap1 = Laptop.LenovoS540;
//        //System.out.println(newLap1);
//
//        Laptop[] newLap2 = Laptop.values();
//        for (Laptop l : newLap2) {
//            System.out.println("Brand: " + l + " | Price: " + l.getPrice());
//        }
//    }
//}
//
//enum Laptop{
//    MacbookAir(1000),DellXPS(650),LenovoS540(500),HpYoga(860);
//
//    private int price;
//    private int minPrice = 500;
//
////    Laptop(){
////        this.price=minPrice;
////    }
//    Laptop(int price){
//        this.price=price;
//    }
//    public int getPrice(){
//       return price;
//    }
//    public void setPrice(int updatedPrice){
//        this.price=updatedPrice;
//    }
//}