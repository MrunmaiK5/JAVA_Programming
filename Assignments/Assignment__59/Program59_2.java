package Assignment__59;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  DisplayRegFiles
//  Description:    Takes directory name and display regular files from directory
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program59_2
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String file2 = "";

        System.out.println("Enter directory name: ");
        file1 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.DisplayRegFiles(file1);
    }
}

class FileX
{
    public void DisplayRegFiles(String name)  throws Exception
    {
        int Size = 0;
        int iRet = 0;
        
        File fobj1 = new File(name);
        
        if (fobj1.isDirectory() && fobj1.exists()) 
        {
            File Arr[] = fobj1.listFiles();

            for (int i = 0; i < Arr.length; i++) 
            {
                if (Arr[i].isFile()) 
                {
                    System.out.println(Arr[i].getName());
                }  
            } 
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}