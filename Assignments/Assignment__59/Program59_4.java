package Assignment__59;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  CountFile
//  Description:    Takes directory name and count number of files and sub directories
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program59_4
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String file2 = "";

        System.out.println("Enter directory name: ");
        file1 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.CountFile(file1);
    }
}

class FileX
{
    public void CountFile(String name)  throws Exception
    {
        int DictCount = 0;
        int FileCount = 0;
        
        File fobj1 = new File(name);
        
        if (fobj1.isDirectory() && fobj1.exists()) 
        {
            File Arr[] = fobj1.listFiles();

            for (int i = 0; i < Arr.length; i++) 
            {
                if (Arr[i].isDirectory()) 
                {
                    DictCount+=1;
                }  
                if (Arr[i].isFile()) 
                {
                    FileCount += 1;
                }  
            } 

            System.out.println("Count of directories : "+DictCount);
            System.out.println("Count of files : "+FileCount);
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}