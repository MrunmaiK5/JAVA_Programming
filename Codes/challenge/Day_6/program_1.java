package Day_6;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Create a new array of length 2n by copying the elements of nums twice in the same order
//  Input       : Array 
//  Output      : Array
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 31/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int iSize = 0;
        
        System.out.println("Enter the size of the array:");
        iSize = sc.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter the elemens : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();   
        }
        
        int result[] = new int[iSize*2];

        for (int i = 0; i < arr.length; i++) 
        {
            result[i] = arr[i];
            result[iSize+i] = arr[i];
        }

        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i]+" ");    
        }
    }
}