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

class Program76_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int weight = 0;
        int amount = 0;

        System.out.println("Enter the weight of package : ");
        weight = sobj.nextInt();

        if (weight < 0) 
        {
            System.out.println("Invalid input");
            return;    
        }

        if(weight <= 50)
        {
            amount = 50 + (weight * 20);
        }
        else if(weight > 50)
        {
            amount = 150 + (weight*30); 
        }

        System.out.println("Parcel weight : "+weight);
        System.out.println("Courier charges : "+amount);

        sobj.close();
    }
}

























// Time-8:17