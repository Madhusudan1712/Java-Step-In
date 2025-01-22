package java_programming.J01_coreJava;

public class J23_upDownCasting_class {
    public static void main(String[] args){
        phone newPhone = new laptop();
        newPhone.phoneFeature();
        //newPhone.laptopFeature();

        laptop newLaptop = (laptop) newPhone;
        newLaptop.phoneFeature();
        ((laptop) newPhone).laptopFeature();


        //newLaptop.laptopFeature();
    }
}

class phone{
    void phoneFeature(){
        System.out.println("phone: 8gb RAM, 128gb ROM");
    }
}
class laptop extends phone{
    void laptopFeature(){
        System.out.println("Laptop: 16gb RAM, 500gb SDD");
    }
}