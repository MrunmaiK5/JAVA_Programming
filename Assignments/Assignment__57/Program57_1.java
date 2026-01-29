package Assignment__57;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  CopyX
//  Description:    Takes 2 file names and copy contents from one file to another file
//  Input:          String, String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program57_1 
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String file2 = "";

        System.out.println("Enter file name whose content you want to copy: ");
        file1 = sc.nextLine();

        System.out.println("Enter file name where you want to copy content: ");
        file2 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.CopyX(file1, file2);
    }
}

class FileX
{
    public void CopyX(String src, String dest)  throws Exception
    {
        int Size = 0;
        int iRet = 0;
        
        File fobj1 = new File(src);
        File fobj2 = new File(dest);

        if (fobj1.exists() != true) 
        {
            System.out.println(src + " file doesnt exist!");
            return;
        }
        if (fobj2.exists() != true) 
        {
            fobj2.createNewFile();
        }

        FileInputStream bfr = new FileInputStream(fobj1);
        FileOutputStream bfw = new FileOutputStream(fobj2);

        byte Arr[] = new byte[100];

        while ((iRet = bfr.read(Arr)) != -1) 
        {
            bfw.write(Arr,0,iRet);
        }
        bfw.close();
        bfr.close();
        System.out.println("Copied content successfully!!");

    }
}