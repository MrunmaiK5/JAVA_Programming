import java.util.Scanner;

class Program26_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0;

        System.out.println("Enter number of elements: ");
        iValue=sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  Pattern
//  Description:    Displays a pattern.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           22/11/20025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt=0;
        char ch = 'A';

        for(iCnt=1; iCnt<=iNo; iCnt++, ch++)
        {
            System.out.printf("%c\t",ch);
        }
    }
}