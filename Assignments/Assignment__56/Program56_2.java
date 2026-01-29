package Assignment__56;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  ReadFileX
//  Description:    Takes file name and read contents from given file
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program56_2
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        
        String fileName = "";

        System.out.println("Enter file name: ");
        fileName = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.ReadFileX(fileName);
    }
}

class FileX
{
    public void ReadFileX(String name)  throws Exception
    {
        int iRet = 0;
        String str = null;
        File fobj = new File(name);
        FileInputStream fiobj = null;
        
        if (fobj.exists()) 
        {
            byte Arr[] = new byte[100];
            
            fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Arr,0,Arr.length)) != -1)
            {
                str = new String(Arr, 0, iRet);
                System.out.print(str);
                str = null;
            }            
            
        }
        else
        {
            System.out.println("File does not exists !");
        }
        fiobj.close();
    }
}