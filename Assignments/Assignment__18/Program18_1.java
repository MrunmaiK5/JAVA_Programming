package Assignment__18;

public class Program18_1 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }    
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  checkPrime
//  Description:    Checks wether the given number is prime or not.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           31/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        boolean iFlag = false;

        for(iCnt=2, iFlag=true; iCnt <= (num/2); iCnt++)
        {
            if ((num%iCnt) == 0) {
                iFlag=false;
            }
        }

        if (iFlag) {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}