package java_programming.J01_coreJava;

public class J22_finalKeyword {
    //final keyword
    //variable - make's the variable constant (not able to change further)
    //method - stop's method overriding
    //class - stop's inheritance

    public static void main(String[] args){
        final var phoneNumber = "8197034324";
        //phoneNumber ="I will delete your number";

        //Book3 newBook = new Book3();
    }
}

final class Book2{
    final void author(){
        System.out.println("Written By: Madhusudan K S");
    }
}

//class Book3 extends Book2{
//    void author(){
//        System.out.println("Written By: Anish B");
//    }
//}