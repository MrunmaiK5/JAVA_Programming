package Assignment__56;

import java.io.*;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  AppendFileContent
//  Description:    Takes file name and content from user and appends content in the given file
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program56_3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String fileName = "";

        System.out.println("Enter file name: ");
        fileName = sc.nextLine();

        FileX fobj = new FileX();
        fobj.AppendFileContent(fileName);
    }
}

class FileX
{
    public void AppendFileContent(String name)
    {
        Scanner sc = new Scanner(System.in);   
        String content = "";

        //created an object of the File class that points to that path of file.
        File file = new File(name);

        if (file.exists() != true) 
        {
            System.out.println("File does not exist");
        }
        else
        {
            try 
            {
                BufferedWriter bfo = new BufferedWriter(new FileWriter(name,true));

                bfo.flush();

                System.out.println("Enter content to write in a file: ");
                content = sc.nextLine();

                bfo.write(content, 0,content.length());
                bfo.close();

                System.out.println("Contents written successfully!!");
            } 
            catch (IOException e) 
            {
                System.out.println("Something went wrong");
            }
        }   
    
    }
}
