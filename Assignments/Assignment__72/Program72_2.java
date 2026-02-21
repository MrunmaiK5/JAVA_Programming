package Assignment__72;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  Frequency
//  Description:    Counts the frequency of given number in matrix
//  Input:          Integer Integer
//  Output:         Integer
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           21/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program72_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of columns: ");
        int iCol = sobj.nextInt();

        matrix mobj = new matrix(iRow,iCol);

        mobj.Accept();

        System.out.println("Enter a number to search: ");
        int no = sobj.nextInt();

        System.out.println("Frequency is : "+mobj.Frequency(no));
    }
}

class matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public matrix(int a, int b)
    {
        iRow = a;
        iCol = b;
        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter array elements: ");

        for(int i=0; i<iRow; i++)
        {
            System.out.println("Enter elements for row "+(i+1)+" : ");
            for(int j=0; j<iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public int Frequency(int n)
    {
        int iCount = 0,i=0, j=0;

        for(i=0; i<iRow; i++)
        {
            for(j=0; j<iCol; j++)
            {
                if (n == Arr[i][j]) 
                {
                    iCount = iCount + 1;
                }
            }
        }

        return iCount;
    }
}
