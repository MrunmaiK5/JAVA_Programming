package Assignment__62;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  WriteBytes
//  Description:    Takes file name and a number till which copy data into new file
//  Input:          String, Integer
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program62_2 
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = null;
        int no = 0;

        System.out.println("Enter file name whose content you want to copy: ");
        file1 = sc.nextLine();
        
        System.out.println("Enter no. of bytes to copy: ");
        no = sc.nextInt();

        FileX fxobj = new FileX();
        fxobj.ReadBytes(file1,no);
    }
}

class FileX
{
    public void ReadBytes(String filename,int size)  throws Exception
    {
        int iRet = 0;
        
        File fobj1 = new File(filename);

        if (fobj1.exists() != true) 
        {
            System.out.println("File doesnt exist!");
            return;
        }

        FileInputStream bfr = new FileInputStream(fobj1);
        FileOutputStream bfw = new FileOutputStream("Mrunmai1.txt");

        byte Arr[] = new byte[size];

        iRet = bfr.read(Arr,0,size);
        bfw.write(Arr, 0, iRet);  
          
        bfw.close();
        bfr.close();
        System.out.println("Copied contents successfully!");
        
    }
}