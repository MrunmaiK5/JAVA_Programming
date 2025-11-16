package Assignment__23;

import java.util.Scanner;

class Program23_5 
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

        iRet=lobj.Product(p, iSize);

        System.out.println("Product of odd numbers is: "+iRet);    
        
        lobj=null;
        sc=null;
        System.gc();
    }
}

class Logic
{
    int Product(int Arr[], int iLength)
    {
        int iCnt=0, iProduct=1;

        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if (Arr[iCnt]%2 != 0) 
            {
                iProduct=iProduct*Arr[iCnt];
            }
        }

        return iProduct;
    }
}