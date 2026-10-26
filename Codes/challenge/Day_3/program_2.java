package Day_3;

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Check whether the number rolled on the die (X) is 6 to determine if Chef can enter a new token into the game.
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 11/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_2
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