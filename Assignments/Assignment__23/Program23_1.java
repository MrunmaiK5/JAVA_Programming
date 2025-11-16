package Assignment__23;
import java.util.Scanner;

class Program23_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize=0,  iCnt=0, iValue=0;
        boolean bRet=false;

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

        bRet=lobj.Check(p, iSize, iValue);

        if (bRet==true) {
            System.out.println(iValue+" is present");
        }
        else
        {
             System.out.println(iValue+" is not present");
        }
        
        lobj=null;
        sc=null;
        System.gc();
    }
}

class Logic
{
    boolean Check(int Arr[], int iLength,int iNo)
    {
        int iCnt=0;
        boolean bRes=false;

        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                bRes=true;
                break;
            }
        }

        return bRes;
    }
}