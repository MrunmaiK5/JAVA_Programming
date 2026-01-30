package Assignment__59;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  DisplayList
//  Description:    Takes directory name and writes list of file of that directory on the console
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program59_1
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String DictName = "";

        System.out.println("Enter Dictionary name: ");
        DictName = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.DisplayList(DictName);
    }
}

class FileX
{
    public void DisplayList(String DName) throws Exception
    {
        int iCnt = 0;
        
        File fobj = new File(DName);

        if ((fobj.isDirectory()) && (fobj.exists())) 
        {
            File Arr[] = fobj.listFiles();
            
            for (iCnt = 0; iCnt < Arr.length; iCnt++) 
            {
                System.out.println(Arr[iCnt].getName());
            }
        }
        else
        {
            System.out.println("No such directory exist");
        }

    }
}