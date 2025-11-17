package Assignment__24;

import java.util.Scanner;

class Program24_5  
{
    public static void main(String[] args) 
    {
        int iCnt=0, iSize=0;

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

        lobj.DigitSum(p, iSize);
        
        lobj=null; 
        sc=null;
        System.gc();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  DigitSum
//  Description:    Display the summation od digits of the array elements.
//  Input:          Integer array
//  Output:         Integer
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           17/11/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void DigitSum(int Arr[], int iLength)
    {
        int iCnt=0, iDigit=0, iSum=0;

        System.out.println("Summation is: ");
        for(iDigit=0,iSum=0, iCnt=0; iCnt<iLength; iCnt++)
        {
            iSum=0;
            iDigit=0;
            while (Arr[iCnt] != 0)
            {
                iDigit=Arr[iCnt]%10;
                iSum = iSum+iDigit;
                Arr[iCnt]= Arr[iCnt]/10;   
            }
            System.out.println(iSum);
        }
    }
}