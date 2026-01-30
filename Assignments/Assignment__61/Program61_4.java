
import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  MergeFiles
//  Description:    Takes 3 file names and merge 2 files into other file
//  Input:          String, String, String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program61_4
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = null;
        String file2 = null;
        String FileOutput = null;

        System.out.println("Enter name of first file: ");
        file1 = sc.nextLine();

        System.out.println("Enter name of second file: ");
        file2 = sc.nextLine();

        System.out.println("Enter name of output file: ");
        FileOutput = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.MergeFiles(file1, file2, FileOutput);
    }
}

class FileX
{
    public void MergeFiles(String src1, String src2, String dest)  throws Exception
    {
        int iRet = 0;
        
        File fobj1 = new File(src1);
        File fobj2 = new File(src2);
        File fobj3 = new File(dest);

        if ((fobj1.exists() != true) && (fobj2.exists() != true)) 
        {
            System.out.println("File doesnt exist!");
        }

        if (fobj3.exists() != true) 
        {
            fobj1.createNewFile();
        }

        FileInputStream bfr1 = new FileInputStream(fobj1);
        FileInputStream bfr2 = new FileInputStream(fobj2);
        FileOutputStream bfw = new FileOutputStream(fobj3,true);

        byte Arr[] = new byte[100];

        while ((iRet = bfr1.read(Arr,0,Arr.length)) != -1) 
        {
            bfw.write(Arr, 0, iRet);
        }

        byte Brr[] = new byte[100];

        while ((iRet = bfr2.read(Arr,0,Arr.length)) != -1) 
        {
            bfw.write(Arr, 0, iRet);
        }

        bfw.close();
        
        System.out.println("Written text successfully!");

    }
}