package Assignment__21;

public class Program21_4 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.countFactors(20); 
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  countFactors
//  Description:    Counts the factors of the given number.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countFactors(int num)
    {
        int iFrequency=0;
        
        for(int iCnt=1; iCnt<(num/2); iCnt++)
        {
            if (num%iCnt == 0) {
                iFrequency++;
            }
        }

        System.out.println("Count: "+iFrequency);
    }
}