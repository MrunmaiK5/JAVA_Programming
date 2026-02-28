package Assignment__76;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description:    Checks the eligibility for the scholarship of students.
//  Input:          Integer 
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program76_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int Income =0;

        System.out.println("Enter marks (percentage) : ");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendance (percentage) : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Family Income (percentage) : ");
        Income = sobj.nextInt();

        if ((Marks < 0 || Marks > 100) ||
            (Attendance < 0 || Attendance > 100) ||
            (Income < 0)) 
        {
            System.out.println("Invalid input");
            return;    
        }

        if (Marks < 80) 
        {
            System.out.println("Scholarship rejected : Marks should be more than 80%");
            return;    
        }

        if (Attendance < 75) 
        {
            System.out.println("Scholarship rejected : Attendance should be more than 75%");
            return;     
        }

        if (Income > 300000) 
        {
            System.out.println("Scholarship rejected : Family Income should be less than Rs.300000");
            return;     
        }

        System.out.println("Scholarship Approved");

        sobj.close();
    }
}

























// Time-8:17