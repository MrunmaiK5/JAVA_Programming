package Assignment__58;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  WriteList
//  Description:    Takes directory name and writes list of file of that directory into the Marvellous.txt
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program58_2
{
    public static void main(String[] A) 
    {
        Scanner sc = new Scanner(System.in);
        
        String DictName = "";

        System.out.println("Enter Dictionary name: ");
        DictName = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.WriteList(DictName);
    }
}

class FileX
{
    public void WriteList(String DName)
    {
        String Arr[] = new String[30];
        char Brr[] = new char[20];
        int iCnt = 0;
        int offset = 0;
        
        try 
        {
            File fobj = new File(DName);
            String filename = "Marvellous.txt";
            BufferedWriter bfw = new BufferedWriter(new FileWriter(filename,true));

            if (fobj.isDirectory() == true) 
            {
                Arr = fobj.list();

                for(iCnt = 0; iCnt < Arr.length; iCnt++)
                {
                    Brr = Arr[iCnt].toCharArray();
                    bfw.write(Brr,offset,Brr.length);
                    bfw.newLine();
                }
                bfw.close();
                System.out.println("Successfully written the files list in the Marvellous.txt");
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