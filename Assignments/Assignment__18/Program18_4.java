package Assignment__18;

public class Program18_4 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  sumEvenOddDigits
//  Description:    Finds sum of even and odd digits seperately.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           31/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenOddDigits(int num)
    {
        int eSum=0;
        int oSum=0;
        int digit=0;

        while (num != 0) {
            digit=num%10;

            if ((digit%2) == 0) {
                eSum = eSum + digit;
            }
            else
            {
                oSum = oSum + digit;
            }

            num=num/10;
        }

        System.out.println("Even digits summation: "+eSum);
        System.out.println("Odd digits summation: "+oSum);

    }
}