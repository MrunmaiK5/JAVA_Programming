package Assignment__57;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  CopyX
//  Description:    Takes 2 file names and copy contents from one file to another file
//  Input:          String, String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program57_1 
{
    public static void main(String[] A) 
    {
        Scanner sc = new Scanner(System.in);
        
        String file1 = "";
        String file2 = "";

        System.out.println("Enter file name whose content you want to copy: ");
        file1 = sc.nextLine();

        System.out.println("Enter file name where you want to copy content: ");
        file2 = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.CopyX(file1, file2);
    }
}

class FileX
{
    public void CopyX(String src, String dest)
    {
        try 
        {
            int Size = 0;
            char Arr[] = new char[50];                                          // Stores content read from source file

            File fobj1 = new File(src);
            File fobj2 = new File(dest);

            if (fobj1.exists() != true) 
            {
                System.out.println(src + " file doesnt exist!");
                return;
            }
            if (fobj2.exists() != true) 
            {
                fobj2.createNewFile();
            }

            BufferedReader bfr = new BufferedReader(new FileReader(src));
            BufferedWriter bfw = new BufferedWriter(new FileWriter(dest));

            Size = bfr.read(Arr,0,Arr.length);                              // reads source file contents

            bfw.write(Arr, 0, Size);                                        // writes content into destination file
            bfw.close();

            System.out.println("Copied content successfully!!");
        } 
        catch (Exception e) 
        {
            System.out.println("Something went wrong");
        }
    }
}