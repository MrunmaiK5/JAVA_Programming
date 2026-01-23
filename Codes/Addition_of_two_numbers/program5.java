import java.util.Scanner;

class program5 {
    public static void main(String A[]) {
        Scanner sc = new Scanner(System.in);
        int i=0, j=0, ans=0;

        System.err.println("Enter no1: ");
        i=sc.nextInt();

        System.err.println("Enter no2: ");
        j=sc.nextInt();

        ans=i+j;

        System.out.println("Answer: "+ans);
    }
}
