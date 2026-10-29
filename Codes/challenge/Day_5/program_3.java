package Day_5;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Calculate and return the sum of all elements in the array, 
//                using a data type that can handle very large integers
//  Input       : Array 
//  Output      : Array
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 12/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int iSize = 0, iSum=0;

        System.out.println("Enter size of array: ");
        iSize = sc.nextInt();

        System.out.println("Enter elements of array: ");
        
        int arr[] = new int[iSize];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int result[] = new int[iSize];

        for (int i = 0; i < arr.length; i++) 
        {
            iSum = iSum + arr[i];
            result[i] = iSum;
        }

        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i]+" ");
        }
    }
}
