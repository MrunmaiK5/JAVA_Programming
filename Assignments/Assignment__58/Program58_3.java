package Assignment__58;

import java.io.*;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  WriteFileContent
//  Description:    Takes directory name and writes contents of files from that directory 
//                  into the new file - Marvellous.txt
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program58_3
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String DictName = "";

        System.out.println("Enter Dictionary name: ");
        DictName = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.WriteFileContent(DictName);
    }
}

class FileX
{
    public void WriteFileContent(String DName) throws Exception
    {
       File fobj = new File(DName);
        
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        if ((fobj.exists()) && (fobj.isDirectory())) 
        {
            File Packobj = new File("Mrunmai1.txt");
            
            Packobj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(Packobj);

            FileInputStream fiobj = null;

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder:"+fArr.length);

            for(int i = 0; i<fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                while ((iRet = fiobj.read(Buffer)) != -1) 
                {
                    foobj.write(Buffer, 0, iRet);
                }
                System.out.println();

                fiobj.close();
            }
            foobj.close();
            
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}