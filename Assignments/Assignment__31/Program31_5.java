package Assignment__31;

import java.util.Scanner;

class Program31_5
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
//  Date:           23/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i=0,j=0, iNo=0;

        if(iRow != iCol)
        {
            System.out.printf("Invalid Input\n");
            System.out.printf("Rows and columns should be same\n");
            return;
        }

        for(i=1; i<=iRow; i++)
        {
            for(j=1, iNo=1; j<=iCol; j++, iNo++)
            {
                if (i<=j)
                {
                    System.out.printf("%d\t",iNo);
                }
                else
                {
                    System.out.printf(" \t");
                }
            }
            System.out.printf("\n");
        }
    }
}