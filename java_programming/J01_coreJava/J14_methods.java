package java_programming.J01_coreJava;

public class J14_methods {
    public static void main(String[] args){
        J14_methods object = new J14_methods();
        object.message();
        object.message();
        object.message();
        object.message();
        var sum = object.add(4,5);
        System.out.println(sum);
    }

    public void message(){ //method
        System.out.println("ADD NUMBERS");
    }
    public int add(int n1, int n2){ //method with parameter
        var result = n1+n2;
        return result;
    }
}
