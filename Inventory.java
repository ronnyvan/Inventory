
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
        ListNode currentNode = front;
        ListNode prev = null;
        while (currentNode != null) {
            Item currentItem = (Item) currentNode.getValue();
            if (currentItem.isInStock()) {
                if (prev != null) {
                    prev.setNext(currentNode);
                } else {
                    front = currentNode;
                }
                prev = currentNode;
            }
            currentNode = currentNode.getNext();
        }
        
        if (prev != null) {
            prev.setNext(null);
        } else {
            front = null;
        }
    }

    @Override
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
