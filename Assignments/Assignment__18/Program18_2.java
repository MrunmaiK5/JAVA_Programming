package Assignment__18;

public class Program18_2 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  printEvenNumbers
//  Description:    DIsplays the even numbers till the user entered number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           31/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printEvenNumbers(int num)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=num; iCnt++)
        {
            if ((iCnt%2) == 0) {
                System.out.println(" "+ iCnt);
            }
        }
    }
}