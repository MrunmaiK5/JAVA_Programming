import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Calculate the total cost Chef must pay for the classes 
//                by multiplying the number of weeks by the cost per week.
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 10/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_4
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0;
        int X=0;
        int Y=0;
        String s = "";
        
        T = sc.nextInt();
        int result[] = new int[T];
        sc.nextLine();

        for(int i=0; i<T; i++)
        {
            s = sc.nextLine();

            String arr1[] = s.split(" ");
            
            X = Integer.parseInt(arr1[0]);
            Y = Integer.parseInt(arr1[1]);
            result[i] = X*Y;
        }

        for (int i = 0; i < result.length; i++) 
        {
            System.out.println(result[i]);
        }
    }
}