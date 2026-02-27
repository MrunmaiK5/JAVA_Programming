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

class Program75_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String helmet = null;
        String license= null;
        String overspeeding = null;

        int Fine = 0;

        System.out.println("Helmet worn : ");
        helmet = sobj.next();

        System.out.println("License available : ");
        license = sobj.next();

        System.out.println("Overspeeding : ");
        overspeeding = sobj.next();

        if (((helmet.equalsIgnoreCase("yes") == false) && (helmet.equalsIgnoreCase("no") == false)) || 
            ((license.equalsIgnoreCase("yes") == false) && (license.equalsIgnoreCase("no") == false)) || 
            ((overspeeding.equalsIgnoreCase("yes") == false) && (overspeeding.equalsIgnoreCase("no") == false))) 
        {
            System.out.println("Invalid input");
            return;
        }

        if (helmet.equalsIgnoreCase("no")) 
        {
            Fine = Fine + 500;
        }

        if (license.equalsIgnoreCase("no")) 
        {
            Fine = Fine + 1000;
        }
        
        if (overspeeding.equalsIgnoreCase("yes")) 
        {
            Fine = Fine + 1500;  
        }

        System.out.println("Total Fine Amount : "+Fine);

        sobj.close();
    }
}