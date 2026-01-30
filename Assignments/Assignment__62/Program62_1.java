package Assignment__62;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  ReadBytes
//  Description:    Takes file name and returns bytes read from that file
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program62_1 
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";

        System.out.println("Enter file name whose content you want to copy: ");
        file1 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.ReadBytes(file1);
    }
}

class FileX
{
    public void ReadBytes(String filename)  throws Exception
    {
        int iRet = 0;
        
        File fobj1 = new File(filename);

        if (fobj1.exists() != true) 
        {
            System.out.println("File doesnt exist!");
            return;
        }

        FileInputStream bfr = new FileInputStream(fobj1);

        byte b = 0x00;

        while ((bfr.read()) != -1) 
        {
            iRet++;    
        }

        System.out.println("Total bytes read : "+ iRet);
        bfr.close();
    }
}