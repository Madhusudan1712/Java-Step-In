package java_programming.J01_coreJava;

public class J15_2_classObject {
    public static void main(String[] args){
        StudentDetails student1 = new StudentDetails();
        StudentDetails student2 = new StudentDetails();
        StudentDetails student3 = new StudentDetails();

        student1.name="Madhu";
        student1.age=23;
        student1.marks=7.43;

        student2.name="Shamanth";
        student2.age=23;
        student2.marks=8.43;

        student3.name="Arun";
        student3.age=23;
        student3.marks=9.43;

        //store in array (class object)
        StudentDetails[] studentData = {student1,student2,student3};

        for (int i=0; i<studentData.length; i++){
            System.out.println(studentData[i].name+"|"+studentData[i].age+"|"+studentData[i].marks);
        }

        System.out.println("_______________________or____________________");

        StudentDetails students[] = new StudentDetails[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (StudentDetails s : students){
            System.out.println(s.name+"|"+s.age+"|"+s.marks);
        }
    }
}
class StudentDetails{
    String name;
    int age;
    double marks;
}