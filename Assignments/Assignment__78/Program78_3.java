
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description:    Calculates the highest count and goal achieved days for a fitness application.
//  Input:          Integer 
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           03/03/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program78_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;
        int Days[] = new int[7];
        int Goal = 10000;
        int highestCount = 0;
        int Goaldays = 0;

        System.out.println("Enter total days : ");
        for(i = 0; i < 7; i++)
        {
            Days[i] = sobj.nextInt();
            if (Days[i] < 0) 
            {
                System.out.println("Invalid input");
                return;    
            }
        }
        
        for(i=0; i<Days.length; i++)
        {
            if (Days[i] > Goal) 
            {
                Goaldays++;
            }

            if (highestCount <= Days[i] ) 
            {
                highestCount = Days[i];    
            }
        }


        System.out.println("Goal achieved days : "+Goaldays);
        System.out.println("Maximum steps in week : "+highestCount);

        sobj.close();
    }
}