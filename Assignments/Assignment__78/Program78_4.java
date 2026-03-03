
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description:    Calculates the hospital bill for the patient.
//  Input:          Integer 
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           03/03/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program78_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;
        int duration = 0;
        int charges = 0;

        System.out.println("Enter call duration : ");
        duration =sobj.nextInt();

        if (duration < 0) 
        {
            System.out.println("Invalid input");
            return;    
        }

        if (duration <= 5) 
        {
            charges = 0;
        }
        else if(duration <= 15)
        {
            charges = (duration - 5);
        }
        else if(duration > 15)
        {
            charges= 9 + (duration - 15) * 2;
        }

        System.out.println("Call duration : "+duration);
        System.out.println("Total call charges : "+charges);

        sobj.close();
    }
}