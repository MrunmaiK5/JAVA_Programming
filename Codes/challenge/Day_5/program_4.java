package Day_5;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Determine whether the percentage of students who passed the exams is strictly greater 
//                than 50% by comparing the number of passed students with half of the total students
//  Input       : List 
//  Output      : List
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 12/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program_4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0 ,X = 0, Y = 0, Z = 0;
        String s = "";
        
        T = sc.nextInt();

        String result[] = new String[T];
        sc.nextLine();

        for(int i=0; i<T; i++)
        {
            float iNo = 0.0f;
            s = sc.nextLine();

            String arr1[] = s.split(" ");
            
            X = Integer.parseInt(arr1[0]);
            Y = Integer.parseInt(arr1[1]);
            Z = Integer.parseInt(arr1[2]);

            if (((X*Y)/2) < Z) 
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
