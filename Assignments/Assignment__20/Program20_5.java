package Assignment__20;

public class Program20_5 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  findSmallestDigit
//  Description:    Finds the smallest digit in given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0;
        int iSmallest = num%10;

        while (num != 0) 
        {
            iDigit = num%10;

            if (iDigit<iSmallest) {
                iSmallest=iDigit;
            }

            num=num/10;
        }

        System.out.println("Smallest number is: "+ iSmallest);
    }
}