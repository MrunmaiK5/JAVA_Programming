package Assignment__17;

public class Program17_4 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.findMin(3,7,2);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  findMin
//  Description:    Displays the minimum number from given numbers.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           31/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findMin(int a, int b, int c)
    {
        if (a<b && a<c) 
        {
            System.out.println(a+" is minimum number");
        }
        else if(b<a && b<c)
        {
            System.out.println(b+" is minimum number");
        }
        else
        {
            System.out.println(c+" is minimum number");
        }
    }
}