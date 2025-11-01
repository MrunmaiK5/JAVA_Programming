public class Program19_1 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }    
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  checkLeapYear
//  Description:    Checks wether year is an leap year.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void checkLeapYear(int year)
    {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
