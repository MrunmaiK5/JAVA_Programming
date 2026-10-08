import java.util.*;

class program_2
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;

        String s = sc.nextLine();

        String arr1[] = s.split(" ");

        
        x=Integer.parseInt(arr1[0]);
        y=Integer.parseInt(arr1[1]);

        System.out.println(7 - (x+y));
    }
}