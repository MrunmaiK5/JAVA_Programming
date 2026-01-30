
import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  AppendString
//  Description:    Takes file name and a string and append it at the end of the file
//  Input:          String, String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program61_3
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String str = "";

        System.out.println("Enter a file name : ");
        file1 = sc.nextLine();

        System.out.println("Enter string to write in file: ");
        str = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.AppendString(file1, str);
    }
}

class FileX
{
    public void AppendString(String src, String msg)  throws Exception
    {
        int iRet = 0;
        
        File fobj1 = new File(src);

        if (fobj1.exists() != true) 
        {
            fobj1.createNewFile();
        }

        FileOutputStream bfw = new FileOutputStream(fobj1,true);

        byte Arr[] = new byte[100];

        Arr = msg.getBytes();

        bfw.write(Arr, 0, msg.length());

        bfw.close();
        
        System.out.println("Written text successfully!");

    }
}