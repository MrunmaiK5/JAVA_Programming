package Assignment__79;

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name : Analyze
//  Description   : Show total booked seats, rows with maximum booked seats and vacant rows in cinema hall
//  Input         : Integer, Integer, Integer 
//  Output        : Nothing
//  Author        : Mrunmai Jitendra Khadpe
//  Date          : 04/03/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Program79_2 
{
    public static void Analyze(int row, int col, int Brr[][])
    {
        int i=0, j=0, iSum = 0, TotalBooked = 0, MaxRow = 0;
        int RowBooked[] = new int[row];
        boolean chkRow = false;

        // total booked seats
        for(i=0; i<row; i++)
        {
            iSum = 0;
            for(j=0; j<col; j++)
            {
                
                if (Brr[i][j] == 1) 
                {
                    TotalBooked++;
                    iSum = iSum + 1;
                }
            }

            if(iSum == col)
            {
                chkRow = true;
            }

            RowBooked[i] = iSum;
        }

        for(i=0; i<RowBooked.length; i++)
        {
            if (MaxRow < RowBooked[i]) 
            {
                MaxRow = i;
            }
            
        }

        System.out.println("Total booked seats : "+TotalBooked);
        System.out.println("Row with maximum bookings : "+(MaxRow+1));
        System.out.println("Full row exists : "+( chkRow==true ? "Yes" : "No"));

    }

    public static void main(String[] args) 
    {
        Scanner sobj =new Scanner(System.in);

        int R=0, C=0, i=0, j=0;

        System.out.println("Enter the number of rows in theatre : ");
        R=sobj.nextInt();

        System.out.println("Enter the number of columns in theatre : ");
        C=sobj.nextInt();

        if (R < 0 || C < 0) 
        {
            System.out.println("Invalid input");
            return;    
        }

        int Arr[][] = new int[R][C];

        System.out.println("Enter values for booked and free seats (Book : 1, free : 0) :");

        for(i=0; i<R; i++)
        {
            System.out.println("Enter values for row "+(i+1));
            for(j=0; j<C; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if (Arr[i][j] < 0 || Arr[i][j] > 1) 
                {
                    System.out.println("Invalid input");
                    return;    
                }
            }
        }


        Analyze(R,C,Arr);

        sobj.close();
    }    
}
