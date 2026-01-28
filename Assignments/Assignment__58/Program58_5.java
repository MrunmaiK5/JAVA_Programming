package Assignment__58;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
    public static void main(String[] A) 
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
    public void WriteFileContent(String DName)
    {
        
        char Brr[] = new char[20];
        int iCnt = 0;
        int Size = 0;
        
        try 
        {
            File fobj = new File(DName);
            String filename = "Marvellous2.txt";
            BufferedWriter bfw = new BufferedWriter(new FileWriter(filename,true));
            

            if (fobj.isDirectory() == true) 
            {
                File Arr[] = fobj.listFiles();

                for(iCnt = 0; iCnt < Arr.length; iCnt++)
                {
                    BufferedReader bfr = new BufferedReader(new FileReader(Arr[iCnt]));
                    Size = bfr.read(Brr, 0, Brr.length);
                    bfw.write(Arr[iCnt].getName());
                    bfw.newLine();
                    bfw.write(Brr,0,Size);
                    String filesize = String.valueOf(Arr[iCnt].length());
                    bfw.write(filesize);
                    bfw.newLine();
                }
                bfw.close();
                System.out.println("Successfully written the files list in the Marvellous2.txt");
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