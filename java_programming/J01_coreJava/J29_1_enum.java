package java_programming.J01_coreJava;

public class J29_1_enum {
    public static void main(String[] args){
        //enum are the constant value
        //enum is like class, but can't be inherited
        CurrentStatus statusInfo1 = CurrentStatus.Closed;
        System.out.println("Find open : "+statusInfo1);

        System.out.println("____________________________");
        CurrentStatus[] statusInfo2 = CurrentStatus.values();
        for (CurrentStatus s : statusInfo2){
            System.out.println(s+" : "+s.ordinal());
        }

        CurrentStatus statusInfo3 = CurrentStatus.Closed;
        switch (statusInfo3){
            case Open:
                System.out.println("Issue found");
                break;
            case Reopen:
                System.out.println("Issue i have not resolved");
                break;
            case InProgress:
                System.out.println("Dev is working");
                break;
            case Closed:
                System.out.println("Issue is fixed and no impact issue");
                break;
            case onHold:
                System.out.println("Due to dependency, kept for feature development");
                break;
        }
    }
}
enum CurrentStatus{
    Open,Reopen,InProgress,Closed,onHold;
}