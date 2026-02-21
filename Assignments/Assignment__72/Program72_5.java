package Assignment__72;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  SwapRows
//  Description:    Swaps the elements from consecutive rows
//  Input:          Integer 
//  Output:         Nothing
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           21/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program72_5
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

        mobj.SwapRows();

        mobj.Display();
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

    public void Display()
    {
        for(int i=0; i<iRow; i++)
        {
            for(int j=0; j<iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void SwapRows()
    {
        int i=0, j=0, temp = 0;

        for(i=1; i<iRow; i = i+2)
        {
            for(j=0; j<iCol; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i-1][j];
                Arr[i-1][j] = temp;
            }  
        }
    }
}
