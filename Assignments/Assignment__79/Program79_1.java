package Assignment__79;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name : Analyze
//  Description   : Analyzes students performance ny using 2D array.
//  Input         : Integer, Integer, Integer 
//  Output        : Nothing
//  Author        : Mrunmai Jitendra Khadpe
//  Date          : 03/03/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program79_1 
{
    public static void Analyze(int std_no, int sub_no, int Arr[][])
    {
        int highestTotal = 0, i = 0, j = 0, iSum = 0;
        int Failed[]=new int[std_no];

        // Total marks of ach student and topper student
        System.out.println("Student Total : ");
        for(i=0; i<std_no; i++)
        {
            iSum = 0;
            for(j=0; j<sub_no; j++)
            {
                iSum = iSum + Arr[i][j];
                
            }

            System.out.println("Student "+(i+1)+" : "+iSum);

            if (highestTotal < iSum) 
            {
                highestTotal = i;
            }
        }

        System.out.println("Topper student : student "+highestTotal);

        System.out.println("Subject averages : ");
        for(i=0; i<sub_no; i++)
        {
            iSum = 0;
            for(j=0; j<std_no; j++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.println("Subject "+(i+1)+" : "+(iSum/std_no));
        }

        System.out.println("Failed students : ");
        for(i=0; i<std_no; i++)
        {
            for(j=0; j<sub_no; j++)
            {
                if (Arr[i][j] < 35) 
                {
                    System.out.println("Student : "+(Failed[i]+1));
                    break;    
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj =new Scanner(System.in);

        int Students = 0;
        int Subjects = 0;
        int i = 0, j=0;

        System.out.println("Enter number of students : ");
        Students = sobj.nextInt();

        System.out.println("Enter number of subjects : ");
        Subjects = sobj.nextInt();

        if (Students < 0 || Subjects < 0) 
        {
            System.out.println("Invalid input");
            return;    
        }

        int Marks[][] = new int[Students][Subjects];

        for(i=0; i<Students; i++)
        {
            System.out.println("Enter marks of student "+(i+1));
            for(j=0; j<Subjects; j++)
            {
                Marks[i][j] = sobj.nextInt();

                if (Marks[i][j] < 0 || Marks[i][j] > 100) 
                {
                    System.out.println("Invalid input");
                    return;  
                }
            }
        }

        Analyze(Students, Subjects, Marks);
    }    
}
