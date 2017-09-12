/*
******************************************************
*** Project 1
*** Daniel Flores
******************************************************
*** Created as part of Project 1
******************************************************
*** September 9, 2017
******************************************************
*** Original, no changes
******************************************************
 */
package danielfloresproject1;



public class DFProject1Queue
{
    public DFProject1LinkList start;
    public DFProject1LinkList end;
    private DFProject1LinkList root = null;
    
    public DFProject1Queue()
    {
        start = null;
        end = null;
    }
    
    public void enqueue(int value)
    {
        if (start == null)
        {
            DFProject1LinkList temp = new DFProject1LinkList();
            temp.value = value;
            start = temp;
            end = temp;
        }
        else
        {
            DFProject1LinkList temp = new DFProject1LinkList();
            temp.value = value;
            end.nextLL = temp;
            end = temp;
        }
    }
    
    public String display()
    {
        DFProject1LinkList temp = start;
        String tempNum;
        String tempDisplay = "";
        while(temp != null)
        {
            tempNum = Integer.toString(temp.value);
            tempDisplay += tempNum + ", ";
            temp = temp.nextLL;
        }
        
        return tempDisplay;
    }
    
    public DFProject1LinkList search(int value)
    {
        return reSearch(root, value);
    }
    
    private DFProject1LinkList reSearch(DFProject1LinkList Link, int value)
    {
        if (Link == null)
        {
            return Link;
        }
        if (Link.value == value)
        {
            return Link;
        }
        return reSearch(Link.nextLL, value);
    }
    
    public void delete(DFProject1LinkList toDelete)
    {
        reDelete(toDelete, root);
    }
    
    private void reDelete(DFProject1LinkList toDelete, DFProject1LinkList list)
    {
        if (list.nextLL == null)
        {
            return;
        }
        if (toDelete == list.nextLL)
        {
            list.nextLL = list.nextLL.nextLL;
        }
    }
}
