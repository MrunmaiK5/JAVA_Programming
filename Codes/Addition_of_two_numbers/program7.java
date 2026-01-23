import java.util.Scanner;

public class program7 {

    static int AdditionTwoNumbers(int iNo1, int iNo2){
        int iSum=0;
        iSum=iNo1+iNo2;
        return iSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iValue1=0, iValue2=0, iRet=0;   
        
        System.out.println("Enter 1st no: ");
        iValue1=sc.nextInt();

        System.out.println("Enter 2nd no: ");
        iValue2=sc.nextInt();

        iRet=AdditionTwoNumbers(iValue1, iValue2);
        System.out.println("Sum is: "+iRet);
    }
}
