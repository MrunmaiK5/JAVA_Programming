package Day_4;

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Determine whether Janmansh can finish all 3 assignments before 10 pm by checking 
//                if he has at least 3 hours available from his starting time (X pm)
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 12/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_4
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0 ,X = 0, Y = 0;
        String s = "";
        
        T = sc.nextInt();

        String result[] = new String[T];
        sc.nextLine();

        for(int i=0; i<T; i++)
        {
            int iNo = 0;
            s = sc.nextLine();
            
            X = Integer.parseInt(s);

            if (X <= 7) 
            {
                result[i] = "Yes";
            }
            else
            {
                result[i] = "No";
            }
        }

        for (int i = 0; i < result.length; i++) 
        {
            System.out.println(result[i]);
        }
    }
}