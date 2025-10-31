package Assignment__18;

public class Program18_5 {
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  checkSign
//  Description:    Checks the sign of number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           31/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkSign(int num)
    {
        if(num < 0)
        {
            System.out.println("Sign is negative");
        }
        else
        {
            System.out.println("Sign is positive");
        }
    }
}