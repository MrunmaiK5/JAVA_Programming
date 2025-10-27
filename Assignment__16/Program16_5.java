package Assignment__16;

public class Program16_5 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  countDigits
//  Description:    Counts the number of digits in given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           27/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countDigits(int num)
    {
        int count = 0;

        while (num != 0) 
        {
            num=num/10;
            count=count+1;
        }

        System.out.println("Number of digits = "+count);
    }
}