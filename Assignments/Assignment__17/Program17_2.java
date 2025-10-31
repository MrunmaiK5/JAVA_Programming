package Assignment__17;

public class Program17_2 
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  checkPalindrome
//  Description:    Checks wether given number is palindrome or not.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPalindrome(int num)
    {
        int rnum=0;
        int digit = 0;
        int temp=num;

        while (temp != 0) {
            digit=temp%10;
            rnum=(rnum*10)+digit;
            temp=temp/10;
        }

        if (rnum == num) 
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}