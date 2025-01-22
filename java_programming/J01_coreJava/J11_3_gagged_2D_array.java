package java_programming.J01_coreJava;

public class J11_3_gagged_2D_array {
    public static void main(String[] args) {
        int[][] studentBench = new int[3][]; //gagged array (there is no size provide for column)

        studentBench[0]= new int[1];
        studentBench[1]= new int[2];
        studentBench[2]= new int[3];

        for (int i=0; i<studentBench.length; i++){  //studentBench.length; is the row length
            for (int j=0; j<studentBench[i].length; j++){ //studentBench[i].length; is the length of the column for particular "row"
                System.out.print(studentBench[i][j]=0);
            }
            System.out.println();
        }
    }
}
