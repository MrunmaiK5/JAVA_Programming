package Assignment__76;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description:    Calculates the charges for package delivery.
//  Input:          Integer 
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program76_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int battery = 0;

        System.out.println("Enter battery percentage : ");
        battery = sobj.nextInt();

        if (battery < 0 || battery > 100) 
        {
            System.out.println("Invalid input");
            return;   
        }

        System.out.println("Battery percentage : "+battery);

        if (battery <= 5) 
        {
            System.out.println("Status : Critical");
        }
        else if(battery <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }

        sobj.close();
    }
}

























// Time-8:17