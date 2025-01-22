package java_programming.J01_coreJava;

public class J18_this_Keyword {
    public static void main(String[] args){
        Profile newProfile = new Profile();
        newProfile.name="Madhu";
        newProfile.age=23;

        System.out.println(newProfile.name+" "+newProfile.age);
        newProfile.displayProfile("Amogh",22);
    }
}

class Profile{
    String name;
    int age;
    //void displayProfile(String n,int a){
        //System.out.println(n+" "+a);
    //}
    //-------------or--------------
    void displayProfile(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name+" "+age);
    }
}