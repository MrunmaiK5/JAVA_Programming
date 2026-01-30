package Assignment__59;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  DisplayPath
//  Description:    Takes directory name and displays file names and their absolute path on console
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program59_5
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String file2 = "";

        System.out.println("Enter directory name: ");
        file1 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.DisplayPath(file1);
    }
}

class FileX
{
    public void DisplayPath(String name)  throws Exception
    {
        File fobj1 = new File(name);
        
        if (fobj1.isDirectory() && fobj1.exists()) 
        {
            File Arr[] = fobj1.listFiles();

            for (int i = 0; i < Arr.length; i++) 
            { 
                if (Arr[i].isFile()) 
                {
                    System.out.println("Name : "+Arr[i].getName()+" Path : "+Arr[i].getAbsolutePath());
                }  
            } 

        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}