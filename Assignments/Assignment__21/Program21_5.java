package Assignment__21;

public class Program21_5 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  printDivisibleBy2and3
//  Description:    Prints all numbers from 1 to N that are divisible by both 2 and 3.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printDivisibleBy2and3(int n)
    {
        for(int iCnt=1; iCnt<=n; iCnt++)
        {
            if (iCnt%2==0 && iCnt%3==0) 
            {
                System.out.println(" "+iCnt);
            }
        }
    }
}