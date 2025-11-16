import java.util.Scanner;

class Program22_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize=0,  iCnt=0;
        boolean bRet=false;

        System.out.println("Enter the number of elements: ");
        iSize=sc.nextInt();

        int p[] = new int[iSize];
        System.out.println("Enter the elements: ");
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            p[iCnt]=sc.nextInt();
        }

        bRet=lobj.Check(p, iSize);

        if (bRet==true) {
            System.out.println("11 is present");
        }
        else
        {
             System.out.println("11 is present");
        }
        
        lobj=null;
        sc=null;
        System.gc();
    }
}


class Logic
{
    boolean Check(int Arr[], int iLength)
    {
        int iCnt=0;
        boolean bFlag=false;

        for(iCnt=0; iCnt<iLength;iCnt++)
        {
            if (11==Arr[iCnt]) {
                bFlag=true;
                break;
            }
        }

        return bFlag;
    }
}