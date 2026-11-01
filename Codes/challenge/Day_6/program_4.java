package Day_6;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Description : Find the minimum and maximum sums by adding exactly four of the five integers, then 
//                print the minimum sum followed by the maximum sum
//  Input       : Array 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 31/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program_4 
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) 
    {
    // Write your code here

        long iMax = 0, iMin = 0;

        long result[] = new long[arr.size()];

        for (int i = 0; i < arr.size(); i++) 
        {
            long iSum = 0;
            for (int j = 0; j < arr.size(); j++) 
            {
                if (i==j) 
                {
                    continue;    
                }
                iSum = iSum + arr.get(j);
            }    
            result[i] = iSum;
        }

        iMax = result[0];
        iMin = result[0];

        for (int i = 0; i < result.length; i++) 
        {
            if (iMax < result[i]) 
            {
                iMax = result[i];
            }    
            if (iMin > result[i]) 
            {
                iMin = result[i];    
            }
        }

        System.out.println(iMin+" "+iMax);
    }

}
