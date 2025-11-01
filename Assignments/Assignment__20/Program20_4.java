package Assignment__20;

public class Program20_4 
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  findLargestDigit
//  Description:    Finds the largest digit in given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit=0;
        int iLargest=0;

        while (num != 0) {
            iDigit=num%10;

            if (iDigit > iLargest) {
                iLargest = iDigit;
            }
            
            num=num/10;
        }

        System.out.println("Largest digit is: "+iLargest);
    }
}