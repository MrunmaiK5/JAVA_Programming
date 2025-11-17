package Assignment__24;

import java.util.Scanner;

class Program24_3 
{
    public static void main(String[] args) 
    {
        int iCnt=0, iRet=0, iSize=0;

        Scanner sc= new Scanner(System.in);
        Logic lobj=new Logic();

        System.out.println("Enter number of elements: ");
        iSize=sc.nextInt();

        int p[]=new int[iSize];

        System.out.println("Enter the elements: ");
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            p[iCnt] = sc.nextInt();
        }

        iRet=lobj.Difference(p, iSize);
        System.out.println("Difference between maximum and minimum number is: "+iRet);

        lobj=null; 
        sc=null;
        System.gc();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  Difference
//  Description:    Finds the Difference between maximum and minimum number in array.
//  Input:          Integer array
//  Output:         Integer
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           17/11/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    int Difference(int Arr[], int iLength)
    {
        int iCnt=0, iMax=Arr[0], iMin=Arr[0];

        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if (Arr[iCnt] >= iMax) 
            {
                iMax=Arr[iCnt];    
            }
            
            if(Arr[iCnt] <= iMin)
            {
                iMin=Arr[iCnt];
            }
        }

        return (iMax-iMin);
    }
}