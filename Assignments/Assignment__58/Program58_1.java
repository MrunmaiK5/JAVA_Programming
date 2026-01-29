package Assignment__58;

import java.io.File;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  RegFileList
//  Description:    Takes directory name and writes list of regular files on console.
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program58_1
{
    public static void main(String[] A) 
    {
        Scanner sc = new Scanner(System.in);
        
        String DictName = "";

        System.out.println("Enter Dictionary name: ");
        DictName = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.RegFileList(DictName);
    }
}

class FileX
{
    public void RegFileList(String DName)
    {
        int iCnt = 0;

        File fobj = new File(DName);

        if (fobj.isDirectory() && fobj.exists()) 
        {
            File Arr[] = fobj.listFiles();

            for(iCnt = 0; iCnt < Arr.length; iCnt++)
            {
                if (Arr[iCnt].isFile() == true) 
                {
                    System.out.println(Arr[iCnt].getName());
                }
            }
        }
        else
        {
            System.out.println("No such directory exist");
        }
    }
}