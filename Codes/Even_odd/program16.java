import java.util.Scanner;

public class program16 {

/////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  CheckEvenOdd
//  Description:    it is used to check even odd
//  Input:          integer
//  Output:         boolean
//  Author:         Mrumai jitendra khadpe
//  Date:           18/10/2025
//
/////////////////////////////////////////////////////////////////////////////////

    static boolean CheckEvenOdd(int iNo){

        if (iNo%2 == 0) {
            return true;
        }
        else
        {
            return false;
        }
    }

/////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of the application
//
/////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int iValue=0;
        boolean bRet=false;

        System.out.println("Enter a number: ");
        iValue=sc.nextInt();

        if (bRet==true) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}
