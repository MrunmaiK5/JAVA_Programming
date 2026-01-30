package Assignment__60;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  MaxFile
//  Description:    Takes directory name and displays file having largest size
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program60_2
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String file2 = "";

        System.out.println("Enter directory name: ");
        file1 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.MaxFile(file1);
    }
}

class FileX
{
    public void MaxFile(String name)  throws Exception
    {
        String sRet = null;
        long Max = 0;
        
        File fobj1 = new File(name);
        
        if (fobj1.isDirectory() && fobj1.exists()) 
        {
            File Arr[] = fobj1.listFiles();

            for (int i = 0; i < Arr.length; i++) 
            {
                if (Arr[i].isFile()) 
                {
                    if (Arr[i].length() > Max) 
                    {
                        Max = Arr[i].length();
                        sRet = Arr[i].getName();
                    }      
                }
            } 
            System.out.println("Largest file is : "+sRet);
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}