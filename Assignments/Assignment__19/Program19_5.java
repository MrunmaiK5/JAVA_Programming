public class Program19_5 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  calculatePower
//  Description:    Calculates power of a number using for loop.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculatePower(int base, int exp)
    {
        int power=1;

        for(int iCnt=1; iCnt<=exp; iCnt++)
        {
            power=power*base;
        }
        System.out.println("Power: "+power);
    }
}