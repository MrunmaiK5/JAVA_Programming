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

class Program75_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Totalhours = 0;
        int Fees = 0;
        
        System.out.println("Enter parking hours : ");
        Totalhours = sobj.nextInt();

        if(Totalhours < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Totalhours <= 2)
        {
            Fees = 20;
        }
        else if(Totalhours > 2)
        {
            Fees = 20 + (Totalhours - 2) * 10;
        }
        else if(Totalhours > 10)
        {
            Fees = 20 + 80 + (Totalhours - 10) * 50;
        }

        System.out.println("Total parking duration : "+Totalhours);
        System.out.println("Total parking fees : "+Fees);

        sobj.close();
    }
}