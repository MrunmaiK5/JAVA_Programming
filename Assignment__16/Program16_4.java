package Assignment__16;

public class Program16_4 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  reverseNumber
//  Description:    Reverse the given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           27/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void reverseNumber(int num)
    {
        int rnum = 0;
        int digit=0;

        while (num != 0) {
            digit = num%10;
           
            rnum=(rnum*10)+digit;
            
            num=num/10;
        }

        System.out.println("Reverse number = "+rnum);
    }
}
