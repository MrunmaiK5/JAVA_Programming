package Assignment__58;

import java.io.*;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  WriteFileContent
//  Description:    Takes directory name and writes contents of files along with its name
//                  from that directory into the new file - Marvellous.txt
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program58_5
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
            File Packobj = new File("Mrunmai2.txt");
            
            Packobj.createNewFile();

            FileInputStream fiobj = null;
            FileOutputStream foobj = new FileOutputStream(Packobj,true);

            File fArr[] = fobj.listFiles();

            for(int i = 0; i<fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                while ((iRet = fiobj.read(Buffer)) != -1) 
                {
                    String DictName = fArr[i].getName();
                    byte Brr[] = DictName.getBytes();
                    foobj.write(Brr);

                    foobj.write(Buffer, 0, iRet);
                    
                    String Size = String.valueOf(fArr[i].length());
                    byte Srr[] = Size.getBytes();
                    foobj.write(Srr);
                }
                fiobj.close();
            }
            foobj.close();
            System.out.println("Successfully writen the content");   
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}