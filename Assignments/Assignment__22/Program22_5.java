import java.util.Scanner;

class Program22_5 
{
    public static void main(String[] args) 
    {
        int iCnt=0, iSize=0, iRet=0, iValue=0;
        Scanner sc=new Scanner(System.in);
        Logic lobj=new Logic();

        System.out.println("Enter no. of elements: ");
        iSize=sc.nextInt();

        int p[] = new int[iSize];
        System.out.println("Enter the elements: ");
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            p[iCnt]=sc.nextInt();
        }

        System.out.println("Enter the number to search: ");
        iValue=sc.nextInt();

        iRet=lobj.Frequency(p, iSize, iValue);

        System.out.println("Count of "+iValue+" is: "+iRet);

        lobj=null;
        sc=null;
        System.gc();
    }    
}

class Logic
{
    int Frequency(int Arr[], int iLength, int iNo)
    {
        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if (Arr[iCnt] == iNo) 
            {
                iCount++;    
            }
        }

        return iCount;
    }
}
