package java_programming.J01_coreJava;

public class J27_anonymaousInnerClass {
    public static void main(String[] args){
        PostBox newPostBox1 = new PostBox(){ //anonymous class - there is no class name
            void message(){
                System.out.println("Java training Completed, You have been added to MatXL project");
            }
        };
        newPostBox1.message();

        PostBox newPostBox2 = new  PostBox();
        newPostBox2.message();

        //for abstract class and abstract method
        Delivery newDelivery1 = new Delivery() {
            void deliveryDate() {
                System.out.println("Product will be arrives in 22/10/2024");
            }
        };
        newDelivery1.deliveryDate();
        Delivery newDelivery2 = new Delivery() {
            void deliveryDate() {
                System.out.println("Product will be arrives in 25/11/2024");
            }
        };
        newDelivery2.deliveryDate();
    }
}

class PostBox{
    void message(){
        System.out.println("You have java training from next week");
    }
}

abstract class Delivery{
    abstract void deliveryDate();
}