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
        
    }

}
