import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Determine whether the team has qualified for the next stage by checking if its points are 12 or more.
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 08/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_1
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        int iScore = 0;

        iScore = sc.nextInt();

        if(iScore < 12)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}