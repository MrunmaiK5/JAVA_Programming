import  java.util.*;

class Program22_1
{
    public static void main(String[] args) 
    {
        int iSize=0, iRet=0, iCnt=0;
        Scanner sc=new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter size of array: ");
        iSize=sc.nextInt();

        int p[] = new int[iSize];
        System.out.println("Enter the elements: ");
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            p[iCnt]=sc.nextInt();
        }

        iRet = lobj.CountEven(p, iSize);

        System.out.println("Count of even numbers is: "+iRet);

        lobj=null;
        sc=null;
        System.gc();
    }
}

class Logic
{
    int CountEven(int Arr[], int iLength)
    {
        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if(Arr[iCnt]%2 == 0)
            {
                iCount++;
            }
        }

        return iCount;
    } 
}