import java.util.Scanner;

class Program22_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize=0, iRet=0, iCnt=0;

        System.out.println("Enter the number of elements: ");
        iSize=sc.nextInt();

        int p[] = new int[iSize];
        System.out.println("Enter the elements: ");
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            p[iCnt]=sc.nextInt();
        }

        iRet=lobj.Frequency(p, iSize);

        System.out.println("Difference between odd and even count is: "+iRet);


        lobj=null;
        sc=null;
        System.gc();
    }
}

class Logic
{
    int Frequency(int Arr[], int iLength)
    {
        int iDiff=0, iEvenCount=0,  iOddCount=0, iCnt=0;

        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if (Arr[iCnt]%2 == 0) 
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }

        iDiff=iOddCount-iEvenCount;

        return iDiff;
    }
}
