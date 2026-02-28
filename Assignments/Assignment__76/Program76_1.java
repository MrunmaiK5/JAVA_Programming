package Assignment__76;

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

class Program76_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        String PeakHours = null;
        float Fare = 0.0f;

        System.out.println("Enter distance : ");
        Distance = sobj.nextInt();

        System.out.println("Peak hour : (Yes/No)");
        PeakHours = sobj.next();

        if (Distance < 0) 
        {
            System.out.println("Distance cannot be negative");
            return;    
        }

        Fare = 50;

        if (Distance <= 10) 
        {
            Fare = Fare + Distance * 12;    
        }

        if (Distance > 10) 
        {
            Fare = 170 + (Distance - 10) * 15;
        }

        if (PeakHours.equalsIgnoreCase("Yes")) 
        {
            Fare = Fare * 0.2f;
        }

        System.out.println("Distance : "+Distance+" Km");
        System.out.println("Peak hour : "+PeakHours);
        System.out.println("Total Fare : "+Fare);

        sobj.close();
    }
}