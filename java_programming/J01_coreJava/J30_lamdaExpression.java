package java_programming.J01_coreJava;

public class J30_lamdaExpression {
    public static void main(String[] args){
        Security newPwd = (n,a) -> n+a;
        //or
        Security newPwd1 = (n,a) -> {
            return n+a;
        };
        String newPassword1 = newPwd.password("Madhu",23);
        System.out.println("Password :"+newPassword1);

        String newPassword2 = newPwd1.password("Amogh",22);
        System.out.println("Password :"+newPassword2);
    }
}

//Functional interface - have only one abstract method and we know the abstract method will not have body
interface Security{
    public abstract String password(String name,int age);
}