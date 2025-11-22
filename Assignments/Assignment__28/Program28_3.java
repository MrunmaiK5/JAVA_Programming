package Assignment__28;

import java.util.Scanner;

class Program28_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1=0, iValue2=0;

        System.out.println("Enter number of Rows: ");
        iValue1=sobj.nextInt();

        System.out.println("Enter number of Columns: ");
        iValue2=sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  Pattern
//  Description:    Displays a pattern.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           22/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i=0,j=0;
        char ch1='A';

        for(i=1, ch1='A'; i<=iRow; i++,ch1++)
        {
            for(j=1; j<=iCol; j++)
            {
                System.out.printf("%c\t",ch1);
            }
            System.out.println();
        }
    }
}