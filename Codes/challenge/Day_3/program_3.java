package Day_3;

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Calculate number of unattempted problems by subtracting the number of attempted problems from total beginner problems.
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 11/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_3
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
            
            X = Integer.parseInt(s);
            result[i] = X;
        }

        for (int i = 0; i < result.length; i++) 
        {
            if(result[i] == 6)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}