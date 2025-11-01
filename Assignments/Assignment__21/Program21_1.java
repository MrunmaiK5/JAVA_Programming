package Assignment__21;

public class Program21_1 
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }    
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  productOfDigits
//  Description:    Calculates the product of the digits of given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void productOfDigits(int num)
    {
        int iDigit=0;
        int iProd=1;

        while (num != 0) 
        {
            iDigit=num%10;
            iProd=iProd*iDigit;
            num=num/10;    
        }

        System.out.println("Product of digits is: "+iProd);
    }
}