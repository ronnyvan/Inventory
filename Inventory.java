public class Inventory {
    public ListNode front;

    public Inventory() {
        front = null;
    }

    public void addItem(Item newItem) {
        ListNode newNode = new ListNode(newItem);
        
        if (front == null) {
            front = newNode;
            return;
        } else {
            ListNode x = front;
            while (x.hasNext()) {
                x = x.getNext();
            }
            x.setNext(newNode);
        }
    }

    public void removeUnavailableItems() {
        while( front != null && !((Item)front.getValue()).isInStock() ){
            front = front.getNext();
        }

        ListNode currNode = front;
        while(currNode != null && currNode.getNext() != null){
            ListNode nextNode = currNode.getNext();
            Item nextItem = (Item) nextNode.getValue();

            if(!nextItem.isInStock()) {currNode.setNext(nextNode.getNext());} 
            else {currNode = nextNode;}
        }
    }

    public String toString() {
        if (front == null) {
            return "Empty Inventory";
        }
    
        ListNode current = front;
        String result = "";
    
        while (current != null) {
            Item item = (Item) current.getValue();
            result += item.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }
}
