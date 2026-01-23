import java.util.Scanner;

public class program12 {
    static void CheckEvenOdd(int iNo)
    {
        if (iNo%2 == 0) {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int iValue=0;

        System.out.println("Enter a number: ");
        iValue=sc.nextInt();

        CheckEvenOdd(iValue);
    }
}
