package java_programming.J01_coreJava;

public class J12_stringMethods {
    public static void main(String[] args) {
        String word="   Java Programming    ";

        //var result = word.toLowerCase();
        //var result = word.charAt(2);
        //var result = word.isEmpty();
        //var result = word.equals("Java Programming");
        //var result = word.trim();
        //var result = word.contains("a");
        //var result = word.endsWith(" ");
        var result = word.indexOf("gra");

        System.out.println(result);
    }
}
