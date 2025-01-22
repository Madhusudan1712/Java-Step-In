package java_programming.J01_coreJava;

public class J31_exceptions {
    public static void main(String[] args){
        int result;
        int nums[] ={1,2,3};
        String message = null;

        cal newCal = new cal();
        try {
            //result = newCal.divide(4,0); //ArithmeticException
            //System.out.println("Result :"+result);

            //System.out.println("Last number: "+nums[3]); //IndexOutOfBoundsException

            System.out.println(message.length());
        }
        catch (ArithmeticException e){
            System.out.println("A number can't be divided by zero");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Accessed array index is out range");
        }
        catch (Exception e){
            System.out.println("Something went wrong, Please handle the exception");
        }
    }
}
class cal{
    public int divide(int num1,int num2){
        return num1/num2;
    }
}