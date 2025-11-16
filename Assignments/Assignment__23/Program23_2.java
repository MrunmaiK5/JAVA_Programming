package Assignment__23;

import java.util.Scanner;

class Program23_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize=0,  iCnt=0, iValue=0, iRet=0;

        System.out.println("Enter the number of elements: ");
        iSize=sc.nextInt();

        int p[] = new int[iSize];
        System.out.println("Enter the elements: ");
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            p[iCnt]=sc.nextInt();
        }

        System.out.println("Enter value to search: ");
        iValue=sc.nextInt();

        iRet=lobj.FirstOcc(p, iSize, iValue);

        System.out.println("First occurence of "+iValue+" is: "+iRet);    
        
        lobj=null;
        sc=null;
        System.gc();
    }
}

class Logic
{
    int FirstOcc(int Arr[], int iLength, int iNo)
    {
        int iCnt=0, iIndex=0;

        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if (Arr[iCnt] == iNo) 
            {
                iIndex=iCnt;
                break;    
            }
        }

        return iIndex;
    }
}