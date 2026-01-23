import java.util.Scanner;

public class program10 {

//////////////////////////////////////////////////////////////////////////
//
//  Function name:  AdditionTwoNumbers
//  Description:    It is used to perorm addition
//  Input:          float, float
//  Output:         float
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           18/10/20025
//
//////////////////////////////////////////////////////////////////////////

    static float AdditionTwoNumbers(float fNo1, float fNo2)
    {
        float fSum=0.0f;

        if(fNo1<0.0f){
            fNo1=-fNo1;
        }

        if(fNo2<0.0f){
            fNo2=-fNo2;
        }

        fSum=fNo1+fNo2;
        return fSum;
    }

//////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////// 
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        float fValue1=0.0f, fValue2=0.0f, fRet=0.0f;

        System.out.println("Enter 1st no: ");
        fValue1=sc.nextFloat();

        System.out.println("Enter 2nd no: ");
        fValue2=sc.nextFloat();

        fRet=AdditionTwoNumbers(fValue1, fValue2);

        System.out.println(fRet);
    }
}

//////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the aplication
//  Input1:10.5         Input2:3.2          Output:13.7
//  Input1:-10.5        Input2:3.2          Output:13.7
//  Input1:10.5         Input2:-3.2         Output:13.7
//  Input1:-10.5        Input2:-3.2         Output:13.7
//  Input1:10.5         Input2:0.0          Output:10.5
//
//////////////////////////////////////////////////////////////////////////
