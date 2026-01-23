import java.util.Scanner;

public class program9 {
    static float AdditionTwoNumbers(float fNo1, float fNo2)
    {
        float fSum=0.0f;

        if(fNo1<0.0f){
            fNo1=-fNo1;
        }

        if(fNo2<0.0f){
            fNo2=-fNo2;
        }

        fSum=fNo1+fNo2;
        return fSum;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        float fValue1=0.0f, fValue2=0.0f, fRet=0.0f;

        System.out.println("Enter 1st no: ");
        fValue1=sc.nextFloat();

        System.out.println("Enter 2nd no: ");
        fValue2=sc.nextFloat();

        fRet=AdditionTwoNumbers(fValue1, fValue2);

        System.out.println(fRet);
    }
}
