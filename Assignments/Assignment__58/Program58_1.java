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
        String Arr[] = new String[50];
        int iCnt = 0;
        
        try 
        {
            File fobj = new File(DName);

            if (fobj.isDirectory() == true) 
            {
                Arr = fobj.list();

                for(iCnt = 0; iCnt < Arr.length; iCnt++)
                {
                    File obj= new File(DName, Arr[iCnt]);

                    if (obj.isFile() == true) 
                    {
                        System.out.println(Arr[iCnt]);
                    }
                }
            }
            else
            {
                System.out.println("No such directory exist");
            }

        } 
        catch (Exception e) 
        {
            System.out.println("Something went wrong!!");
        }
    }
}