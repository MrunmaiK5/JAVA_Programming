package Assignment__75;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description:    Checks the eligibility of the cutomer for personal loan
//  Input:          Integer 
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           27/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program75_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int MonthlyIncome = 0;
        int CreditScore = 0;
        String ExistingLoan = null;
        
        System.out.println("Enter age : ");
        Age = sobj.nextInt();

        System.out.println("Enter monthly income : ");
        MonthlyIncome = sobj.nextInt();

        System.out.println("Enter credit score : ");
        CreditScore = sobj.nextInt();

        System.out.println("Enter Existing unpaid loan : ");
        ExistingLoan = sobj.next();

        if ((Age < 0) || 
            ((ExistingLoan.equalsIgnoreCase("Yes") == false) &&
            (ExistingLoan.equalsIgnoreCase("No") == false))
            ) 
        {
            System.out.println("Invalid input");
        }

        if (Age < 21 || Age > 60)
        {
            System.out.println("Loan rejected : Age must be between 21 to 60");
            return;
        }

        if (MonthlyIncome < 25000) 
        {
            System.out.println("Loan rejected : Monthly income should be more than 25000");
            return;
        }

        if (CreditScore < 700) 
        {
            System.out.println("Loan rejected : Credit score should be more than 700");
            return;
        }

        if (ExistingLoan.equalsIgnoreCase("Yes")) 
        {
            System.out.println("Loan rejected : There must be no exisiting unpaid loan");
            return;
        }

        System.out.println("Loan approved");

        sobj.close();
    }
}