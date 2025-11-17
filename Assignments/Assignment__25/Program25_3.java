package Assignment__25;

import java.util.Scanner;

class Program25_3 
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

        lobj.Display(p, iSize);
        
        lobj=null; 
        sc=null;
        System.gc();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  Display
//  Description:    Displays the even numbers divisible by 5 from given array.
//  Input:          Integer array
//  Output:         Integer
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           17/11/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void Display(int Arr[], int iLength)
    {
        int iCnt=0;
        System.out.println("Even numbers divisible by 5 are: ");
        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if (0 == Arr[iCnt]%5 && 0 == Arr[iCnt]%2) 
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}