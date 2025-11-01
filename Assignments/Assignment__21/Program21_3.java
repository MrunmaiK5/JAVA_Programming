package Assignment__21;

public class Program21_3 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  displayFactors
//  Description:    Displays factors of given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;
        for(iCnt=1; iCnt<=(num/2); iCnt++)
        {
            if (num%iCnt == 0) {
                System.out.println(iCnt);
            }
        }
    }
}