package java_programming.J02_advanceJava.J01_generics;

public class J01_generics {
    //------method-----
    public <T> String methodName(T name){
        return "M-Name:"+name.toString();
    }
    public <T> String methodAge(T age){
        return "M-Age:"+age.toString();
    }
    public static void main(String[] args){
        System.out.println("---------------------------method-----------------------");
        J01_generics sameInstance = new J01_generics();
        String mName = sameInstance.methodName("Mobby");
        String mAge = sameInstance.methodAge(22);
        System.out.println(mName+"\n"+mAge);

        System.out.println("---------------------------class-----------------------");
        J03_classGenerics<String> name = new J03_classGenerics<>();
        J03_classGenerics<Integer> age = new J03_classGenerics<>();
        J03_classGenerics<Character> gender = new J03_classGenerics<>();
        J03_classGenerics<Boolean> result = new J03_classGenerics<>();

        name.setName("Madhu");
        String userName = name.getName();

        age.setAge(23);
        int userAge = age.getAge();

        gender.setGender('M');
        char userGender = gender.getGender();

        result.setResult(true);
        boolean userResult = result.getResult();
        String resultStatus = (userResult) ? "Pass" : "Fail";

        System.out.println("Name:"+userName+"\nAge:"+userAge+"\nGender:"+userGender+"\nResult:"+resultStatus);
        System.out.println("---------------------------Interface-----------------------");

        J04_1_InterfaceGenerics<String,Integer> interfaceData = new J04_2_InterfaceGenenricsImpls();

        String interfaceName = interfaceData.name();
        int interfaceAge = interfaceData.age();
        System.out.println("I-Name:"+interfaceName+"\nI-Age:"+interfaceAge);
    }
}