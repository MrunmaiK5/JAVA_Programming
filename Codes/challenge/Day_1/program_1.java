import java.util.*;

class program_1
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        int iScore = 0;

        iScore = sc.nextInt();

        if(iScore < 12)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}