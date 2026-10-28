package Day_4;

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Check whether the given integer is a prime number by determining if it has 
//                exactly two factors: 1 and itself.
//  Input       : Integer 
//  Output      : Boolean
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 12/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_1
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0;
        int X=0;
        String s = "";
        
        T = sc.nextInt();
        int result[] = new int[T];
        sc.nextLine();

        for(int i=0; i<T; i++)
        {
            s = sc.nextLine();

            String arr1[] = s.split(" ");
            
            X = Integer.parseInt(arr1[0]);

            result[i] = X;
        }

        for (int i = 0; i < result.length; i++) 
        {
            if (result[i] == 1) 
            {
                System.out.println("no");
                continue;    
            }
            int j=0;
            for(j=2; j<result[i]/2; j++)
            {
                if (result[i] % j == 0) 
                {
                    System.out.println("no");    
                    break;
                }
            }
            if (j>=result[i]/2) 
            {
                System.out.println("yes");    
            }
        }
    }
}