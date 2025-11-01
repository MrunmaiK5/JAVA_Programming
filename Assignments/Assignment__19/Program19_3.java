public class Program19_3 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);    
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  checkDivisible
//  Description:    Checks wether number is divisible by 5 and 11.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible(int num)
    {
        if (num%5==0 && num%11==0) {
            System.out.println("Number is divisible by both 5 and 11");
        }
        else if (num%5==0 && num%11!=0) {
            System.out.println("Number is divisible by 5");
        }
        else if (num%5!=0 && num%11==0) {
            System.out.println("Number is divisible by 11");
        }
        else
        {
            System.out.println("Number is not divisible by both 5 and 11");
        }
    }
}