package Assignment__60;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  AddSize
//  Description:    Takes directory name and adds size of all files in it
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program60_1
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String file2 = "";

        System.out.println("Enter directory name: ");
        file1 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.AddSize(file1);
    }
}

class FileX
{
    public void AddSize(String name)  throws Exception
    {
        long lRet = 0;
        
        File fobj1 = new File(name);
        
        if (fobj1.isDirectory() && fobj1.exists()) 
        {
            File Arr[] = fobj1.listFiles();

            for (int i = 0; i < Arr.length; i++) 
            {
                if (Arr[i].isFile()) 
                {
                    lRet = lRet + Arr[i].length();
                }  
            } 
            System.out.println("Total size of files : "+lRet);
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}