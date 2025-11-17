package Assignment__23;

import java.util.Scanner;

class Program23_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize=0,  iCnt=0, iValue=0, iStart=0, iEnd=0;

        System.out.println("Enter the number of elements: ");
        iSize=sc.nextInt();

        int p[] = new int[iSize];
        System.out.println("Enter the elements: ");
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            p[iCnt]=sc.nextInt();
        }

        System.out.println("Enter the start of range: ");
        iStart=sc.nextInt();

        System.out.println("Enter the end of range: ");
        iEnd=sc.nextInt();

        lobj.Range(p, iSize, iValue, iStart, iEnd);
        
        lobj=null;
        sc=null;
        System.gc();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  Range
//  Description:    Returns the elements from array that are in the provided range.
//  Input:          Integer array
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           16/11/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void Range(int Arr[], int iLength, int iNo, int iStart, int iEnd)
    {
        int iCnt=0;
        System.out.println("Range of numbers: ");
        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if (Arr[iCnt]>=iStart && Arr[iCnt] <= iEnd) 
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}