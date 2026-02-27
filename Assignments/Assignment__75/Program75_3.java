package Assignment__75;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description:    Calculates the charges based on total hours a vehicle stayed.
//  Input:          Integer 
//  Output:         Integer
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           27/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program75_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int CurrentStock = 0;
        int Requested = 0;

        System.out.println("Enter current stock : ");
        CurrentStock = sobj.nextInt();

        System.out.println("Enter the quantity needed : ");
        Requested = sobj.nextInt();

        if ((CurrentStock < 0) ||
            (Requested < 0)) 
        {
            System.out.println("Invalid input");
            return;
        }

        if (Requested > CurrentStock) 
        {
            System.out.println("Oreder failed : Insufficient Stock");
            return;
        }
        else
        {
            CurrentStock = CurrentStock - Requested;
            System.out.println("Order Processed Successfully"); 
        }

        if (CurrentStock < 5) 
        {
            System.out.println("Low Stock Alert");    
        }

        sobj.close();
    }
}