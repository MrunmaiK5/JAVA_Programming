public class Program19_2 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name:  displayGrade
//  Description:    Displays grade of student based on marks.
//  Input:          Integer
//  Output:         Void
//  Author:         Mrunmai Jitendra Khadpe
//  Date:           01/11/20025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int marks)
    {
        if (marks>=0 && marks<=34) {
            System.out.println("Grade: E");
        }
        else if(marks>=35 && marks<=40)
        {
            System.out.println("Grade: D");
        }
        else if(marks>=41 && marks<=50)
        {
            System.out.println("Grade: C2");
        }
        else if(marks>=51 && marks<=60)
        {
            System.out.println("Grade: C1");
        }
        else if(marks>=61 && marks<=70)
        {
            System.out.println("Grade: B2");
        }
        else if(marks>=71 && marks<=80)
        {
            System.out.println("Grade: B1");
        }
        else if(marks>=81 && marks<=90)
        {
            System.out.println("Grade: A2");
        }
        else if(marks>=91 && marks<=100)
        {
            System.out.println("Grade: A1");
        }
        else
        {
            System.out.println("Invalid marks!");
        }

    }
}