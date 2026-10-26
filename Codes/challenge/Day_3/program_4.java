package Day_3;

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Determine whether the given string is easy to pronounce by checking if it contains fewer than four consecutive consonants.
//  Input       : String 
//  Output      : String
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 11/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program_4
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 0;
        int size=0;
        String name = "";
        String s = "";
        
        T = sc.nextInt();
        sc.nextLine();

        String result[] = new String[T];
        
        for(int i=0; i<T; i++)
        {
            int j = 0;
            s = sc.nextLine();
            
            size = Integer.parseInt(s);

            name = sc.nextLine();

            char arr[] = name.toCharArray();

            for (j = 0; j < size; j++) 
            {
                if (j> 4) 
                {
                    break;    
                }
                if (arr[j] == 'a' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u' || arr[j] == 'e') 
                {
                    result[i] = "Yes";
                    break;
                }
            }

            if (j>=4) 
            {
                result[i] = "No";    
            }

            if (size < 4) 
            {
                result[i] = "Yes";    
            }

        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}