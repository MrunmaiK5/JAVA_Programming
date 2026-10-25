import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Calculate the minimum amount to invest by finding the difference between 
//                your annual income (X) and the tax-free income limit (Y).
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 10/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_1
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        int X=0;
        int Y = 0;
        int T = 0;
        String s = "";
        
        T = sc.nextInt();
        int result[] = new int[T];
        sc.nextLine();

        for(int i=0; i<T; i++)
        {
            s = sc.nextLine();
            String arr[] = s.split(" ");

            X=Integer.parseInt(arr[0]);
            Y=Integer.parseInt(arr[1]);

            result[i] = X-Y;
        }

        for (int i = 0; i < result.length; i++) 
        {
            System.out.println(result[i]);   
        }
    }
}