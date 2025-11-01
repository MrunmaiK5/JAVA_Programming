public class Program19_4 
{
    public static void main(String[] args) {
        Logic obj =new Logic();
        obj.printDigits(9876);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  printDigits
//  Description:    Displays each digit of a number seperately.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printDigits(int num)
    {
        int digit=0;

        while (num != 0) 
        {
            digit = num%10;
            System.out.println(" "+ digit);
            num=num/10;
        }
    }
}