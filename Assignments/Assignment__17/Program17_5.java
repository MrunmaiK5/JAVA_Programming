package Assignment__17;

public class Program17_5 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  printTable
//  Description:    Displays the multiplication table of given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           31/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printTable(int num)
    {
        int iCnt=0;
        for(iCnt=1; iCnt<=10; iCnt++)
        {
            System.out.println(" " + (num*iCnt));
        }
    }
}