package Assignment__16;

class Program16_1
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  calculateSum
//  Description:    Displays the sumation of n natural numbers.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           27/10/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculateSum(int n)
    {
        int i = 0;
        int sum = 0;

        for(i=1; i<=n; i++)
        {
            sum=sum+i;
        }

        System.out.println("Sum: "+sum);
    }

}

