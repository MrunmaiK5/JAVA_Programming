import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Check whether Chef’s rank is within the top 10 contestants 
//                to determine if he qualifies for the finals.
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 10/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_2
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0;
        int rank = 0;
        String s = "";
        
        T = sc.nextInt();
        int result[] = new int[T];
        sc.nextLine();

        for(int i=0; i<T; i++)
        {
            s = sc.nextLine();
            
            rank = Integer.parseInt(s);

            result[i] = rank;
        }

        for (int i = 0; i < result.length; i++) 
        {
            if (result[i] <= 10) 
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