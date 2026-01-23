import java.util.Scanner;

public class program6 {
    public static int Addition(int a, int b)
    {
        int sum=0;
        sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0, j=0, ans=0;

        System.out.println("No1: ");
        i=sc.nextInt();

        System.out.println("No2: ");
        j=sc.nextInt();
        
        ans=Addition(i,j);

        System.out.println(ans);
    }
}
