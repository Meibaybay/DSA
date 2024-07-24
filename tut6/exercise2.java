import java.lang.String;
public class exercise2 {
    public static void main(String[] args) {
        SLList1 list = new SLList1();
        list.add(new SLNode1(17));
        list.add(new SLNode1(22));
        list.add(new SLNode1(7));
        list.add(new SLNode1(13));
        list.add(new SLNode1(1));
        list.addAt(3, new SLNode1 (5));
        list.remove(2);
        list.print();
        SLList2 list1 = new SLList2();
        list1.add(new SLNode2("hihi"));
        list1.add(new SLNode2("banana"));
        list1.add(new SLNode2("orange"));

        int position = list1.search("banana"); // Tìm vị trí của chuỗi "banana"
        System.out.println("Position of 'banana': " + position);
    }
}
class SLNode1 {
    public int data;
    public SLNode1 next;
    public SLNode1 (int data) {
        this.data = data;
        this.next = null;
    }
    public void setNext (SLNode1 node) {
        this.next = node;
    }
    public SLNode1 getNext() {
        return this.next;
    }
    public int getData() {
        return this.data;
    }
    public void setData (int data) {
        this.data = data;
    }
}
class SLNode2 {
    public String data;
    public SLNode2 next;
    public SLNode2 (String data) {
        this.data = data;
        this.next = null;
    }
    public void setNext (SLNode2 node) {
        this.next = node;
    }
    public SLNode2 getNext() {
        return this.next;
    }
    public String getData() {
        return this.data;
    }
    public void setData (String data) {
        this.data = data;
    }
}
class SLList1 {
    private SLNode1 head;
    private int size;
    public SLList1() {
        head = null;
        size = 0;
    }
    public SLNode1 getHead() {
        return head;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int getLength() {
        return size;
    }
    public void add (SLNode1 newNode) {
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addAt ( int pos, SLNode1 newNode) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            SLNode1 prevNode = traversing(pos-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }
    private SLNode1 traversing (int pos) {
        SLNode1 current = head;
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
            SLNode1 prevNode = traversing(pos-1);
            SLNode1 posNode = traversing(pos);
            prevNode.next = posNode.next;
            removedNode = posNode.data;
        }
        size--;
    }
    public void removeALl() {
        head = null;
        size = 0;
    }
    public SLNode1 get(int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        return traversing(pos);
    }
    public void print() {
        System.out.println("Element of the SLList: ");
        SLNode1 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }


}
class SLList2 {
    private SLNode2 head;
    private int size;
    public SLList2() {
        head = null;
        size = 0;
    }
    public void add (SLNode2 newNode) {
        newNode.next = head;
        head = newNode;
        size++;
    }
    public int search(String data) {
        SLNode2 current = head;
        int position = 0;
        while (current != null) {
            if (current.data.equals(data)) {
                return position;
            }
            current = current.next;
            position++;
        }

        return -1;
    }
}

