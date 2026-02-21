package Assignment__72;

import java.util.Scanner;

class Program72_1 
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

        System.out.println("Summation of elements in diagonal : "+mobj.AddDiagonal());
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

    public int AddDiagonal()
    {
        int iSum = 0,i=0, j=0;

        for(i=0; i<iRow; i++)
        {
            for(j=0; j<iCol; j++)
            {
                if (i == j) 
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }
}
