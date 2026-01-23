import java.util.Scanner;

public class program11 {
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

    static float AdditionTwoNumbers(
                                        float fNo1,                 //first input
                                        float fNo2                  //second input
                                    )
    {
        float fSum=0.0f;                                            //to store result

        if(fNo1<0.0f){                                              //updator
            fNo1=-fNo1;
        }

        if(fNo2<0.0f){                                              //updator
            fNo2=-fNo2;
        }

        fSum=fNo1+fNo2;                                             //Business logic

        return fSum;
    }   // End of AddiitonTwoNumbers

//////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////// 
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        float fValue1=0.0f, fValue2=0.0f;                           //to accept input        
        float fRet=0.0f;                                            //to store result

        System.out.println("Enter 1st no: ");
        fValue1=sc.nextFloat();

        System.out.println("Enter 2nd no: ");
        fValue2=sc.nextFloat();

        fRet=AdditionTwoNumbers(fValue1, fValue2);                  //method call

        System.out.println(fRet);
    }   //end of main
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