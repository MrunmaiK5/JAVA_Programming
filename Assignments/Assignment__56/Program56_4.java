package Assignment__56;

import java.io.*;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  CreateFileX
//  Description:    Takes file name and content from user and writes content in the given file
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program56_4 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String fileName = "";

        System.out.println("Enter file name: ");
        fileName = sc.nextLine();

        FileX fobj = new FileX();
        fobj.CreateFileX(fileName);
    }
}

class FileX
{
    public void CreateFileX(String name) throws Exception
    {
        File fobj = null;

        fobj = new File(name);

        if (fobj.exists()) 
        {
            System.out.println("File already exists");
        }
        else
        {
            boolean bRet = fobj.createNewFile();
            if (bRet == true) 
            {
                System.out.println("File created successfully");
            }
            else
            {
                System.out.println("Uable to create file");
            }
        }

    }
}
