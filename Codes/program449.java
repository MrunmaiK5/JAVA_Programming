//Doubly Circular
class program449
{
    public static void main(String A[]) 
    {
        int iRet=0;
        DoublyCL obj = null;
        obj = new DoublyCL();

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
    public node prev;

    public node(int no) 
    {
        this.data = no;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCL
{
    private node first;
    private node last;
    private int iCount;

    public DoublyCL()
    {
        System.out.println("Object of DoublyCL gets created");
        this.first=null;
        this.last=null;
        this.iCount=0;
    }

    public void InsertFirst(int no)
    {
        node newn = null;
        newn = new node(no);

        if (this.first == null && this.last == null) 
        {
            this.first = newn;
            this.last = newn;   
        }
        else
        {
            newn.next = this.first; 
            this.first = newn;
            newn.next.prev = newn;
        }

        this.last.next = this.first;
        this.first.prev = this.last;
        this.iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = null;
        newn = new node(no);

        if (this.first == null && this.last == null) 
        {
            this.first = newn;
            this.last = newn;   
        }
        else
        {
            this.last.next = newn;
            newn.prev = this.last;
            this.last = newn;
        }

        this.last.next = this.first;
        this.first.prev = this.last;
        this.iCount++;
    }

    public void InsertAtPos(int no, int pos)
    {
        int iCnt = 0;
        node temp = null;

        if (pos < 1 || pos > iCount+1) 
        {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) 
        {
            this.InsertFirst(no);  
        }
        else if(pos == iCount+1)
        {
            this.InsertLast(no);
        }
        else
        {
            node newn = null;
            newn = new node(no);

            temp = first;

            for(iCnt = 1; iCnt<pos-1; iCnt++)
            {
                temp=temp.next;
            }

            newn.next = temp.next;
            newn.next.prev= newn;

            newn.prev=temp;
            temp.next=newn;

            this.iCount++;
        }
    }

    public void DeleteFirst()
    {
        if (this.first == null && this.last == null) 
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
            this.first = this.first.next;
        }

        this.last.next = this.first;
        this.first.prev = this.last;
        this.iCount--;
    }

    public void DeleteLast()
    {
        if (this.first == null && this.last == null) 
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
            this.last = this.last.prev;
        }

        this.last.next = this.first;
        this.first.prev = this.last;
        this.iCount--;
    }

    public void DeleteAtPos(int pos)
    {
        int iCnt = 0;
        node temp = null;

        if (pos < 1 || pos > iCount) 
        {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) 
        {
            this.DeleteFirst();  
        }
        else if(pos == iCount)
        {
            this.DeleteLast();
        }
        else
        {
            temp = this.first;

            for(iCnt = 1; iCnt<pos-1; iCnt++)
            {
                temp=temp.next;
            }

            temp.next=temp.next.next;
            temp.next.prev = temp;

            this.iCount--;
        }
    }

    public void Display()
    {
        node temp = null;
        temp = this.first;

        do
        {
            System.out.print(" | "  + temp.data + " | <=> ");
            temp=temp.next;
        }while(temp != this.last.next);
        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
    }
}