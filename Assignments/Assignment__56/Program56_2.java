package Assignment__56;

import java.io.*;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  ReadFileX
//  Description:    Takes file name and read contents from given file
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program56_2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String fileName = "";

        System.out.println("Enter file name: ");
        fileName = sc.nextLine();

        FileX fobj = new FileX();
        fobj.ReadFileX(fileName);

    }
}

class FileX
{
    public void ReadFileX(String name)
    {
        char Arr[] = new char[100];
        int iCnt = 0;

        File file = new File(name);

        if (file.exists() != true) 
        {
            System.out.println("File does not exist");
        }
        else
        {
            try 
            {
                BufferedReader bfr = new BufferedReader(new FileReader(name));

                bfr.read(Arr,0,Arr.length);

                for(iCnt = 0; iCnt<Arr.length; iCnt++)
                {
                    System.out.print(Arr[iCnt]);
                }

            } 
            catch (IOException e) 
            {
                System.out.println("Something went wrong");
            }
        }   
    }
}