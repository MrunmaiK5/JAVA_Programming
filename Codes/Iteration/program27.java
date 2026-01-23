import java.util.Scanner;

class program27
{
    static void Display(int iFreq)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iFreq; iCnt++)
        {
            System.out.println("Jay Ganeesh...");
        }
    } 
    public static void main(String []A)
    {
        Scanner sc= new Scanner(System.in);

        int iValue=0;
        System.out.println("Enter the frequency: ");
        iValue = sc.nextInt();
        Display(iValue);
    }
}