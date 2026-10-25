import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Check whether the average of A and B is strictly greater than C
//  Input       : Integer 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 10/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_3
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0;
        float X = 0, Y = 0, iAvg = 0;
        String s = "";
        
        T = sc.nextInt();
        String result[] = new String[T];
        sc.nextLine();

        for(int i=0; i<T; i++)
        {
            float iNo = 0.0f; 
            s = sc.nextLine();
            
            String arr[] = s.split(" ");

            X = Float.parseFloat(arr[0]);
            Y = Float.parseFloat(arr[1]);
            iAvg = Float.parseFloat(arr[2]);

            iNo = (X+Y)/2;

            System.out.println(iNo+" "+iAvg);

            if (iNo > iAvg) 
            {
                result[i] = "yes";
            }
            else
            {
                result[i] = "no";
            }
        }

        for (int i = 0; i < result.length; i++) 
        {
            System.out.println(result[i]);
        }
    }
}