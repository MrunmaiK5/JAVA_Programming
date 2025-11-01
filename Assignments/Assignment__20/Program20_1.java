package Assignment__20;

public class Program20_1 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  sumEvenNumbers
//  Description:    Calculates sum of even numbers till N.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenNumbers(int num)
    {
        int iSum=0;

        for(int iCnt=1; iCnt<=num; iCnt++)
        {
            if ((iCnt%2) == 0) 
            {
                iSum=iSum+iCnt;
            }
        }

        System.out.println(" "+iSum);
    }
}