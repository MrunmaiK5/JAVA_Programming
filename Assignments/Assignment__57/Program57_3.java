package Assignment__57;

import java.io.File;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  CreateDictX
//  Description:    Takes a Directory name from user and creates the directory
//  Input:          String
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           28/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program57_3 
{
    public static void main(String[] A) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String DictName = "";

        System.out.println("Enter Dictionary name: ");
        DictName = sc.nextLine();

        FileX fxobj = new FileX();
        fxobj.CreateDictX(DictName);
    }
}

class FileX
{
    public void CreateDictX(String DName)  throws Exception
    {
        // create a directory in current working directory using mkdir
        // -> returns true if directory is created
        boolean fobj = new File(DName).mkdir();

        if (fobj == true) 
        {
            System.out.println("Directory created successfully !!");
        }
        else
        {
            System.out.println("Unable to create directory !");
        }
    }
}