package Assignment__57;

import java.io.File;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  ListFiles
//  Description:    Takes directory name and prints all the files and their size from the directory
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program57_5
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String DictName = "";

        System.out.println("Enter Dictionary name: ");
        DictName = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.ListFiles(DictName);
    }
}

class FileX
{
    public void ListFiles(String DName) throws Exception
    {
        int iCnt = 0;
        
        File fobj = new File(DName);

        if ((fobj.isDirectory()) && (fobj.exists())) 
        {
            File Arr[] = fobj.listFiles();

            for (iCnt = 0; iCnt < Arr.length; iCnt++) 
            {
                System.out.println("Name of file :"+Arr[iCnt].getName()+" File size : "+Arr[iCnt].length());
            }
        }
        else
        {
            System.out.println("No such directory exist");
        }


    }
}