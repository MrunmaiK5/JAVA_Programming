// Singly CIrcular
class program447
{
    public static void main(String A[]) 
    {
        int iRet=0;
        SinglyCL obj = null;
        obj = new SinglyCL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        iRet=obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();

        iRet=obj.Count();
        System.out.println("Number of nodes are: "+iRet);
        
        obj.DeleteFirst();

        obj.Display();

        iRet=obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.DeleteLast();

        obj.Display();

        iRet=obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.InsertAtPos(105, 2);

        obj.Display();

        iRet=obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.DeleteAtPos(2);

        obj.Display();

        iRet=obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        //Important for memory deallocation
        obj=null;
        System.gc();
    }
}

class node
{
    public int data;
    public node next;

    public node(int no) 
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyCL
{
    private node first;
    private node last;
    private int iCount;

    public SinglyCL()
    {
        System.out.println("Object of SinglyCL gets created");
        this.first=null;
        this.last=null;
        this.iCount=0;
    }

    public void InsertFirst(int no)
    {
        node newn = null;
        newn = new node(no);

        if(this.first == null && this.last == null)
        {
            this.first = newn;
            this.last = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }

        this.last.next = this.first;
        this.iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = null;
        newn = new node(no);

        if(this.first == null && this.last == null)
        {
            this.first = newn;
            this.last = newn;
        }
        else
        {
            this.last.next = newn;
            this.last = newn; 
        }

        this.last.next = this.first;
        this.iCount++;
    }

    public void InsertAtPos(int no, int pos)
    {
        if(pos < 1 || pos > this.iCount+1)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            InsertFirst(no);
        }
        else if(pos == this.iCount+1)
        {
            InsertLast(no);
        }
        else
        {
            int iCnt = 0;
            node newn=null;
            newn = new node(no);

            node temp = null;
            temp = this.first;
            for(iCnt=1; iCnt<pos-1;iCnt++)
            {
                temp=temp.next;
            }

            newn.next=temp.next;
            temp.next = newn;

            iCount++;
        }
    }

    public void DeleteFirst()
    {
        node temp = null;

        if(this.first == null && this.last == null)
        {
            return;
        }
        else if(this.first == this.last)
        {
            this.first = null;
            this.last = null;
        }
        else
        {
            temp = this.first;
            this.first = temp.next;
        }
        this.last.next = this.first;
        this.iCount--;
    }

    public void DeleteLast()
    {
        node temp = null;

        if(this.first == null && this.last == null)
        {
            return;
        }
        else if(this.first == this.last)
        {
            this.first = null;
            this.last = null;
        }
        else
        {
            temp = this.first;
            while(temp.next.next != this.first)
            {
                temp=temp.next;
            }

            this.last = temp;
        }
        this.last.next = this.first;
        this.iCount--;
    }

    public void DeleteAtPos(int pos)
    {
        if(pos < 1 || pos > iCount)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            DeleteFirst();
        }
        else if(pos == iCount)
        {
            DeleteLast();
        }
        else
        {
            int iCnt = 0;
            node temp = null;
            node target = null;

            temp=this.first;
            for(iCnt = 1; iCnt<pos-1; iCnt++)
            {
                temp=temp.next;
            }

            target = temp.next;
            temp.next = target.next;

            iCount--;
        }
    }

    public void Display()
    {
        int iCnt=0;
        node temp = null;
        temp=this.first;

        for(iCnt=1; iCnt<=this.iCount; iCnt++)
        {
            System.out.print(" | "+temp.data+" | -> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
    }
}