package Assignment__80;

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name : MagicSquare
//  Description   : Checks whether given matrix is magic square or not
//  Input         : Integer, Integer 
//  Output        : Boolean
//  Author        : Mrunmai Jitendra Khadpe
//  Date          : 04/03/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program80_2
{
    public static boolean MagicSquare(int row, int col, int Brr[][])
    {
        int i=0, j=0, iSumr = 0, iSumc = 0, dia1 = 0, dia2=0;
        boolean sumCol = false;
        boolean sumrow = false;

        int rowsum[] = new int[row];
        int colsum[] = new int[col];

        for(i=0; i<row; i++)
        {
            iSumr=0;
            iSumc=0;

            for(j=0; j<col; j++)
            {
                iSumr = iSumr + Brr[i][j];
                iSumc = iSumc + Brr[j][i];

                if (i == j) 
                {
                    dia1 = dia1 + Brr[i][j];
                }
            }
            rowsum[i] = iSumr;
            colsum[i] = iSumc;
        }

        for(i=0 ; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                if (j == col-i-1) 
                {
                    dia2 = dia2 + Brr[i][j];
                }   
            }
        }

        sumCol = true;
        sumrow = true;

        for(i=1; i<row; i++)
        {
            if (rowsum[i-1] != rowsum[i]) 
            {
                sumrow = false;
            }
            if (colsum[i-1] != colsum[i]) 
            {
                sumCol = false;
            }
        }

        if ((dia1 == dia2) &&
            (sumrow == true) &&
            (sumCol == true)) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[]) 
    {
        Scanner sobj =new Scanner(System.in);

        int r= 0, c = 0, i=0, j=0;
        boolean bRet = false;

        System.out.println("Enter number of rows : ");
        r = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        c = sobj.nextInt();

        if (r < 0 || c < 0) 
        {
            System.out.println("Invalid input");
            return;    
        }

        if (r != c) 
        {
            System.out.println("Matrix must be square");
            return;    
        }

        int Arr[][] = new int[r][c];

        System.out.println("Enter number of elements : ");
        
        for(i=0; i<r; i++)
        {
            System.out.println("Enter elements for row "+(i+1));
            for(j=0; j<c; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        bRet = MagicSquare(r,c,Arr);

        if (bRet) 
        {
            System.out.println("Matrix is magic square");    
        }
        else
        {
            System.out.println("Mtrix is not magic square");
        }

        sobj.close();
    }      
}
