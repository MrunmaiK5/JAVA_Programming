package Assignment__20;

public class Program20_3 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  checkPerfect
//  Description:    Checks wether given number is perfect number or not.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect(int num)
    {
        int iSum = 0;

        for(int iCnt=1; iCnt <= (num/2); iCnt++)
        {
            if (num % iCnt == 0) 
            {
                iSum = iSum + iCnt;
            }
        }

        if (iSum == num) {
            System.out.println(num + " is a perfect number");
        }
        else
        {
            System.out.println(num+" is not a perfect number");
        }
    }
}