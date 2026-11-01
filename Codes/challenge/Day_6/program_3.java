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
//  Description : Count the positive, negative, and zero elements in the array, then calculate and 
//                print each count divided by the total number of elements to 6 decimal places
//  Input       : Array 
//  Output      : Integer
//  Author      : Mrunmai Jitendra Khadpe
//  Date        : 31/10/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program_3 
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}


class Result 
{
    public static void plusMinus(List<Integer> arr) 
    {
    // Write your code here
        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;

        int pCnt = 0;
        int nCnt = 0;
        int zCnt = 0;

        for (int i = 0; i < arr.size(); i++) 
        {
            if (arr.get(i) > 0) 
            {
                pCnt++;    
            }
            else if(arr.get(i) < 0)
            {
                nCnt++;
            }
            else
            {
                zCnt++;
            }
        }

        System.out.println(pCnt+" "+nCnt+" "+zCnt);

        positive = (double)pCnt / arr.size();
        negative = (double)nCnt / arr.size();
        zero = (double)zCnt / arr.size();

        System.out.printf("%.6f%n",positive);
        System.out.printf("%.6f%n",negative);
        System.out.printf("%.6f%n",zero);
    }
}
