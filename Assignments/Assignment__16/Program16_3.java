package Assignment__16;

public class Program16_3 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  findFactorial
//  Description:    Calculates the factorial of a given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           27/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findFactorial(int num)
    {
        int i = 0;
        int fact = 1;

        for (i = 1; i<= num; i++) 
        {
            fact = fact * i;
        }

        System.out.println("Factorial: "+fact);
    }

}