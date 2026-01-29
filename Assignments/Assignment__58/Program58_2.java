package Assignment__58;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  WriteList
//  Description:    Takes directory name and writes list of file of that directory into the Marvellous.txt
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program58_2
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String DictName = "";

        System.out.println("Enter Dictionary name: ");
        DictName = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.WriteList(DictName);
    }
}

class FileX
{
    public void WriteList(String DName) throws Exception
    {
        int iCnt = 0;
        
        File fobj = new File(DName);

        String filename = "Marvellous.txt";
        FileOutputStream foobj = new FileOutputStream(filename);

        if ((fobj.isDirectory()) && (fobj.exists())) 
        {
            File Arr[] = fobj.listFiles();
            
            for (iCnt = 0; iCnt < Arr.length; iCnt++) 
            {
                String DictFiles = Arr[iCnt].getName();
                byte Brr[] = DictFiles.getBytes();
                foobj.write(Brr);

            }
            foobj.close();
            System.out.println("Written names successfully");
        }
        else
        {
            System.out.println("No such directory exist");
        }

    }
}