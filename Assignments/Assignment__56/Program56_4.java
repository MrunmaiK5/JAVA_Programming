package Assignment__56;

import java.io.*;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  CreateFileX
//  Description:    Takes file name and content from user and writes content in the given file
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program56_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String fileName = "";

        System.out.println("Enter file name: ");
        fileName = sc.nextLine();

        FileX fobj = new FileX();
        fobj.CreateFileX(fileName);
    }
}

class FileX
{
    public void CreateFileX(String name)
    {
        //created an object of the File class that points to that path of file.
        File file = new File(name);

        if (file.exists() != true) 
        {
            try 
            {
                file.createNewFile();
                System.out.println("File created successfully!!");
            } 
            catch (Exception e) 
            {
                System.out.println("Unable to create file !");
            }
        }
        else
        {
            System.out.println("File already exist !");
        }   
    
    }
}
