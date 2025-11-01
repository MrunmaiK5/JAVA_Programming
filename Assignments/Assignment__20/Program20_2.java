package Assignment__20;

public class Program20_2 {
    public static void main(String[] args) {
        Logic obj=new Logic();
        obj.printReverse(10);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  printReverse
//  Description:    Displays the number in reverse order from N to 1.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printReverse(int num)
    {
        for(int iCnt = num; iCnt >= 1; iCnt--)
        {
            System.out.println(" " + iCnt);
        }
    }
}