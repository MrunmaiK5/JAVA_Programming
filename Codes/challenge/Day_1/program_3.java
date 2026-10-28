import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Calculate the number of clear days by subtracting the 
//                total rainy and cloudy days from the 7 days in a week.
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 08/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_3
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;

        String s = sc.nextLine();

        String arr1[] = s.split(" ");

        
        x=Integer.parseInt(arr1[0]);
        y=Integer.parseInt(arr1[1]);

        System.out.println(7 - (x+y));
    }
}