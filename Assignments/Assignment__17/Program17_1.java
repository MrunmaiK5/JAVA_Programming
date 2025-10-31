package Assignment__17;

class Program17_1
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  sumOfDigits
//  Description:    Displays the sumation of digits of given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumOfDigits(int n)
    {
        int digit = 0;
        int sum = 0;

        while(n != 0)
        {
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }

        System.out.println("Sum: "+sum);
    }

}

