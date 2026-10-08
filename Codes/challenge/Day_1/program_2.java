import java.util.*;

class program_2
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        String word = "\0";

        word = sc.next();

        if(word.length() == 10)
        {
            char arr1[] = word.toCharArray();
            
            System.out.println(arr1[6]);
        }
    }
}