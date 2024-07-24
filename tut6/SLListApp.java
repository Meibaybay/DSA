
public class SLListApp {
    public static void main(String[] args) {
        SLList list = new SLList();
        list.add(new SLNode(17));
        list.add(new SLNode(22));
        list.add(new SLNode(7));
        list.add(new SLNode(13));
        list.add(new SLNode(1));
        list.addAt(3, new SLNode (5));
        list.remove(2);
        list.print();
    }
}
class SLNode {
    public int data;
    public SLNode next;
    public SLNode (int data) {
        this.data = data;
        this.next = null;
    }
    public void setNext (SLNode node) {
        this.next = node;
    }
    public SLNode getNext() {
        return this.next;
    }
    public int getData() {
        return this.data;
    }
    public void setData (int data) {
        this.data = data;
    }
}
class SLList {
    private SLNode head;
    private int size;
    public SLList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public int getLength() {
        return size;
    }
    public void add (SLNode newNode) {
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addAt ( int pos, SLNode newNode) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            SLNode prevNode = traversing(pos-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }
    private SLNode traversing (int pos) {
        SLNode current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return current;
    }
    public void remove (int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        int removedNode;
        if (pos == 0) {
            removedNode = head.data;
            head = head.next;
        } else {
            SLNode prevNode = traversing(pos-1);
            SLNode posNode = traversing(pos);
            prevNode.next = posNode.next;
            removedNode = posNode.data;
        }
        size--;
    }
    public void removeALl() {
        head = null;
        size = 0;
    }
    public SLNode get(int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        return traversing(pos);
    }
    public void print() {
        System.out.println("Element of the SLList: ");
        SLNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
