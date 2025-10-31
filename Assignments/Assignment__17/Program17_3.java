package Assignment__17;

public class Program17_3 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  findMax
//  Description:    Displays the maximum number from given numbers.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           31/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a + " is greater number");
        }
        else
        {
            System.out.println(b + " is greater number");
        }
    }
}