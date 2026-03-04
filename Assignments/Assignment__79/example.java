package Assignment__79;

import java.io.*;
import java.util.*;

public class example {

    public static void main(String[] args) 
    {
          /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sobj =new Scanner(System.in);

        int n =0;

        n = sobj.nextInt();

        String arr[] = new String[n];

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sobj.next();    
        }

        for (int i = 0; i < arr.length; i++) 
        {
            String str = arr[i];
            char a[] = str.toCharArray();

            for (int j = 0; j < a.length; j++) 
            {
                if (j%2 == 0)
                {
                    System.out.print(a[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < a.length; j++) 
            {
                if (j%2 != 0)
                {
                    System.out.print(a[j]);
                }
            }

            System.out.println();
        }
    }
}