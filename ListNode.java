
public class ListNode
{
    private Object value;
    private ListNode next;
    
    //constructor(s)
    public ListNode(Object val)
    {
        value = val;
        next = null;
    }
    
    public ListNode(Object val, ListNode nectNode)
    {
        value = val; 
        next = nectNode;
    }
    
    public Object getValue()
    {
        return value;
    }
    
    public ListNode getNext()
    {
        return next;
    }
    
    public boolean hasNext()
    {
        return (next != null);
    }
    
    public void setValue(Object newVal)
    {
        value = newVal;
    }
    
    public void setNext(ListNode newNext)
    {
        next = newNext;
    }
    public String toString() {
        return value.toString(); 
    }

}
