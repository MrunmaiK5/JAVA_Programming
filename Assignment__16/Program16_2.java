package Assignment__16;

public class Program16_2 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  checkEvenOdd
//  Description:    Checks wether given number is even or odd.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           27/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkEvenOdd(int num)
    {
        if (num % 2 == 0) 
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }

}

