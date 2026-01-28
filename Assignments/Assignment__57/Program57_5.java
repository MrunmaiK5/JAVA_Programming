package Assignment__57;

import java.io.File;
import java.util.Scanner;

public class Program57_5
{
    public static void main(String[] A) 
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
    public void CreateDictX(String DName)
    {
        String Arr[] = new String[30];
        int iCnt = 0;
        try 
        {
            
            File fobj = new File(DName);

            if (fobj.isDirectory() == true) 
            {
                Arr = fobj.list();

                for (iCnt = 0; iCnt < Arr.length; iCnt++) 
                {
                    System.out.println(Arr[iCnt]+" "+Arr[iCnt].length());
                }
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