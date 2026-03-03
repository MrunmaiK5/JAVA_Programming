
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

class Program78_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int days = 0, totalBill = 0;

        System.out.println("Enter total days : ");
        days=sobj.nextInt();

        if (days < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        totalBill = 3000 * days;

        if(days > 7)
        {
            totalBill = (totalBill * 50)/100;
        }

        System.out.println("Total stay duration : "+days);
        System.out.println("Final bill amount : "+totalBill);

        sobj.close();
    }
}