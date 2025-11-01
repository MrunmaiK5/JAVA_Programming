package Assignment__21;

public class Program21_2 
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  countEvenOddRange
//  Description:    Counts even and odd numbers till given number(N).
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int num)
    {
        int eCount=0;
        int oCount=0;

        for(int iCnt = 1; iCnt <= num; iCnt++)
        {
            if(iCnt%2 == 0)
            {
                eCount=eCount+1;
            }
            else
            {
                oCount=oCount+1;
            }
        }

        System.out.println("Count of even numbers is: "+eCount);
        System.out.println("Count of odd numbers is: "+oCount);
    }
}