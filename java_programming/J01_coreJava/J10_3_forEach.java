package java_programming.J01_coreJava;

import java.util.ArrayList;

public class J10_3_forEach {
    public static void main(String[] args) {
        //String[] companies = {"Excelsoft","Infosys", "HCL"};

        ArrayList<String> companies = new ArrayList<>();
        companies.add("Excelsoft");
        companies.add("Infosys");
        companies.add("HCL");

        for (String c : companies ) {
            System.out.println(c);
        }
    }
}
