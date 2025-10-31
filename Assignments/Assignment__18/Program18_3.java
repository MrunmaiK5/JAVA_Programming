package Assignment__18;

public class Program18_3 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  printOddNumbers
//  Description:    Displays the odd numbers till the user entered number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           31/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printOddNumbers(int num)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=num; iCnt++)
        {
            if ((iCnt%2) != 0) {
                System.out.println(" "+ iCnt);
            }
        }
    }
}