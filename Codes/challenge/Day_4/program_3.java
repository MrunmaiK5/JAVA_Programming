package Day_4;

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Calculate the minimum total subscription cost by determining how many subscriptions 
//                are needed for N friends, with up to 6 people sharing each subscription, 
//                and multiplying that number by X rupees.
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 12/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_3
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0 ,X = 0, Y = 0;
        String s = "";
        
        T = sc.nextInt();

        int result[] = new int[T];
        sc.nextLine();

        for(int i=0; i<T; i++)
        {
            int iNo = 0;
            s = sc.nextLine();

            String arr1[] = s.split(" ");
            
            X = Integer.parseInt(arr1[0]);
            Y = Integer.parseInt(arr1[1]);

            iNo = (X-5)/6;

            result[i] = iNo*Y;
        }

        for (int i = 0; i < result.length; i++) 
        {
            System.out.println(result[i]);
        }
    }
}