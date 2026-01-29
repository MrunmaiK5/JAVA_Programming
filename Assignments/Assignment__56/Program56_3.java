package Assignment__56;

import java.io.*;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  AppendFileContent
//  Description:    Takes file name and content from user and appends content in the given file
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program56_3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String fileName = "";

        System.out.println("Enter file name: ");
        fileName = sc.nextLine();

        FileX fobj = new FileX();
        fobj.AppendFileContent(fileName);
    }
}

class FileX
{
    public void AppendFileContent(String name) throws Exception
    {
        int iRet = 0;
        String str = null;
        File fobj = new File(name);
        FileOutputStream foobj = null;
        
        if (fobj.exists()) 
        {
            byte Arr[] = new byte[100];
            
            foobj = new FileOutputStream(fobj);
            str = "Jay Ganesh...";

            Arr = str.getBytes();

            foobj.write(Arr);

            System.out.println("Content written successfully!!");
        }
        else
        {
            System.out.println("File does not exists !");
        }
        foobj.close();
    }
}
