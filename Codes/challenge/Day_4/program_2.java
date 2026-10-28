package Day_4;

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Calculate the maximum number of months Chef can rent the cooler by dividing the purchase 
//                cost by the monthly rent and ensuring the total rental cost is strictly less than Y
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 12/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_2
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0 ,X = 0, Y = 0, iMax = 0;
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

            iNo = Y/X;
            
            if(X>= Y)
            {
                result[i]=0;
                continue;
            }

            result[i] = iNo;
        }

        for (int i = 0; i < result.length; i++) 
        {
            System.out.println(result[i]);
        }
    }
}