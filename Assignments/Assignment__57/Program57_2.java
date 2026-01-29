package Assignment__57;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  isRegularX
//  Description:    Takes file name and check whether it is regular file or not
//  Input:          String, String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program57_2
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String file2 = "";

        System.out.println("Enter file name: ");
        file1 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.isRegularX(file1);
    }
}

class FileX
{
    public void isRegularX(String name)  throws Exception
    {
        int Size = 0;
        int iRet = 0;
        
        File fobj1 = new File(name);

        if (fobj1.isFile()) 
        {
            System.out.println("It is a regular file");
        }
        else
        {
            System.out.println("It is not a regular file");
        }
    }
}